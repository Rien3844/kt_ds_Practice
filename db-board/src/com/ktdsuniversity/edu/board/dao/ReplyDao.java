package com.ktdsuniversity.edu.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

/**
 * Dao : Data Access Object - Java에서 DB로 데이터 생성, 수정, 삭제, 조회를 하기 위한 클래스. =>
 * Java에서 DB로 접근하기 위한 클래스.
 */
public class ReplyDao {

	private DataAccessHelper dah;

	public ReplyDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public int createNewComment(ReplyVO newArticle) {

		// 1. ojdbc11.jar 파일이 프로젝트에 존재하는지 확인.
		try {
			// oracle.jdbc.driver.OracleDriver 클래스를 불러온다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 데이터베이스에 접속하기 위한 라이브러리가 없습니다.");
			return 0;
		}

		// 2. OracleDB에 접속.
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "BOARD", "BOARD");
			// MANUAL COMMIT 으로 변경. ==> 전부 수동으로 커밋하겠다.
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결을 할 수 없습니다.");
			System.out.println("사유 : " + e.getMessage());
			return 0;
		}

		// 3. INSERT Query 작성.
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO BOARD.REPLY                                                        ");
		query.append(" (ID                                                                           ");
		query.append(", BOARD_ID                                                                     ");
		query.append(", TOP_ID                                                                       ");
		query.append(", CONTENT                                                                      ");
		query.append(", WRITE_DATE)                                                                  ");
		query.append("VALUES                                                                         ");
		query.append(" ('RP-' || TO_CHAR(SYSDATE, 'YYYYMMDD-') || LPAD(SEQ_REPLY_PK.NEXTVAL, 6, '0') ");
		query.append(", ?                                                                            ");
		query.append(", 'RP-' || TO_CHAR(SYSDATE, 'YYYYMMDD-') || LPAD(SEQ_REPLY_PK.NEXTVAL, 6, '0') ");
		query.append(", ?                                                                            ");
		query.append(", SYSDATE)                                                                     ");

		// 3-1. ?에 데이터 할당하기.
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(query.toString());
			pstmt.setString(1, newArticle.getBoardId());
			pstmt.setString(2, newArticle.getContent());
		} catch (SQLException e) {
			// pstmt의 파이프가 만들어져있는 상태에서 예외가 발생했다면 닫는다.
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
				}
			}

			// 연결된 Connection을 닫는다.
			try {
				connection.close();
			} catch (SQLException e1) {
			}

			// 1. 데이터베이스와 연결이 끊어져있을 때
			// 2. 작성된 쿼리의 내용이 잘못되었을 때
			System.out.println("Query 내용에 문제가 있습니다.");
			System.out.println("사유 : " + e.getMessage());

			return 0;
		}
		// 4. INSERT Query 실행.
		try {
			int insertCount = pstmt.executeUpdate();
			// Commit 수행.
			connection.commit();
			return insertCount;
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
			}
			// 1. Insert 쿼리에 파라미터 할당이 잘못되었을 때 (ex) ?는 2개인데, 할당한 데이터는 1개일 때,
			// 2. PK가 중복되었을 때
			// 3. 컬럼의 타입과 INSERT 하는 갓이 다를 때
			// 4. 컬럼이 허용하는 최대 길이보다 값의 길이가 더 클 때
			System.out.println("쿼리 실행을 실패했습니다.");
			System.out.println("사유 : " + e.getMessage());
			return 0;

		}

		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
			}

			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
	}

	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회 (대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllReplies(String articleId) {

		List<ReplyVO> result = new ArrayList<>();

		dah.preparedStatement(ReplyQuery.makeSelectAllQuery(), (pstmt) -> {
			pstmt.setString(1, articleId);
		});
		dah.executeQuery(SQLType.SELECT, rs -> {
			ReplyVO eachReply = new ReplyVO();
			eachReply.setId(rs.getString("ID"));
			eachReply.setBoardId(rs.getString("BOARD_ID"));
			eachReply.setTopId(rs.getString("TOP_ID"));
			eachReply.setContent(rs.getString("CONTENT"));
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));
			result.add(eachReply);
		});
		return result;

	}

	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readOneReply(String articleId) {
		ReplyVO result = new ReplyVO();

		dah.preparedStatement(ReplyQuery.makeSelectOneQuery(), (pstmt) -> {
			pstmt.setString(1, articleId);
		});

		dah.executeQuery(SQLType.SELECT, rs -> {
			result.setId(rs.getString("ID"));
			result.setBoardId(rs.getString("BOARD_ID"));
			result.setTopId(rs.getString("TOP_ID"));
			result.setContent(rs.getString("CONTENT"));
			result.setWriteDate(rs.getString("WRITE_DATE"));
		});

		return result;
	}

	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회(대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllRepliesByReplyId(String articleId) {

		List<ReplyVO> result = new ArrayList<>();

		dah.preparedStatement(ReplyQuery.makeSelectAllQueryByReplyId(), (pstmt) -> {
			pstmt.setString(1, articleId);
		});

		dah.executeQuery(SQLType.SELECT, rs -> {
			ReplyVO eachReply = new ReplyVO();
			eachReply.setId(rs.getString("ID"));
			eachReply.setBoardId(rs.getString("BOARD_ID"));
			eachReply.setTopId(rs.getString("TOP_ID"));
			eachReply.setContent(rs.getString("CONTENT"));
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));
			result.add(eachReply);
		});
		return result;

	}

	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newArticle) {

		dah.preparedStatement(ReplyQuery.makeInsertQuery(), (pstmt) -> {
			pstmt.setString(1, newArticle.getBoardId());
			pstmt.setString(2, newArticle.getTopId());
			pstmt.setString(3, newArticle.getContent());
		});

		dah.executeQuery(SQLType.INSERT, null);
	}

	// void 댓글 수정(ReplyVO)
	public void modifyReply(ReplyVO modifyReply) {

		dah.preparedStatement(ReplyQuery.makeUpdateQuery(), (pstmt) -> {
			pstmt.setString(1, modifyReply.getId());
			pstmt.setString(2, modifyReply.getContent());
		});

		dah.executeQuery(SQLType.UPDATE, null);
	}

	// void 댓글 삭제(댓글 아이디)
	public void deleteReply(String articleId) {

		dah.preparedStatement(ReplyQuery.makeDeleteQuery(), (pstmt) -> {
			pstmt.setString(1, articleId);
		});

		dah.executeQuery(SQLType.DELETE, null);

	}

}

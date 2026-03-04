package com.ktdsuniversity.edu.board;

import java.util.List;

import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.service.BoardService;
import com.ktdsuniversity.edu.board.service.ReplyService;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class TestMain {

	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		
		// 게시글 작성. (DB 게시글 생성.)
		BoardVO newArticle = new BoardVO();
		newArticle.setTitle("새로운 게시글입니다.");
		newArticle.setContent("새로운 게시글의 내용입니다.");

		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		
		BoardService boardService = new BoardService(dah);
		boardService.createNewArticle2(newArticle);
		//System.out.println(insertCount + "개의 게시글이 생성되었습니다.");
		
		BoardVO modifyArticle = new BoardVO();
		modifyArticle.setId("BO-20260303-000013");
		modifyArticle.setTitle("제목이 수정되었습니다.");
		modifyArticle.setContent("내용이 수정되었습니다.");
		
		boardService.modifyArticle(modifyArticle);
		
		boardService.deleteArticle("BO-20260303-000002");
		
		// 게시글 조회(BO-20260303-000049)
		BoardVO article = boardService.readArticle("BO-20260303-000049");
		System.out.println(article);
		
		// 게시글 전체 조회
		List<BoardVO> allArticle = boardService.readAllArticle();
		System.out.println(allArticle);	
		
		
		
		
		
		
		
		
		
		
		ReplyService replyService = new ReplyService(dah);
		
		// 댓글 등록
		ReplyVO newReply = new ReplyVO();
		newReply.setBoardId("BO-20260303-000039");
		newReply.setContent("댓글입니다.");
		replyService.createNewReply(newReply);
		
		// 대댓글 등록
		ReplyVO newRereply = new ReplyVO();
		newRereply.setBoardId("BO-20260303-000039");
		newRereply.setTopId("RP-20260304-000002");
		newRereply.setContent("대댓글입니다.");
		replyService.createNewReply(newRereply);
		
		// 댓글 수정
		ReplyVO modifyReply = new ReplyVO();
		modifyReply.setId("RP-20260304-000003");
		modifyReply.setContent("수정된 댓글입니다.");
		replyService.modifyReply(modifyReply);
		
		// 댓글 삭제
		replyService.deleteReply("RP-20260304-000009");
		
		// 게시글의 모든 댓글 조회
		List<ReplyVO> replies = replyService.readAllReplies("BO-20260303-000039");
		System.out.println(replies);
		
		// 댓글 하나 조회
		ReplyVO reply = replyService.readOneReply("RP-20260304-000008");
		System.out.println(reply);
		
		// 댓글의 대댓글 조회
		List<ReplyVO> reReplies = replyService.readAllRepliesByReplyId("RP-20260304-000004");
		System.out.println(reReplies);
		
		dah.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - now);
	}
}

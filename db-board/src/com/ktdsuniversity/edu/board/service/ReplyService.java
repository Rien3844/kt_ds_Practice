package com.ktdsuniversity.edu.board.service;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class ReplyService {
	private DataAccessHelper dah;
	private ReplyDao replyDao;

	public ReplyService(DataAccessHelper dah) {
		this.dah = dah;
		this.replyDao = new ReplyDao(this.dah);
	}

	public List<ReplyVO> readAllReplies(String articleId) {

		List<ReplyVO> result = this.replyDao.readAllReplies(articleId);
		return result;
	}

	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readOneReply(String articleId) {
		try {
			ReplyVO result = this.replyDao.readOneReply(articleId);
			this.dah.commit();
			return result;
		} catch (RuntimeException re) {
			dah.rollback();
		}

		return null;
	}

	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회(대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllRepliesByReplyId(String articleId) {

		List<ReplyVO> result = this.replyDao.readAllRepliesByReplyId(articleId);

		return result;
	}

	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newArticle) {

		try {
			this.replyDao.createNewReply(newArticle);
			this.dah.commit();
		} catch (RuntimeException re) {
			dah.rollback();
		}
	}

	// void 댓글 수정(ReplyVO)
	public void modifyReply(ReplyVO modifyReply) {

		try {
			this.replyDao.modifyReply(modifyReply);
			dah.commit();
		} catch (RuntimeException re) {
			dah.rollback();
		}
	}

	// void 댓글 삭제(댓글 아이디)
	public void deleteReply(String articleId) {

		try {
			this.replyDao.deleteReply(articleId);
			dah.commit();
		} catch (RuntimeException re) {
			dah.rollback();
		}
	}
}

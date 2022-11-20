package com.ssafy.home.model.service;

import java.util.ArrayList;

import com.ssafy.home.model.NoticeCommentDTO;

public interface NoticeCommentService {
	// 공지사항 댓글
	// 공지사항 해당 댓글 목록
	ArrayList<NoticeCommentDTO> listNoticeComment(int noticeNo) throws Exception;

	// 댓글 등록
	boolean registNoticeComment(NoticeCommentDTO dto) throws Exception;

	// 댓글 수정
	boolean updateNoticeComment(NoticeCommentDTO dto) throws Exception;

	// 댓글 삭제
	boolean deleteNoticeComment(int noticeCommentNo) throws Exception;
}

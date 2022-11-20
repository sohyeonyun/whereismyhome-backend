package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.NoticeCommentDTO;

@Mapper
public interface NoticeCommentMapper {
	// 공지사항 댓글
	// 공지사항 해당 댓글 목록
	ArrayList<NoticeCommentDTO> listNoticeComment(int noticeNo) throws SQLException;

	// 댓글 등록
	boolean registNoticeComment(NoticeCommentDTO dto) throws SQLException;

	// 댓글 수정
	boolean updateNoticeComment(NoticeCommentDTO dto) throws SQLException;

	// 댓글 삭제
	boolean deleteNoticeComment(int noticeCommentNo) throws SQLException;

}

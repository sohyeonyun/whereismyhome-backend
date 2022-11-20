package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.NoticeDTO;

@Mapper
public interface NoticeMapper {
	// 공지사항
	// 공지사항 전체 보기
	ArrayList<NoticeDTO> listNotice() throws SQLException;

	// 공지사항 등록
	boolean registNotice(NoticeDTO dto) throws SQLException;

	// 공지사항 자세히 보기
	NoticeDTO viewNotice(int noticeNo) throws SQLException;

	// 공지사항 업데이트
	boolean updateNotice(NoticeDTO dto) throws SQLException;

	// 공지사항 삭제
	boolean deleteNotice(int noticeNo) throws SQLException;

	// 공지사항 조회수 증가
	void updateHit(int noticeNo) throws SQLException;
	
}

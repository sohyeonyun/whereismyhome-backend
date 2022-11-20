package com.ssafy.home.model.service;

import java.util.ArrayList;

import com.ssafy.home.model.NoticeDTO;

public interface NoticeService {
	// 공지사항 전체 보기
	ArrayList<NoticeDTO> listNotice() throws Exception;

	// 공지사항 등록
	void registNotice(NoticeDTO dto) throws Exception;

	// 공지사항 자세히 보기
	NoticeDTO viewNotice(int noticeNo) throws Exception;

	// 공지사항 업데이트
	int updateNotice(NoticeDTO dto) throws Exception;

	// 공지사항 삭제
	int deleteNotice(int noticeNo) throws Exception;

	// 공지사항 조회수 증가
	void updateHit(int noticeNo) throws Exception;
}

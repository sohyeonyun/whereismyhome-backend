package com.ssafy.home.model.service;

import java.util.Map;

import com.ssafy.home.model.NoticeLikeDTO;

public interface NoticeLikeService {
	// 공지사항 좋아요
	// 공지사항 좋아요 등록
	boolean registNoticeLike(NoticeLikeDTO dto) throws Exception;

	// 공지사항 좋아요 취소
	boolean deleteNoticeLike(int noticeNo, String userId) throws Exception;

	// 공지사항 좋아요 갯수
	int countNoticeLike(int noticeNo) throws Exception;
}

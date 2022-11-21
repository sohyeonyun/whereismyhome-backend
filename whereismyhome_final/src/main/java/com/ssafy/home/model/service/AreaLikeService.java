package com.ssafy.home.model.service;

import com.ssafy.home.model.AreaLikeDTO;

public interface AreaLikeService {
	// 지역 찜하기
	// 찜한 지역 목록
//	ArrayList<>

	// 지역 추가
	boolean registAreaLike(AreaLikeDTO dto) throws Exception;

	// 지역 삭제
	boolean deleteAreaLike(String userId, String dongCode) throws Exception;
}

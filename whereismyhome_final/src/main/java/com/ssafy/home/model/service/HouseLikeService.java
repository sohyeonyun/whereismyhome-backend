package com.ssafy.home.model.service;

import com.ssafy.home.model.HouseLikeDTO;

public interface HouseLikeService {
	// 아파트 찜하기
	// 찜한 아파트 목록
//	ArrayList<>

	// 아파트 추가
	boolean registHouseLike(HouseLikeDTO dto) throws Exception;

	// 아파트 삭제
	boolean deleteHouseLike(String userId, String aptCode) throws Exception;
}

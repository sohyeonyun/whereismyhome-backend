package com.ssafy.home.model.service;

import java.util.ArrayList;

import com.ssafy.home.model.AreaLikeDTO;
import com.ssafy.home.model.UserAreaLikeDTO;

public interface AreaLikeService {
	// 지역 찜하기
	// 찜한 지역 목록
	ArrayList<UserAreaLikeDTO> listAreaLike(String userId) throws Exception;

	// 지역 추가
	boolean registAreaLike(AreaLikeDTO dto) throws Exception;

	// 지역 삭제
	boolean deleteAreaLike(String userId, String dongCode) throws Exception;
}

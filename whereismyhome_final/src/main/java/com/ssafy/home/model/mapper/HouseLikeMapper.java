package com.ssafy.home.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.HouseLikeDTO;

@Mapper
public interface HouseLikeMapper {
	// 아파트 찜하기
	// 찜한 아파트 목록
//	ArrayList<>

	// 아파트 추가
	boolean registHouseLike(HouseLikeDTO dto) throws SQLException;

	// 아파트 삭제
	boolean deleteHouseLike(String userId, String aptCode) throws SQLException;
}

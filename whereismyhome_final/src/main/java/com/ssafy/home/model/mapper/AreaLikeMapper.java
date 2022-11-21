package com.ssafy.home.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.AreaLikeDTO;

@Mapper
public interface AreaLikeMapper {
	// 지역 찜하기
	// 찜한 지역 목록
//	ArrayList<>
	
	// 지역 추가
	boolean registAreaLike(AreaLikeDTO dto) throws SQLException;
	
	// 지역 삭제
	boolean deleteAreaLike(String userId, String dongCode) throws SQLException;
}

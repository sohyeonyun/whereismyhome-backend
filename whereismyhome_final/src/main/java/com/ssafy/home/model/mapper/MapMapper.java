package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.AvgDealamountDTO;
import com.ssafy.home.model.MapAptLocationDTO;
import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapDongLocationDTO;

@Mapper
public interface MapMapper {
	// 맵
	// 시 구군 동 검색
	ArrayList<MapDongLocationDTO> listMapDongLocation(String name) throws SQLException;
	
	// 아파트 검색
	ArrayList<MapAptLocationDTO> listMapAptLocation(String name) throws SQLException;
	
	// 동코드로 검색
	ArrayList<MapDTO> listMapDong(Map<String, Object> map) throws SQLException;
	
	// 아파트 이름으로 검색
	ArrayList<MapDTO> listMapApt(Map<String, Object> map) throws SQLException;
	
	// 연도별 평균 매매 정보
	ArrayList<AvgDealamountDTO> listAvgDealamount(String aptCode) throws SQLException;
}

package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapLocationDTO;

@Mapper
public interface MapMapper {
	// 맵
	// 시 구군 동 검색
	ArrayList<MapLocationDTO> listMapLocation(String name) throws SQLException;
	
	// 동코드로 검색
	ArrayList<MapDTO> listMapDong(Map<String, String> map) throws SQLException;
	
	// 아파트 이름으로 검색
	ArrayList<MapDTO> listMapApt(Map<String, String> map) throws SQLException;
}

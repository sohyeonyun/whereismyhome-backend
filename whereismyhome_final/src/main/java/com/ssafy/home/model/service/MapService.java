package com.ssafy.home.model.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.ssafy.home.model.AvgDealamountDTO;
import com.ssafy.home.model.MapAptLocationDTO;
import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapDongLocationDTO;

public interface MapService {
	// 맵
	// 시 구군 동 검색
	ArrayList<MapDongLocationDTO> listMapDongLocation(String name) throws Exception;
	
	// 시 구군 동 검색
	ArrayList<MapAptLocationDTO> listMapAptLocation(String name) throws Exception;

	// 동코드로 검색
	ArrayList<MapDTO> listMapDong(Map<String, Object> map) throws Exception;

	// 아파트 이름으로 검색
	ArrayList<MapDTO> listMapApt(Map<String, Object> map) throws Exception;
	
	// 연도별 평균 매매 정보
	ArrayList<AvgDealamountDTO> listAvgDealamount(String aptCode) throws Exception;
}

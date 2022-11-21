package com.ssafy.home.model.service;

import java.util.ArrayList;
import java.util.Map;

import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapLocationDTO;

public interface MapService {
	// 맵
	// 시 구군 동 검색
	ArrayList<MapLocationDTO> listMapLocation(String name) throws Exception;

	// 동코드로 검색
	ArrayList<MapDTO> listMapDong(Map<String, String> map) throws Exception;

	// 아파트 이름으로 검색
	ArrayList<MapDTO> listMapApt(Map<String, String> map) throws Exception;
}

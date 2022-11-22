package com.ssafy.home.model.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.MapAptLocationDTO;
import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapDongLocationDTO;
import com.ssafy.home.model.MapSearchOptionDTO;
import com.ssafy.home.model.mapper.MapMapper;

@Service
public class MapServiceImpl implements MapService {

	private MapMapper mapper = null;
	
	@Autowired
	private MapServiceImpl(MapMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public ArrayList<MapDongLocationDTO> listMapDongLocation(String name) throws Exception {
		return mapper.listMapDongLocation(name);
	}
	
	@Override
	public ArrayList<MapAptLocationDTO> listMapAptLocation(String name) throws Exception {
		return mapper.listMapAptLocation(name);
	}

	@Override
	public ArrayList<MapDTO> listMapDong(Map<String, Object> map) throws Exception {
		return mapper.listMapDong(map);
	}

	@Override
	public ArrayList<MapDTO> listMapApt(Map<String, Object> map) throws Exception {
		return mapper.listMapApt(map);
	}

}

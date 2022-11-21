package com.ssafy.home.model.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapLocationDTO;
import com.ssafy.home.model.mapper.MapMapper;

@Service
public class MapServiceImpl implements MapService {

	private MapMapper mapper = null;
	
	@Autowired
	private MapServiceImpl(MapMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public ArrayList<MapLocationDTO> listMapLocation(String name) throws Exception {
		return mapper.listMapLocation(name);
	}

	@Override
	public ArrayList<MapDTO> listMapDong(Map<String, String> map) throws Exception {
		return mapper.listMapDong(map);
	}

	@Override
	public ArrayList<MapDTO> listMapApt(Map<String, String> map) throws Exception {
		return mapper.listMapApt(map);
	}

}

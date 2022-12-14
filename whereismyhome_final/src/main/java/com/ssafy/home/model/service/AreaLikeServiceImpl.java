package com.ssafy.home.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.AreaLikeDTO;
import com.ssafy.home.model.UserAreaLikeDTO;
import com.ssafy.home.model.mapper.AreaLikeMapper;

@Service
public class AreaLikeServiceImpl implements AreaLikeService {
	
	private AreaLikeMapper mapper = null;
	
	@Autowired
	private AreaLikeServiceImpl(AreaLikeMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public ArrayList<UserAreaLikeDTO> listAreaLike(String userId) throws Exception {
		return mapper.listAreaLike(userId);
	}
	
	@Override
	public boolean registAreaLike(AreaLikeDTO dto) throws Exception {
		return mapper.registAreaLike(dto);
	}

	@Override
	public boolean deleteAreaLike(String userId, String dongCode) throws Exception {
		return mapper.deleteAreaLike(userId, dongCode);
	}


}

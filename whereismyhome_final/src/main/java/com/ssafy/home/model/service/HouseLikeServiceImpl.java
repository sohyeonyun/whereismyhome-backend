package com.ssafy.home.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.HouseLikeDTO;
import com.ssafy.home.model.mapper.HouseLikeMapper;

@Service
public class HouseLikeServiceImpl implements HouseLikeService {
	
	private HouseLikeMapper mapper = null;
	
	@Autowired
	private HouseLikeServiceImpl(HouseLikeMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public boolean registHouseLike(HouseLikeDTO dto) throws Exception {
		return mapper.registHouseLike(dto);
	}

	@Override
	public boolean deleteHouseLike(String userId, String aptCode) throws Exception {
		return mapper.deleteHouseLike(userId, aptCode);
	}

}

package com.ssafy.home.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.NoticeLikeDTO;
import com.ssafy.home.model.mapper.NoticeLikeMapper;

@Service
public class NoticeLikeServiceImpl implements NoticeLikeService {
	
	private NoticeLikeMapper mapper = null;

	@Autowired
	private NoticeLikeServiceImpl(NoticeLikeMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public boolean registNoticeLike(NoticeLikeDTO dto) throws Exception {
		return mapper.registNoticeLike(dto);
	}

	@Override
	public boolean deleteNoticeLike(int noticeNo, String userId) throws Exception {
		return mapper.deleteNoticeLike(noticeNo, userId);
	}

	@Override
	public int countNoticeLike(int noticeNo) throws Exception {
		return mapper.countNoticeLike(noticeNo);
	}

}

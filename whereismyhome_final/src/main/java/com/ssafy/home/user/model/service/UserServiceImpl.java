package com.ssafy.home.user.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.home.user.model.UserDTO;
import com.ssafy.home.user.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	private UserMapper mapper = null;

	@Autowired
	private UserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void registUser(UserDTO dto) throws Exception {
		mapper.registUser(dto);
	}

	@Override
	public UserDTO loginUser(Map<String, String> map) throws Exception {
		return mapper.loginUser(map);
	}

	@Override
//	@Transactional
	public int updateUser(UserDTO dto) throws Exception {
		return mapper.updateUser(dto);
	}

	@Override
//	@Transactional
	public int deleteUser(String userId) throws Exception {
		return mapper.deleteUser(userId);
	}

}

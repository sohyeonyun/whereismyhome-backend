package com.ssafy.home.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.UserDTO;
import com.ssafy.home.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	private UserMapper mapper = null;

	@Autowired
	private UserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public boolean registUser(UserDTO dto) throws Exception {
		return mapper.registUser(dto);
	}

	@Override
	public UserDTO loginUser(Map<String, String> map) throws Exception {
		return mapper.loginUser(map);
	}

	@Override
	public boolean updateUser(UserDTO dto) throws Exception {
		return mapper.updateUser(dto);
	}

	@Override
	public boolean deleteUser(String userId) throws Exception {
		return mapper.deleteUser(userId);
	}

}

package com.ssafy.home.user.model.service;

import java.util.Map;

import com.ssafy.home.user.model.UserDTO;

public interface UserService {
	// 회원 가입
	void registUser(UserDTO dto) throws Exception;
	// 로그인
	UserDTO loginUser(Map<String, String> map) throws Exception;
	// 회원 정보 수정
	int updateUser(UserDTO dto) throws Exception;
	// 회원 탈퇴
	int deleteUser(String userId) throws Exception;
}
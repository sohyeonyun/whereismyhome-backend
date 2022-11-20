package com.ssafy.home.model.service;

import java.util.Map;

import com.ssafy.home.model.UserDTO;

public interface UserService {
	// 회원 가입
	boolean registUser(UserDTO dto) throws Exception;

	// 로그인
	UserDTO loginUser(Map<String, String> map) throws Exception;

	// 회원 정보 수정
	boolean updateUser(UserDTO dto) throws Exception;

	// 회원 탈퇴
	boolean deleteUser(String userId) throws Exception;
}
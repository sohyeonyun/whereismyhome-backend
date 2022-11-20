package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.UserDTO;

@Mapper
public interface UserMapper {
	// 회원 가입
	boolean registUser(UserDTO dto) throws SQLException;

	// 로그인
	UserDTO loginUser(Map map) throws SQLException;

	// 회원 정보 수정
	boolean updateUser(UserDTO dto) throws SQLException;

	// 회원 탈퇴
	boolean deleteUser(String userId) throws SQLException;
}

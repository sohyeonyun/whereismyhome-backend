package com.ssafy.home.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.model.UserDTO;
import com.ssafy.home.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/user")
@Api("User Controller API V1")
public class UserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	@ApiOperation(value = "유저 로그인", response = UserDTO.class)
	public ResponseEntity<?> userLogin(
			@RequestBody @ApiParam(value = "로그인 맵.", required = true) Map<String, String> map) {
		logger.info("userLogin - 호출");

		try {
			UserDTO user = userService.loginUser(map);
			if (user != null) {
				logger.info("로그인 정보 : {}", map);
				return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
			} else {
				return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	@ApiOperation(value = "유저 회원가입", response = String.class)
	public ResponseEntity<?> userRegist(@RequestBody @ApiParam(value = "회원가입 정보.", required = true) UserDTO userDto) {
		logger.info("userRegist - 호출");
		logger.info("userRegist userDto : {}", userDto);

		try {
			if (userService.registUser(userDto)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

	@PutMapping("/{userid}")
	@ApiOperation(value = "유저 회원수정", response = String.class)
	public ResponseEntity<?> userModify(@RequestBody @ApiParam(value = "회원수정 정보.", required = true) UserDTO userDto) {
		logger.info("userModify - 호출");
		logger.info("userModify userDto : {}", userDto);

		try {
			if (userService.updateUser(userDto)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

	@DeleteMapping("/{userid}")
	@ApiOperation(value = "유저 회원탈퇴", response = String.class)
	public ResponseEntity<?> userDelete(
			@PathVariable("userid") @ApiParam(value = "회원삭제 아이디.", required = true) String userId) {
		logger.info("userDelete - 호출");
		logger.info("userDelete userid : {}", userId);

		try {
			if (userService.deleteUser(userId)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
}
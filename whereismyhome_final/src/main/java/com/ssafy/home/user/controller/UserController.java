package com.ssafy.home.user.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.user.model.UserDTO;
import com.ssafy.home.user.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api("유저 컨트롤러")
public class UserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	@ApiOperation(value = "유저 로그인", response = String.class)
	public ResponseEntity<?> userLogin(@RequestParam Map<String, String> map, HttpSession session) {
		logger.info("userLogin - 호출");
		UserDTO user = null;
		try {
			user = userService.loginUser(map);
			if (user != null) {
				logger.info("로그인 정보 : {}", map);
				session.setAttribute("userInfo", user);
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			} else {
				return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/logout")
	@ApiOperation(value = "유저 로그아웃", response = String.class)
	public ResponseEntity<?> userLogout(HttpSession session) {
		logger.info("userLogout - 호출");
		session.invalidate();
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

	@PostMapping("/")
	@ApiOperation(value = "유저 회원가입", response = String.class)
	public ResponseEntity<?> userRegist(@RequestParam UserDTO userDto) {
		logger.info("userRegist - 호출");
		logger.info("userRegist userDto : {}", userDto);

		try {
			userService.registUser(userDto);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

	@PutMapping("/")
	@ApiOperation(value = "유저 회원수정", response = String.class)
	public ResponseEntity<?> userModify(@RequestParam UserDTO userDto) {
		logger.info("userModify - 호출");
		logger.info("userModify userDto : {}", userDto);

		try {
			userService.updateUser(userDto);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

	@DeleteMapping("/{userid}")
	@ApiOperation(value = "유저 회원탈퇴", response = String.class)
	public ResponseEntity<?> userDelete(@PathVariable("userid") String userId) {
		logger.info("userDelete - 호출");
		logger.info("userDelete userid : {}", userId);

		try {
			userService.deleteUser(userId);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
}

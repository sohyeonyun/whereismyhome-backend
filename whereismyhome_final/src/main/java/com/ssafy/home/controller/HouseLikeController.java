package com.ssafy.home.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.model.HouseLikeDTO;
import com.ssafy.home.model.UserAreaLikeDTO;
import com.ssafy.home.model.UserHouseLikeDTO;
import com.ssafy.home.model.service.HouseLikeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/interest/house")
@Api("HouseLike Controller API V1")
public class HouseLikeController {
	
	public static final Logger logger = LoggerFactory.getLogger(HouseLikeController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private HouseLikeService houseLikeService;
	
//	listHouseLike
	@GetMapping("/{user_id}")
	@ApiOperation(value = "유저 관심 아파트 목록", response = ArrayList.class)
	public ResponseEntity<?> userHouseLikeList(
			@PathVariable("user_id") @ApiParam(value = "유저 아이디.", required = true) String userId) {
		logger.info("userHouseLikeList - 호출");
		logger.info("userHouseLikeList userId : {}", userId);

		try {
			ArrayList<UserHouseLikeDTO> list = houseLikeService.listHouseLike(userId);
			logger.info("userHouseLikeList list : {} " , list);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	regisstHouseLike
	@GetMapping("/{user_id}/{aptCode}")
	@ApiOperation(value = "관심 아파트 등록", response = String.class)
	public ResponseEntity<?> houseLikeRegist(
			@PathVariable("user_id") @ApiParam(value = "유저 아이디", required = true) String userId,
			@PathVariable("aptCode") @ApiParam(value = "아파트 코드", required = true) String aptCode) {
		logger.info("houseLikeRegist - 호출");
		logger.info("user_id : {}", userId);
		logger.info("aptCode : {}", aptCode);

		HouseLikeDTO dto = new HouseLikeDTO();
		dto.setUserId(userId);
		dto.setAptCode(aptCode);
//		dto.setIpAddress(ipAddress);
		try {
			if (houseLikeService.registHouseLike(dto)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	deleteHouseLike
	@DeleteMapping("/{user_id}/{aptCode}")
	@ApiOperation(value = "관심 아파트 삭제", response = String.class)
	public ResponseEntity<?> houseLikeDelete(
			@PathVariable("user_id") @ApiParam(value = "유저 아이디", required = true) String userId,
			@PathVariable("aptCode") @ApiParam(value = "아파트 코드", required = true) String aptCode) {
		logger.info("houseLikeDelete - 호출");
		logger.info("user_id : {}", userId);
		logger.info("aptCode : {}", aptCode);

		try {
			if (houseLikeService.deleteHouseLike(userId, aptCode)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
}

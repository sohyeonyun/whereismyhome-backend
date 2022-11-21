package com.ssafy.home.controller;

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

import com.ssafy.home.model.AreaLikeDTO;
import com.ssafy.home.model.NoticeLikeDTO;
import com.ssafy.home.model.service.AreaLikeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/interest/area")
@Api("AreaLike Controller API V1")
public class AreaLikeController {

	public static final Logger logger = LoggerFactory.getLogger(AreaLikeController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private AreaLikeService areaLikeService;

//	regisstAreaLike
	@GetMapping("/{user_id}/{dongCode}")
	@ApiOperation(value = "관심지역 등록", response = String.class)
	public ResponseEntity<?> areaLikeRegist(
			@PathVariable("user_id") @ApiParam(value = "유저 아이디", required = true) String userId,
			@PathVariable("dongCode") @ApiParam(value = "동 코드", required = true) String dongCode) {
		logger.info("areaLikeRegist - 호출");
		logger.info("user_id : {}", userId);
		logger.info("dongCode : {}", dongCode);

		AreaLikeDTO dto = new AreaLikeDTO();
		dto.setUserId(userId);
		dto.setDongCode(dongCode);
//		dto.setIpAddress(ipAddress);
		try {
			if (areaLikeService.registAreaLike(dto)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	deleteAreaLike
	@DeleteMapping("/{user_id}/{dongCode}")
	@ApiOperation(value = "관심지역 삭제", response = String.class)
	public ResponseEntity<?> areaLikeDelete(
			@PathVariable("user_id") @ApiParam(value = "유저 아이디", required = true) String userId,
			@PathVariable("dongCode") @ApiParam(value = "동 코드", required = true) String dongCode) {
		logger.info("areaLikeDelete - 호출");
		logger.info("user_id : {}", userId);
		logger.info("dongCode : {}", dongCode);

		try {
			if (areaLikeService.deleteAreaLike(userId, dongCode)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
}

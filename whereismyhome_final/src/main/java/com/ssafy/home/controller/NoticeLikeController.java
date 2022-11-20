package com.ssafy.home.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

import com.ssafy.home.model.NoticeLikeDTO;
import com.ssafy.home.model.service.NoticeLikeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/notice/like")
@Api("NoticeLike Controller API V1")
public class NoticeLikeController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private NoticeLikeService noticeLikeService;

//	registNoticeLike
	@GetMapping("/{notice_no}/{user_id}")
	@ApiOperation(value = "공지사항 좋아요 등록", response = String.class)
	public ResponseEntity<?> noticeLikeRegist(
			@PathVariable("notice_no") @ApiParam(value = "게시글 번호", required = true) int noticeNo,
			@PathVariable("user_id") @ApiParam(value = "유저 아이디", required = true) String userId) {
		logger.info("noticeLikeRegist - 호출");
		logger.info("notice_no : {}", noticeNo);
		logger.info("user_id : {}", userId);

		NoticeLikeDTO dto = new NoticeLikeDTO();
		dto.setNoticeNo(noticeNo);
		dto.setUserId(userId);
//		dto.setIpAddress(ipAddress);
		try {
			if (noticeLikeService.registNoticeLike(dto)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	deleteNoticeLike
	@DeleteMapping("/{notice_no}/{user_id}")
	@ApiOperation(value = "공지사항 좋아요 삭제", response = String.class)
	public ResponseEntity<?> noticeLikeDelete(
			@PathVariable("notice_no") @ApiParam(value = "게시글 번호", required = true) int noticeNo,
			@PathVariable("user_id") @ApiParam(value = "유저 아이디", required = true) String userId) {
		logger.info("noticeLikeDelete - 호출");
		logger.info("notice_no : {}", noticeNo);
		logger.info("user_id : {}", userId);

		try {
			if (noticeLikeService.deleteNoticeLike(noticeNo, userId)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	listNotice
	@GetMapping("/{notice_no}")
	@ApiOperation(value = "게시판 좋아요 개수", response = Integer.class)
	public ResponseEntity<?> noticeLikeCount(
			@PathVariable("notice_no") @ApiParam(value = "게시글 번호", required = true) int noticeNo) {
		logger.info("noticeLikeCount - 호출");
		logger.info("notice_no : {}", noticeNo);

		try {
			int cnt = noticeLikeService.countNoticeLike(noticeNo);
			System.out.println("cnt : " + cnt);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

}

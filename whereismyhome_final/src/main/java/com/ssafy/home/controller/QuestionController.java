package com.ssafy.home.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.config.ClientUtils;
import com.ssafy.home.model.QuestionDTO;
import com.ssafy.home.model.service.QuestionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/qna")
@Api("Question Controller API V1")
public class QuestionController {

	public static final Logger logger = LoggerFactory.getLogger(QuestionController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private QuestionService questionService;
	
//	listQuestion
	@GetMapping("/admin")
	@ApiOperation(value = "1:1문의 목록", response = ArrayList.class)
	public ResponseEntity<?> questsionList() {
		logger.info("questsionList - 호출");

		try {
			ArrayList<QuestionDTO> list = questionService.listQuestion();
			logger.info("questsionList list : {} " , list);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	listQuestion
	@GetMapping("/{user_id}")
	@ApiOperation(value = "유저 1:1문의 목록", response = ArrayList.class)
	public ResponseEntity<?> questsionUserList(
			@PathVariable("user_id") @ApiParam(value = "1:1문의 유저 아이디.", required = true) String userId) {
		logger.info("questsionUserList - 호출");

		try {
			ArrayList<QuestionDTO> list = questionService.listUserQuestion(userId);
			logger.info("questsionUserList list : {} " , list);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	registQuestion
	@PostMapping
	@ApiOperation(value = "1:1문의 등록", response = String.class)
	public ResponseEntity<?> questsionRegist(
			@RequestBody @ApiParam(value = "1:1문의 등록 정보.", required = true) QuestionDTO questionDTO,
			HttpServletRequest request) {
		logger.info("questsionRegist - 호출");
		logger.info("questsionRegist questionDTO : {}", questionDTO);
		
		ClientUtils clientUtils = new ClientUtils();
		questionDTO.setIpAddress(clientUtils.getRemoteIP(request));
//		System.out.println(clientUtils.getRemoteIP(request));
		
		try {
			if (questionService.registQuestion(questionDTO)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	updateQuestion
	@PutMapping
	@ApiOperation(value = "1:1문의 수정", response = String.class)
	public ResponseEntity<?> questsionModify(
			@RequestBody @ApiParam(value = "1:1문의 수정 정보.", required = true) QuestionDTO questionDTO) {
		logger.info("questsionModify - 호출");
		logger.info("questsionModify questionDTO : {}", questionDTO);

		try {
			if (questionService.updateQuestion(questionDTO)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	deleteQuestion
	@DeleteMapping("/{question_no}")
	@ApiOperation(value = "1:1문의 삭제", response = String.class)
	public ResponseEntity<?> questsionDelete(
			@PathVariable("question_no") @ApiParam(value = "1:1문의 삭제 번호.", required = true) int questionNo) {
		logger.info("noticeDelete - 호출");
		logger.info("noticeDelete questionNo : {}", questionNo);

		try {
			if (questionService.deleteQuestion(questionNo)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	registAnswer
	@PutMapping("/answer/regist")
	@ApiOperation(value = "1:1문의 답변 등록", response = String.class)
	public ResponseEntity<?> answerRegist(
			@RequestBody @ApiParam(value = "1:1문의 수정 정보.", required = true) QuestionDTO questionDTO) {
		logger.info("answerRegist - 호출");
		logger.info("answerRegist questionDTO : {}", questionDTO);

		try {
			if (questionService.registAnswer(questionDTO)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	updateAnswer
	@PutMapping("/answer/update")
	@ApiOperation(value = "1:1문의 답변 수정", response = String.class)
	public ResponseEntity<?> answerModify(
			@RequestBody @ApiParam(value = "1:1문의 수정 정보.", required = true) QuestionDTO questionDTO) {
		logger.info("answerModify - 호출");
		logger.info("answerModify questionDTO : {}", questionDTO);

		try {
			if (questionService.updateAnswer(questionDTO)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	deleteAnswer
	@PutMapping("/answer/{question_no}")
	@ApiOperation(value = "1:1문의 답변 삭제", response = String.class)
	public ResponseEntity<?> answerDelete(
			@PathVariable("question_no") @ApiParam(value = "1:1문의 댓글 삭제 번호.", required = true) int questionNo) {
		logger.info("answerDelete - 호출");
		logger.info("answerDelete questionNo : {}", questionNo);

		try {
			if (questionService.deleteAnswer(questionNo)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
}

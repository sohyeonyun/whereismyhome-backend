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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.model.NoticeDTO;
import com.ssafy.home.model.service.NoticeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/notice")
@Api("Notice Controller API V1")
public class NoticeController {
	
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private NoticeService noticeService;
	
//	listNotice
	@GetMapping("/")
	@ApiOperation(value = "공지사항 목록", response = ArrayList.class)
	public ResponseEntity<?> noticelist() {
		logger.info("noticelist - 호출");

		try {
			ArrayList<NoticeDTO> list = noticeService.listNotice();
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	registNotice
	@PostMapping("/")
	@ApiOperation(value = "공지사항 등록", response = String.class)
	public ResponseEntity<?> noticeRegist(@RequestBody @ApiParam(value = "게시글 등록 정보.", required = true) NoticeDTO noticeDto) {
		logger.info("noticeRegist - 호출");
		logger.info("noticeRegist noticeDto : {}", noticeDto);

		try {
			noticeService.registNotice(noticeDto);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	viewNotice
//	updateHit
	@GetMapping("/{noticeno}")
	@ApiOperation(value = "공지사항 상세", response = NoticeDTO.class)
	public ResponseEntity<?> noticeView(@PathVariable("noticeno") @ApiParam(value = "게시글 상세 번호.", required = true) int noticeNo) {
		logger.info("noticeView - 호출");
		logger.info("noticeView noticeNo : {}", noticeNo);

		try {
			noticeService.updateHit(noticeNo);
			NoticeDTO dto = noticeService.viewNotice(noticeNo);
			return new ResponseEntity<NoticeDTO>(dto, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	updateNotice
	@PutMapping("/")
	@ApiOperation(value = "공지사항 수정", response = String.class)
	public ResponseEntity<?> noticeModify(@RequestBody @ApiParam(value = "게시글 수정 정보.", required = true) NoticeDTO noticeDto) {
		logger.info("noticeModify - 호출");
		logger.info("noticeModify noticeDto : {}", noticeDto);

		try {
			noticeService.updateNotice(noticeDto);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	deleteNotice
	@DeleteMapping("/{noticeno}")
	@ApiOperation(value = "공지사항 삭제", response = String.class)
	public ResponseEntity<?> noticeDelete(@PathVariable("noticeno") @ApiParam(value = "게시글삭제 번호.", required = true) int noticeNo) {
		logger.info("noticeDelete - 호출");
		logger.info("noticeDelete userid : {}", noticeNo);

		try {
			noticeService.deleteNotice(noticeNo);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
}

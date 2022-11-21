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

import com.ssafy.home.model.NoticeCommentDTO;
import com.ssafy.home.model.NoticeDTO;
import com.ssafy.home.model.service.NoticeCommentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/comment")
@Api("NoticeComment Controller API V1")
public class NoticeCommentController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private NoticeCommentService noticeCommentService;

//	listNoticeComment
	@GetMapping("/{notice_no}")
	@ApiOperation(value = "공지사항 댓글 목록", response = ArrayList.class)
	public ResponseEntity<?> noticeCommentList(
			@PathVariable("notice_no") @ApiParam(value = "댓글 등록할 게시글 번호.", required = true) int noticeNo) {
		logger.info("noticeCommentList - 호출");
		logger.info("noticeCommentList noticeNo : {}", noticeNo);

		try {
			ArrayList<NoticeCommentDTO> list = noticeCommentService.listNoticeComment(noticeNo);
			logger.info("noticeCommentList list : {} " , list);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	registNoticeComment
	@PostMapping
	@ApiOperation(value = "공지사항 댓글 등록", response = String.class)
	public ResponseEntity<?> noticeCommentRegist(
			@RequestBody @ApiParam(value = "게시글 댓글 등록 정보.", required = true) NoticeCommentDTO noticeCommentDTO) {
		logger.info("noticeCommentRegist - 호출");
		logger.info("noticeCommentRegist NoticeCommentDTO : {}", noticeCommentDTO);

		try {
			if (noticeCommentService.registNoticeComment(noticeCommentDTO)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	updateNoticeComment
	@PutMapping
	@ApiOperation(value = "공지사항 댓글 수정", response = String.class)
	public ResponseEntity<?> noticeCommentModify(
			@RequestBody @ApiParam(value = "게시글 댓글 수정 정보.", required = true) NoticeCommentDTO noticeCommentDTO) {
		logger.info("noticeCommentModify - 호출");
		logger.info("noticeCommentModify noticeCommentDTO : {}", noticeCommentDTO);

		try {
			if (noticeCommentService.updateNoticeComment(noticeCommentDTO)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	deleteNoticeComment
	@DeleteMapping("/{notice_comment_no}")
	@ApiOperation(value = "공지사항 댓글 삭제", response = String.class)
	public ResponseEntity<?> noticeCommentDelete(
			@PathVariable("notice_comment_no") @ApiParam(value = "게시글 댓글 삭제 번호.", required = true) int noticeCommentNo) {
		logger.info("noticeCommentDelete - 호출");
		logger.info("noticeCommentDelete noticeCommentNo : {}", noticeCommentNo);

		try {
			if (noticeCommentService.deleteNoticeComment(noticeCommentNo)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<String>(FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

}

package com.ssafy.home.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.NoticeCommentDTO;
import com.ssafy.home.model.mapper.NoticeCommentMapper;

@Service
public class NoticeCommentServiceImpl implements NoticeCommentService {
	
	private NoticeCommentMapper mapper = null;
	
	@Autowired
	private NoticeCommentServiceImpl(NoticeCommentMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public ArrayList<NoticeCommentDTO> listNoticeComment(int noticeNo) throws Exception {
		return mapper.listNoticeComment(noticeNo);
	}

	@Override
	public boolean registNoticeComment(NoticeCommentDTO dto) throws Exception {
		return mapper.registNoticeComment(dto);
	}

	@Override
	public boolean updateNoticeComment(NoticeCommentDTO dto) throws Exception {
		return mapper.updateNoticeComment(dto);
	}

	@Override
	public boolean deleteNoticeComment(int noticeCommentNo) throws Exception {
		return mapper.deleteNoticeComment(noticeCommentNo);
	}

}

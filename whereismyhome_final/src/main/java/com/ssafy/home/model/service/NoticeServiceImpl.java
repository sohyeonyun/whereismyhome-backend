package com.ssafy.home.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.NoticeDTO;
import com.ssafy.home.model.NoticeLikeDTO;
import com.ssafy.home.model.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {

	private NoticeMapper mapper = null;

	@Autowired
	private NoticeServiceImpl(NoticeMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public ArrayList<NoticeDTO> listNotice() throws Exception {
		return mapper.listNotice();
	}

	@Override
	public boolean registNotice(NoticeDTO dto) throws Exception {
		return mapper.registNotice(dto);
	}

	@Override
	public NoticeDTO viewNotice(int noticeNo) throws Exception {
		return mapper.viewNotice(noticeNo);
	}

	@Override
	public boolean updateNotice(NoticeDTO dto) throws Exception {
		return mapper.updateNotice(dto);
	}

	@Override
	public boolean deleteNotice(int noticeNo) throws Exception {
		return mapper.deleteNotice(noticeNo);
	}

	@Override
	public void updateHit(int noticeNo) throws Exception {
		mapper.updateHit(noticeNo);
	}

}

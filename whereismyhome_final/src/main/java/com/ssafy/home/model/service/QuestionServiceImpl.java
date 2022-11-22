package com.ssafy.home.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.model.QuestionDTO;
import com.ssafy.home.model.mapper.QuestionMapper;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	private QuestionMapper mapper = null;
	
	@Autowired
	private QuestionServiceImpl(QuestionMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public ArrayList<QuestionDTO> listQuestion() throws Exception {
		return mapper.listQuestion();
	}
	
	@Override
	public ArrayList<QuestionDTO> listUserQuestion(String userId) throws Exception {
		return mapper.listUserQuestion(userId);
	}

	@Override
	public boolean registQuestion(QuestionDTO dto) throws Exception {
		return mapper.registQuestion(dto);
	}

	@Override
	public boolean updateQuestion(QuestionDTO dto) throws Exception {
		return mapper.updateQuestion(dto);
	}

	@Override
	public boolean deleteQuestion(int questionNo) throws Exception {
		return mapper.deleteQuestion(questionNo);
	}

	@Override
	public boolean registAnswer(QuestionDTO dto) throws Exception {
		return mapper.registAnswer(dto);
	}

	@Override
	public boolean updateAnswer(QuestionDTO dto) throws Exception {
		return mapper.updateAnswer(dto);
	}

	@Override
	public boolean deleteAnswer(int questionNo) throws Exception {
		return mapper.deleteAnswer(questionNo);
	}

}

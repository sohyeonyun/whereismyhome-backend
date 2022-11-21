package com.ssafy.home.model.service;

import java.util.ArrayList;

import com.ssafy.home.model.QuestionDTO;

public interface QuestionService {
	// 문의사항
	// 문의사항 전체보기
	ArrayList<QuestionDTO> listQuestion() throws Exception;
	
	// 문의사항 등록
	boolean registQuestion(QuestionDTO dto) throws Exception;
	
	// 문의사항 수정
	boolean updateQuestion(QuestionDTO dto) throws Exception;
	
	// 문의사항 삭제
	boolean deleteQuestion(int questionNo) throws Exception;
	
	// 문의사항 답변 등록
	boolean registAnswer(QuestionDTO dto) throws Exception;
	
	// 문의사항 답변 수정
	boolean updateAnswer(QuestionDTO dto) throws Exception;
	
	// 문의사항 답변 삭제
	boolean deleteAnswer(int questionNo) throws Exception;
	
}

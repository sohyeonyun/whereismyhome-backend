package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.QuestionDTO;

@Mapper
public interface QuestionMapper {
	// 문의사항
	// 문의사항 전체보기
	ArrayList<QuestionDTO> listQuestion() throws SQLException;
	
	// 문의사항 자기꺼만 보기
	ArrayList<QuestionDTO> listUserQuestion(String userId) throws SQLException;
	
	// 문의사항 등록
	boolean registQuestion(QuestionDTO dto) throws SQLException;
	
	// 문의사항 수정
	boolean updateQuestion(QuestionDTO dto) throws SQLException;
	
	// 문의사항 삭제
	boolean deleteQuestion(int questionNo) throws SQLException;
	
	// 문의사항 답변 등록
	boolean registAnswer(QuestionDTO dto) throws SQLException;
	
	// 문의사항 답변 수정
	boolean updateAnswer(QuestionDTO dto) throws SQLException;
	
	// 문의사항 답변 삭제
	boolean deleteAnswer(int questionNo) throws SQLException;
}

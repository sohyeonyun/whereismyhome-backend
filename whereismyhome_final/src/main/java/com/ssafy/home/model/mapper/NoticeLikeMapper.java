package com.ssafy.home.model.mapper;

import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.model.NoticeLikeDTO;

@Mapper
public interface NoticeLikeMapper {
	// 공지사항 좋아요
	// 공지사항 좋아요 등록
	boolean registNoticeLike(NoticeLikeDTO dto) throws SQLException;

	// 공지사항 좋아요 취소
	boolean deleteNoticeLike(int noticeNo, String userId) throws SQLException;

	// 공지사항 좋아요 갯수
	int countNoticeLike(int noticeNo) throws SQLException;
}

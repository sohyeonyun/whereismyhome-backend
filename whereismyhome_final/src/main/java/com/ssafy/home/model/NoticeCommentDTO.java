package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "NoticeCommentDTO : 공지사항 댓글 정보", description = "공지사항의 댓글 정보를 나타낸다.")
public class NoticeCommentDTO {
	
	@ApiModelProperty(value = "공지사항 댓글 번호")
	private int noticeCommentNo;
	@ApiModelProperty(value = "공지사항 번호")
	private int noticeNo;
	@ApiModelProperty(value = "유저 아이디")
	private String userId;
	@ApiModelProperty(value = "공지사항 댓글 내용")
	private String content;
	@ApiModelProperty(value = "공지사항 댓글 등록 시간")
	private String registerTime;
	@ApiModelProperty(value = "ip 주소")
	private String ipAddress;

	public int getNoticeCommentNo() {
		return noticeCommentNo;
	}

	public void setNoticeCommentNo(int noticeCommentNo) {
		this.noticeCommentNo = noticeCommentNo;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "NoticeCommentDTO [noticeCommentNo=" + noticeCommentNo + ", noticeNo=" + noticeNo + ", userId=" + userId
				+ ", content=" + content + ", registerTime=" + registerTime + ", ipAddress=" + ipAddress + "]";
	}
}

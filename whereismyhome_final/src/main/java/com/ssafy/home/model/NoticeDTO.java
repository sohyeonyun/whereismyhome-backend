package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "NoticeDTO : 공지사항 정보", description = "공지사항의 정보를 나타낸다.")
public class NoticeDTO {

	@ApiModelProperty(value = "공지사항 번호")
	private int noticeNo;
	@ApiModelProperty(value = "유저아이디")
	private String userId;
	@ApiModelProperty(value = "공지사항 제목")
	private String subject;
	@ApiModelProperty(value = "공지사항 내용")
	private String content;
	@ApiModelProperty(value = "공지사항 조회수")
	private int hit;
	@ApiModelProperty(value = "공지사항 등록 시간")
	private String registerTime;
	@ApiModelProperty(value = "작성 ip주소")
	private String ipAddress;

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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
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
		return "NoticeDTO [noticeNo=" + noticeNo + ", userId=" + userId + ", subject=" + subject + ", content="
				+ content + ", hit=" + hit + ", registerTime=" + registerTime + ", ipAddress=" + ipAddress + "]";
	}

}

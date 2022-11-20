package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "NoticeLikeDTO : 공지사항 좋아요 정보", description = "공지사항 좋아요의 정보를 나타낸다.")
public class NoticeLikeDTO {

	@ApiModelProperty(value = "공지사항 번호")
	private int noticeNo;
	@ApiModelProperty(value = "유저 아이디")
	private String userId;
	@ApiModelProperty(value = "좋아요한 날짜")
	private String registerTime;
	@ApiModelProperty(value = "ip주소")
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
		return "NoticeLikeDTO [noticeNo=" + noticeNo + ", userId=" + userId + ", registerTime=" + registerTime
				+ ", ipAddress=" + ipAddress + "]";
	}
}

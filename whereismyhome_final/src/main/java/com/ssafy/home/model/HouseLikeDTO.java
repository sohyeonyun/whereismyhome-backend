package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "HouseLikeDTO : 찜한 아파트 정보", description = "찜한 아파트 정보를 나타낸다.")
public class HouseLikeDTO {
	
	@ApiModelProperty(value = "유저아이디")
	private String userId;
	@ApiModelProperty(value = "아파트 코드")
	private String aptCode;
	@ApiModelProperty(value = "등록 시간")
	private String registerTime;
	@ApiModelProperty(value = "ip 주소")
	private String ipAddress;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAptCode() {
		return aptCode;
	}
	public void setAptCode(String aptCode) {
		this.aptCode = aptCode;
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
		return "HouseLikeDTO [userId=" + userId + ", aptCode=" + aptCode + ", registerTime=" + registerTime
				+ ", ipAddress=" + ipAddress + "]";
	}
}

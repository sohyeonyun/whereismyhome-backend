package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AreaLikeDTO : 찜한 지역 정보", description = "찜한 지역 정보를 나타낸다.")
public class AreaLikeDTO {

	@ApiModelProperty(value = "유저아이디")
	private String userId;
	@ApiModelProperty(value = "동 코드")
	private String dongCode;
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

	public String getDongCode() {
		return dongCode;
	}

	public void setDongCode(String dongCode) {
		this.dongCode = dongCode;
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
		return "AreaLikeDTO [userId=" + userId + ", dongCode=" + dongCode + ", registerTime=" + registerTime
				+ ", ipAddress=" + ipAddress + "]";
	}

}

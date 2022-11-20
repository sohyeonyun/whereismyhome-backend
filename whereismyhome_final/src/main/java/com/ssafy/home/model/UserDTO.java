package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserDTO : 유저정보", description = "유저의 상세 정보를 나타낸다.")
public class UserDTO {

	@ApiModelProperty(value = "유저아이디")
	private String userId;
	@ApiModelProperty(value = "유저비밀번호")
	private String userPassword;
	@ApiModelProperty(value = "유저이름")
	private String userName;
	@ApiModelProperty(value = "유저이메일")
	private String userEmail;
	@ApiModelProperty(value = "유저번호")
	private String userPhone;
	@ApiModelProperty(value = "유저가입일")
	private String registerTime;
	@ApiModelProperty(value = "토큰")
	private String token;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", registerTime=" + registerTime
				+ ", token=" + token + "]";
	}
}

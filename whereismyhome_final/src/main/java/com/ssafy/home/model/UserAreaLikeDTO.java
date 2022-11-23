package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserAreaLikeDTO : 유저 관심 지역 정보", description = "유저의 관심 지역 정보를 나타낸다.")
public class UserAreaLikeDTO {

	@ApiModelProperty(value = "지역 이름")
	private String area;
	@ApiModelProperty(value = "등록 시간")
	private String registerTime;
	@ApiModelProperty(value = "동 코드")
	private String dongcode;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getDongcode() {
		return dongcode;
	}

	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}

	@Override
	public String toString() {
		return "UserAreaLikeDTO [area=" + area + ", registerTime=" + registerTime + ", dongcode=" + dongcode + "]";
	}

}

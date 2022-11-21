package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserAreaLikeDTO : 유저 관심 지역 정보", description = "유저의 관심 지역 정보를 나타낸다.")
public class UserAreaLikeDTO {

	@ApiModelProperty(value = "시도 이름")
	private String sidoName;
	@ApiModelProperty(value = "구군 이름")
	private String gugunName;
	@ApiModelProperty(value = "동 이름")
	private String dongName;

	public String getSidoName() {
		return sidoName;
	}

	public void setSidoName(String sidoName) {
		this.sidoName = sidoName;
	}

	public String getGugunName() {
		return gugunName;
	}

	public void setGugunName(String gugunName) {
		this.gugunName = gugunName;
	}

	public String getDongName() {
		return dongName;
	}

	public void setDongName(String dongName) {
		this.dongName = dongName;
	}

	@Override
	public String toString() {
		return "UserAreaLikeDTO [sidoName=" + sidoName + ", gugunName=" + gugunName + ", dongName=" + dongName + "]";
	}
}

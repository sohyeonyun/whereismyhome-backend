package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserHouseLikeDTO : 유저 관심 아파트 정보", description = "유저의 관심 아파트 정보를 나타낸다.")
public class UserHouseLikeDTO {

	@ApiModelProperty(value = "아파트 이름")
	private String apartmentName;
	@ApiModelProperty(value = "등록 시간")
	private String registerTime;
	@ApiModelProperty(value = "아파트 코드")
	private String aptcode;

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getAptcode() {
		return aptcode;
	}

	public void setAptcode(String aptcode) {
		this.aptcode = aptcode;
	}

	@Override
	public String toString() {
		return "UserHouseLikeDTO [apartmentName=" + apartmentName + ", registerTime=" + registerTime + ", aptcode="
				+ aptcode + "]";
	}

}

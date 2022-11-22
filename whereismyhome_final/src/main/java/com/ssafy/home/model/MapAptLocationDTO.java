package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MapAptLocationDTO : 아파트 정보", description = "아파트 정보를 나타낸다.")
public class MapAptLocationDTO {

	@ApiModelProperty(value = "아파트 이름")
	private String apartmentName;
	@ApiModelProperty(value = "지역 이름")
	private String location;
	@ApiModelProperty(value = "아파트 코드")
	private String aptCode;

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAptCode() {
		return aptCode;
	}

	public void setAptCode(String aptCode) {
		this.aptCode = aptCode;
	}

	@Override
	public String toString() {
		return "MapAptLocationDTO [apartmentName=" + apartmentName + ", location=" + location + ", aptCode=" + aptCode
				+ "]";
	}

}

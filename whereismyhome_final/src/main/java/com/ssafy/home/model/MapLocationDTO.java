package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MapLocationDTO : 시 구군 동 정보", description = "시 구군 동 정보를 나타낸다.")
public class MapLocationDTO {

	@ApiModelProperty(value = "시 구군 동 이름")
	private String siGugunDongName;
	@ApiModelProperty(value = "동 코드")
	private String dongCode;

	public String getSiGugunDongName() {
		return siGugunDongName;
	}

	public void setSiGugunDongName(String siGugunDongName) {
		this.siGugunDongName = siGugunDongName;
	}

	public String getDongCode() {
		return dongCode;
	}

	public void setDongCode(String dongCode) {
		this.dongCode = dongCode;
	}

	@Override
	public String toString() {
		return "MapLocationDTO [siGugunDongName=" + siGugunDongName + ", dongCode=" + dongCode + "]";
	}

}

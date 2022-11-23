package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AvgDealamountDTO : 아파트 연도별 거래 평균 정보", description = "아파트 연도별 거래 평균 정보를 나타낸다.")
public class AvgDealamountDTO {

	@ApiModelProperty(value = "거래 연도")
	private String dealYear;
	@ApiModelProperty(value = "연도별 평균 거래가격")
	private int avgDealamount;

	public String getDealYear() {
		return dealYear;
	}

	public void setDealYear(String dealYear) {
		this.dealYear = dealYear;
	}

	public int getAvgDealamount() {
		return avgDealamount;
	}

	public void setAvgDealamount(int avgDealamount) {
		this.avgDealamount = avgDealamount;
	}

	@Override
	public String toString() {
		return "AvgDealamountDTO [dealYear=" + dealYear + ", avgDealamount=" + avgDealamount + "]";
	}

}

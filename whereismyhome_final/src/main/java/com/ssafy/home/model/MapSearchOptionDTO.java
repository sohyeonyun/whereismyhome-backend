package com.ssafy.home.model;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MapSearchOptionDTO : 아파트 검색 옵션 정보", description = "아파트 검색 옵션 정보를 나타낸다.")
public class MapSearchOptionDTO {

	@ApiModelProperty(value = "최소 거래금액")
	private int lowDealAmount;
	@ApiModelProperty(value = "최대 거래금액")
	private int highDealAmount;
	@ApiModelProperty(value = "최소 평수")
	private int lowArea;
	@ApiModelProperty(value = "최대 평수")
	private int highArea;
	@ApiModelProperty(value = "최근 x년")
	private int year;

	public int getLowDealAmount() {
		return lowDealAmount;
	}

	public void setLowDealAmount(int lowDealAmount) {
		this.lowDealAmount = lowDealAmount;
	}

	public int getHighDealAmount() {
		return highDealAmount;
	}

	public void setHighDealAmount(int highDealAmount) {
		this.highDealAmount = highDealAmount;
	}

	public int getLowArea() {
		return lowArea;
	}

	public void setLowArea(int lowArea) {
		this.lowArea = lowArea;
	}

	public int getHighArea() {
		return highArea;
	}

	public void setHighArea(int highArea) {
		this.highArea = highArea;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public MapSearchOptionDTO() {
		LocalDate now = LocalDate.now();
		
		this.lowDealAmount = 0;
		this.highDealAmount = Integer.MAX_VALUE;
		this.lowArea = 0;
		this.highArea = Integer.MAX_VALUE;
		this.year = now.getYear();
	}

	public MapSearchOptionDTO(int lowDealAmount, int highDealAmount, int lowArea, int highArea, int year) {
		this.lowDealAmount = lowDealAmount;
		this.highDealAmount = highDealAmount;
		this.lowArea = lowArea;
		this.highArea = highArea;
		this.year = year;
	}

	@Override
	public String toString() {
		return "MapSearchOptionAptnameDTO [lowDealAmount=" + lowDealAmount + ", highDealAmount=" + highDealAmount
				+ ", lowArea=" + lowArea + ", highArea=" + highArea + ", year=" + year + "]";
	}
}

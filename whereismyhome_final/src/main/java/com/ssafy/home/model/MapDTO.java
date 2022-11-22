package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MapDTO : 아파트 정보", description = "아파트 정보를 나타낸다.")
public class MapDTO {

	@ApiModelProperty(value = "아파트 이름")
	private String apartMentName;
	@ApiModelProperty(value = "아파트 위치")
	private String location;
	@ApiModelProperty(value = "아파트 건축연도")
	private String buildYear;
	@ApiModelProperty(value = "아파트 거래 가격")
	private String dealAmount;
	@ApiModelProperty(value = "아파트 거래 날짜")
	private String date;
	@ApiModelProperty(value = "아파트 평수")
	private String area;
	@ApiModelProperty(value = "아파트 층수")
	private String floor;
	@ApiModelProperty(value = "아파트 위도")
	private String lat;
	@ApiModelProperty(value = "아파트 경도")
	private String lng;
	@ApiModelProperty(value = "아파트 좋아요 눌린 수")
	private String houseLikeCount;
	@ApiModelProperty(value = "동 코드")
	private String dongcode;
	@ApiModelProperty(value = "아파트 코드")
	private String aptcode;

	public String getApartMentName() {
		return apartMentName;
	}

	public void setApartMentName(String apartMentName) {
		this.apartMentName = apartMentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getHouseLikeCount() {
		return houseLikeCount;
	}

	public void setHouseLikeCount(String houseLikeCount) {
		this.houseLikeCount = houseLikeCount;
	}

	public String getDongcode() {
		return dongcode;
	}

	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}

	public String getAptcode() {
		return aptcode;
	}

	public void setAptcode(String aptcode) {
		this.aptcode = aptcode;
	}

	@Override
	public String toString() {
		return "MapDTO [apartMentName=" + apartMentName + ", location=" + location + ", buildYear=" + buildYear
				+ ", dealAmount=" + dealAmount + ", date=" + date + ", area=" + area + ", floor=" + floor + ", lat="
				+ lat + ", lng=" + lng + ", houseLikeCount=" + houseLikeCount + ", dongcode=" + dongcode + ", aptcode="
				+ aptcode + "]";
	}

}

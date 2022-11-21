package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserHouseLikeDTO : 유저 관심 아파트 정보", description = "유저의 관심 아파트 정보를 나타낸다.")
public class UserHouseLikeDTO {

	@ApiModelProperty(value = "아파트 이름")
	private String apartmentName;
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
	private String house_like_count;

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

	public String getHouse_like_count() {
		return house_like_count;
	}

	public void setHouse_like_count(String house_like_count) {
		this.house_like_count = house_like_count;
	}

	@Override
	public String toString() {
		return "UserHouseLikeDTO [apartmentName=" + apartmentName + ", location=" + location + ", buildYear="
				+ buildYear + ", dealAmount=" + dealAmount + ", date=" + date + ", area=" + area + ", floor=" + floor
				+ ", lat=" + lat + ", lng=" + lng + ", house_like_count=" + house_like_count + "]";
	}

}

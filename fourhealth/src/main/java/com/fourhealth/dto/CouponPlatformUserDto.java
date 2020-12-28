package com.fourhealth.dto;

public class CouponPlatformUserDto {
	private String userPlatformCouponCode;
	private String userplatformGradeCode;
	private int userplatformCouponDetails;
	private String userplatformCouponRegDate;
	public String getUserPlatformCouponCode() {
		return userPlatformCouponCode;
	}
	public void setUserPlatformCouponCode(String userPlatformCouponCode) {
		this.userPlatformCouponCode = userPlatformCouponCode;
	}
	public String getUserplatformGradeCode() {
		return userplatformGradeCode;
	}
	public void setUserplatformGradeCode(String userplatformGradeCode) {
		this.userplatformGradeCode = userplatformGradeCode;
	}
	public int getUserplatformCouponDetails() {
		return userplatformCouponDetails;
	}
	public void setUserplatformCouponDetails(int userplatformCouponDetails) {
		this.userplatformCouponDetails = userplatformCouponDetails;
	}
	public String getUserplatformCouponRegDate() {
		return userplatformCouponRegDate;
	}
	public void setUserplatformCouponRegDate(String userplatformCouponRegDate) {
		this.userplatformCouponRegDate = userplatformCouponRegDate;
	}
	@Override
	public String toString() {
		return "CouponPlatformUserDto [userPlatformCouponCode=" + userPlatformCouponCode + ", userplatformGradeCode="
				+ userplatformGradeCode + ", userplatformCouponDetails=" + userplatformCouponDetails
				+ ", userplatformCouponRegDate=" + userplatformCouponRegDate + "]";
	}

}

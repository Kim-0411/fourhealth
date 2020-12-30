package com.fourhealth.dto;

public class CouponUserDto {
	private String userCouponCode;
	private String userId;
	private String userPlatformCouponCode;
	private String userCouponValidityStart;
	private String userCouponValidityEnd;
	private String userCouponRegDate;
	public String getUserCouponCode() {
		return userCouponCode;
	}
	public void setUserCouponCode(String userCouponCode) {
		this.userCouponCode = userCouponCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPlatformCouponCode() {
		return userPlatformCouponCode;
	}
	public void setUserPlatformCouponCode(String userPlatformCouponCode) {
		this.userPlatformCouponCode = userPlatformCouponCode;
	}
	public String getUserCouponValidityStart() {
		return userCouponValidityStart;
	}
	public void setUserCouponValidityStart(String userCouponValidityStart) {
		this.userCouponValidityStart = userCouponValidityStart;
	}
	public String getUserCouponValidityEnd() {
		return userCouponValidityEnd;
	}
	public void setUserCouponValidityEnd(String userCouponValidityEnd) {
		this.userCouponValidityEnd = userCouponValidityEnd;
	}
	public String getUserCouponRegDate() {
		return userCouponRegDate;
	}
	public void setUserCouponRegDate(String userCouponRegDate) {
		this.userCouponRegDate = userCouponRegDate;
	}
	@Override
	public String toString() {
		return "CouponUserDto [userCouponCode=" + userCouponCode + ", userId=" + userId + ", userPlatformCouponCode="
				+ userPlatformCouponCode + ", userCouponValidityStart=" + userCouponValidityStart
				+ ", userCouponValidityEnd=" + userCouponValidityEnd + ", userCouponRegDate=" + userCouponRegDate + "]";
	}

}

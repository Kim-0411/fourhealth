package com.fourhealth.dto;

public class PercentageCheckUserDto {

	private String userCheckPercentageCode;
	private String userId;
	private String trainerUserMatchingCode;
	private String trainerPromotionNoticeCode;
	private int userCheckPercentage;
	private String trainerPromotionRecruitCloseCode;
	private String userCheckPercentageRegDate;
	public String getUserCheckPercentageCode() {
		return userCheckPercentageCode;
	}
	public void setUserCheckPercentageCode(String userCheckPercentageCode) {
		this.userCheckPercentageCode = userCheckPercentageCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public String getTrainerPromotionNoticeCode() {
		return trainerPromotionNoticeCode;
	}
	public void setTrainerPromotionNoticeCode(String trainerPromotionNoticeCode) {
		this.trainerPromotionNoticeCode = trainerPromotionNoticeCode;
	}
	public int getUserCheckPercentage() {
		return userCheckPercentage;
	}
	public void setUserCheckPercentage(int userCheckPercentage) {
		this.userCheckPercentage = userCheckPercentage;
	}
	public String getTrainerPromotionRecruitCloseCode() {
		return trainerPromotionRecruitCloseCode;
	}
	public void setTrainerPromotionRecruitCloseCode(String trainerPromotionRecruitCloseCode) {
		this.trainerPromotionRecruitCloseCode = trainerPromotionRecruitCloseCode;
	}
	public String getUserCheckPercentageRegDate() {
		return userCheckPercentageRegDate;
	}
	public void setUserCheckPercentageRegDate(String userCheckPercentageRegDate) {
		this.userCheckPercentageRegDate = userCheckPercentageRegDate;
	}
	@Override
	public String toString() {
		return "PercentageCheckUserDto [userCheckPercentageCode=" + userCheckPercentageCode + ", userId=" + userId
				+ ", trainerUserMatchingCode=" + trainerUserMatchingCode + ", trainerPromotionNoticeCode="
				+ trainerPromotionNoticeCode + ", userCheckPercentage=" + userCheckPercentage
				+ ", trainerPromotionRecruitCloseCode=" + trainerPromotionRecruitCloseCode
				+ ", userCheckPercentageRegDate=" + userCheckPercentageRegDate + "]";
	}
}

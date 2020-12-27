package com.fourhealth.dto;

public class MatchingUserTrainerDto {

	private String trainerUserMatchingCode;
	private String trainerPromotionNoticeCode;
	private String userId;
	private String trainerId;
	private String userCouponCode;
	private String paymentMethodName;
	private int purchaseMoney;
	private String purchaseRegDate;
	private String purchaseFinishDate;
	private String userRegDate;
	private String trainerPromotionRecruitStartDate;
	private String trainerPromotionRecruitEndDate;
	private String trainerPromotionAttendStartDate;
	private String trainerMatchingSystemRegDate;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getUserCouponCode() {
		return userCouponCode;
	}
	public void setUserCouponCode(String userCouponCode) {
		this.userCouponCode = userCouponCode;
	}
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	public int getPurchaseMoney() {
		return purchaseMoney;
	}
	public void setPurchaseMoney(int purchaseMoney) {
		this.purchaseMoney = purchaseMoney;
	}
	public String getPurchaseRegDate() {
		return purchaseRegDate;
	}
	public void setPurchaseRegDate(String purchaseRegDate) {
		this.purchaseRegDate = purchaseRegDate;
	}
	public String getPurchaseFinishDate() {
		return purchaseFinishDate;
	}
	public void setPurchaseFinishDate(String purchaseFinishDate) {
		this.purchaseFinishDate = purchaseFinishDate;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	public String getTrainerPromotionRecruitStartDate() {
		return trainerPromotionRecruitStartDate;
	}
	public void setTrainerPromotionRecruitStartDate(String trainerPromotionRecruitStartDate) {
		this.trainerPromotionRecruitStartDate = trainerPromotionRecruitStartDate;
	}
	public String getTrainerPromotionRecruitEndDate() {
		return trainerPromotionRecruitEndDate;
	}
	public void setTrainerPromotionRecruitEndDate(String trainerPromotionRecruitEndDate) {
		this.trainerPromotionRecruitEndDate = trainerPromotionRecruitEndDate;
	}
	public String getTrainerPromotionAttendStartDate() {
		return trainerPromotionAttendStartDate;
	}
	public void setTrainerPromotionAttendStartDate(String trainerPromotionAttendStartDate) {
		this.trainerPromotionAttendStartDate = trainerPromotionAttendStartDate;
	}
	public String getTrainerMatchingSystemRegDate() {
		return trainerMatchingSystemRegDate;
	}
	public void setTrainerMatchingSystemRegDate(String trainerMatchingSystemRegDate) {
		this.trainerMatchingSystemRegDate = trainerMatchingSystemRegDate;
	}
	@Override
	public String toString() {
		return "MatchingUserTrainerDto [trainerUserMatchingCode=" + trainerUserMatchingCode
				+ ", trainerPromotionNoticeCode=" + trainerPromotionNoticeCode + ", userId=" + userId + ", trainerId="
				+ trainerId + ", userCouponCode=" + userCouponCode + ", paymentMethodName=" + paymentMethodName
				+ ", purchaseMoney=" + purchaseMoney + ", purchaseRegDate=" + purchaseRegDate + ", purchaseFinishDate="
				+ purchaseFinishDate + ", userRegDate=" + userRegDate + ", trainerPromotionRecruitStartDate="
				+ trainerPromotionRecruitStartDate + ", trainerPromotionRecruitEndDate="
				+ trainerPromotionRecruitEndDate + ", trainerPromotionAttendStartDate="
				+ trainerPromotionAttendStartDate + ", trainerMatchingSystemRegDate=" + trainerMatchingSystemRegDate
				+ "]";
	}
	
}

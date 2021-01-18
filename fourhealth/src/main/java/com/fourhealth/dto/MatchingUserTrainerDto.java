package com.fourhealth.dto;

public class MatchingUserTrainerDto {

	private String trainerUserMatchingCode; // 트레이너 사용자 매칭 코드
	private String trainerPromotionNoticeCode; // 트레이너 프로모션 모집 공고 코드
	private String userId; // 사용자 아이디
	private String trainerId; // 트레이너 아이디
	private String userCouponCode; // 사용자 보유 쿠폰 코드
	private String paymentMethodName; // 결제 방법 이름
	private int purchaseMoney; // 결제 금액
	private String purchaseRegDate; // 결제 등록 일자
	private String purchaseFinishDate; // 결제 완료 일자
	private String userRegDate; // 트레이너 매칭 등록일자
	private String trainerPromotionRecruitStartDate; // 트레이너 프로모션 모집 시작일
	private String trainerPromotionRecruitEndDate; // 트레이너 프로모션 모집 종료일
	private String trainerPromotionAttendStartDate;
	private String trainerPromotionRecruitCloseDate; // 트레이너 프로모션 참여 시작 일자
	private String trainerMatchingSystemRegDate; // 트레이너 매칭 시스템 등록 일자

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

	public String getTrainerPromotionRecruitCloseDate() {
		return trainerPromotionRecruitCloseDate;
	}

	public void setTrainerPromotionRecruitCloseDate(String trainerPromotionRecruitCloseDate) {
		this.trainerPromotionRecruitCloseDate = trainerPromotionRecruitCloseDate;
	}

	@Override
	public String toString() {
		return "MatchingUserTrainerDto [paymentMethodName=" + paymentMethodName + ", purchaseFinishDate="
				+ purchaseFinishDate + ", purchaseMoney=" + purchaseMoney + ", purchaseRegDate=" + purchaseRegDate
				+ ", trainerId=" + trainerId + ", trainerMatchingSystemRegDate=" + trainerMatchingSystemRegDate
				+ ", trainerPromotionAttendStartDate=" + trainerPromotionAttendStartDate
				+ ", trainerPromotionNoticeCode=" + trainerPromotionNoticeCode + ", trainerPromotionRecruitCloseDate="
				+ trainerPromotionRecruitCloseDate + ", trainerPromotionRecruitEndDate="
				+ trainerPromotionRecruitEndDate + ", trainerPromotionRecruitStartDate="
				+ trainerPromotionRecruitStartDate + ", trainerUserMatchingCode=" + trainerUserMatchingCode
				+ ", userCouponCode=" + userCouponCode + ", userId=" + userId + ", userRegDate=" + userRegDate + "]";
	}

}

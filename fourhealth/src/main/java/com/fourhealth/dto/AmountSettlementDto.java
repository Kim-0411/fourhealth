package com.fourhealth.dto;

public class AmountSettlementDto {
	private String settlementAmountCode;
	private String userId;
	private String trainerPromotionNoticeCode;
	private String trainerUserMatchingCode;
	private int settlementAmountPay;
	private String settlementAmountDay;
	public String getSettlementAmountCode() {
		return settlementAmountCode;
	}
	public void setSettlementAmountCode(String settlementAmountCode) {
		this.settlementAmountCode = settlementAmountCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerPromotionNoticeCode() {
		return trainerPromotionNoticeCode;
	}
	public void setTrainerPromotionNoticeCode(String trainerPromotionNoticeCode) {
		this.trainerPromotionNoticeCode = trainerPromotionNoticeCode;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public int getSettlementAmountPay() {
		return settlementAmountPay;
	}
	public void setSettlementAmountPay(int settlementAmountPay) {
		this.settlementAmountPay = settlementAmountPay;
	}
	public String getSettlementAmountDay() {
		return settlementAmountDay;
	}
	public void setSettlementAmountDay(String settlementAmountDay) {
		this.settlementAmountDay = settlementAmountDay;
	}
	@Override
	public String toString() {
		return "AmountSettlementDto [settlementAmountCode=" + settlementAmountCode + ", userId=" + userId
				+ ", trainerPromotionNoticeCode=" + trainerPromotionNoticeCode + ", trainerUserMatchingCode="
				+ trainerUserMatchingCode + ", settlementAmountPay=" + settlementAmountPay + ", settlementAmountDay="
				+ settlementAmountDay + "]";
	}
	
	
}

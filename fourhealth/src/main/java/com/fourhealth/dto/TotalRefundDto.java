package com.fourhealth.dto;

public class TotalRefundDto {

	private String refundTotalCode;
	private String trainerUserMatchingCode;
	private String userId;
	private String refundReasonFirstCategory;
	private String refundReasonDetail;
	private String refundRegDate;
	public String getRefundTotalCode() {
		return refundTotalCode;
	}
	public void setRefundTotalCode(String refundTotalCode) {
		this.refundTotalCode = refundTotalCode;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRefundReasonFirstCategory() {
		return refundReasonFirstCategory;
	}
	public void setRefundReasonFirstCategory(String refundReasonFirstCategory) {
		this.refundReasonFirstCategory = refundReasonFirstCategory;
	}
	public String getRefundReasonDetail() {
		return refundReasonDetail;
	}
	public void setRefundReasonDetail(String refundReasonDetail) {
		this.refundReasonDetail = refundReasonDetail;
	}
	public String getRefundRegDate() {
		return refundRegDate;
	}
	public void setRefundRegDate(String refundRegDate) {
		this.refundRegDate = refundRegDate;
	}
	@Override
	public String toString() {
		return "TotalRefundDto [refundTotalCode=" + refundTotalCode + ", trainerUserMatchingCode="
				+ trainerUserMatchingCode + ", userId=" + userId + ", refundReasonFirstCategory="
				+ refundReasonFirstCategory + ", refundReasonDetail=" + refundReasonDetail + ", refundRegDate="
				+ refundRegDate + "]";
	}
	
}

package com.fourhealth.dto;

public class NumRefundDto {

	private String refundNumCode;
	private String refundTotalCode;
	private String userId;
	private String refundConfirmName;
	private String refundMainBank;
	private String refundBankNum;
	private String refundBankMaster;
	private String refundRegDate;
	public String getRefundNumCode() {
		return refundNumCode;
	}
	public void setRefundNumCode(String refundNumCode) {
		this.refundNumCode = refundNumCode;
	}
	public String getRefundTotalCode() {
		return refundTotalCode;
	}
	public void setRefundTotalCode(String refundTotalCode) {
		this.refundTotalCode = refundTotalCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRefundConfirmName() {
		return refundConfirmName;
	}
	public void setRefundConfirmName(String refundConfirmName) {
		this.refundConfirmName = refundConfirmName;
	}
	public String getRefundMainBank() {
		return refundMainBank;
	}
	public void setRefundMainBank(String refundMainBank) {
		this.refundMainBank = refundMainBank;
	}
	public String getRefundBankNum() {
		return refundBankNum;
	}
	public void setRefundBankNum(String refundBankNum) {
		this.refundBankNum = refundBankNum;
	}
	public String getRefundBankMaster() {
		return refundBankMaster;
	}
	public void setRefundBankMaster(String refundBankMaster) {
		this.refundBankMaster = refundBankMaster;
	}
	public String getRefundRegDate() {
		return refundRegDate;
	}
	public void setRefundRegDate(String refundRegDate) {
		this.refundRegDate = refundRegDate;
	}
	@Override
	public String toString() {
		return "NumRefundDto [refundNumCode=" + refundNumCode + ", refundTotalCode=" + refundTotalCode + ", userId="
				+ userId + ", refundConfirmName=" + refundConfirmName + ", refundMainBank=" + refundMainBank
				+ ", refundBankNum=" + refundBankNum + ", refundBankMaster=" + refundBankMaster + ", refundRegDate="
				+ refundRegDate + "]";
	}
}

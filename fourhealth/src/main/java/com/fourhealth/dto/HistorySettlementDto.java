package com.fourhealth.dto;

public class HistorySettlementDto {

	private String settlementHistoryCode;
	private String settlementAmountCode;
	private int settlementAmountPay;
	private String settlementAmountDay;
	public String getSettlementHistoryCode() {
		return settlementHistoryCode;
	}
	public void setSettlementHistoryCode(String settlementHistoryCode) {
		this.settlementHistoryCode = settlementHistoryCode;
	}
	public String getSettlementAmountCode() {
		return settlementAmountCode;
	}
	public void setSettlementAmountCode(String settlementAmountCode) {
		this.settlementAmountCode = settlementAmountCode;
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
		return "HistorySettlementDto [settlementHistoryCode=" + settlementHistoryCode + ", settlementAmountCode="
				+ settlementAmountCode + ", settlementAmountPay=" + settlementAmountPay + ", settlementAmountDay="
				+ settlementAmountDay + "]";
	}
}

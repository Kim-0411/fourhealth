package com.fourhealth.dto;

public class TrainerBadDto {

	private String badTrainerCode;
	private String reportUserCode;
	private int badTrainerReportCount;
	private String badTrainerReportRegDate;
	public String getBadTrainerCode() {
		return badTrainerCode;
	}
	public void setBadTrainerCode(String badTrainerCode) {
		this.badTrainerCode = badTrainerCode;
	}
	public String getReportUserCode() {
		return reportUserCode;
	}
	public void setReportUserCode(String reportUserCode) {
		this.reportUserCode = reportUserCode;
	}
	public int getBadTrainerReportCount() {
		return badTrainerReportCount;
	}
	public void setBadTrainerReportCount(int badTrainerReportCount) {
		this.badTrainerReportCount = badTrainerReportCount;
	}
	public String getBadTrainerReportRegDate() {
		return badTrainerReportRegDate;
	}
	public void setBadTrainerReportRegDate(String badTrainerReportRegDate) {
		this.badTrainerReportRegDate = badTrainerReportRegDate;
	}
	@Override
	public String toString() {
		return "TrainerBadDto [badTrainerCode=" + badTrainerCode + ", reportUserCode=" + reportUserCode
				+ ", badTrainerReportCount=" + badTrainerReportCount + ", badTrainerReportRegDate="
				+ badTrainerReportRegDate + "]";
	}
	
}

package com.fourhealth.dto;

public class HistoryGradePlatformTrainerDto {

	private String trainerPlatformGradeHistoryCode; 
	private String userId;
	private String trainerGradeRateCode;
	private String trainerPlatformGradeHistoryBefore;
	private String trainerPlatformGradeHistoryAfter;
	private String trainerPlatformGradeHistoryRegDate;
	public String getTrainerPlatformGradeHistoryCode() {
		return trainerPlatformGradeHistoryCode;
	}
	public void setTrainerPlatformGradeHistoryCode(String trainerPlatformGradeHistoryCode) {
		this.trainerPlatformGradeHistoryCode = trainerPlatformGradeHistoryCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerGradeRateCode() {
		return trainerGradeRateCode;
	}
	public void setTrainerGradeRateCode(String trainerGradeRateCode) {
		this.trainerGradeRateCode = trainerGradeRateCode;
	}
	public String getTrainerPlatformGradeHistoryBefore() {
		return trainerPlatformGradeHistoryBefore;
	}
	public void setTrainerPlatformGradeHistoryBefore(String trainerPlatformGradeHistoryBefore) {
		this.trainerPlatformGradeHistoryBefore = trainerPlatformGradeHistoryBefore;
	}
	public String getTrainerPlatformGradeHistoryAfter() {
		return trainerPlatformGradeHistoryAfter;
	}
	public void setTrainerPlatformGradeHistoryAfter(String trainerPlatformGradeHistoryAfter) {
		this.trainerPlatformGradeHistoryAfter = trainerPlatformGradeHistoryAfter;
	}
	public String getTrainerPlatformGradeHistoryRegDate() {
		return trainerPlatformGradeHistoryRegDate;
	}
	public void setTrainerPlatformGradeHistoryRegDate(String trainerPlatformGradeHistoryRegDate) {
		this.trainerPlatformGradeHistoryRegDate = trainerPlatformGradeHistoryRegDate;
	}
	@Override
	public String toString() {
		return "HistoryGradePlatformTrainerDto [trainerPlatformGradeHistoryCode=" + trainerPlatformGradeHistoryCode
				+ ", userId=" + userId + ", trainerGradeRateCode=" + trainerGradeRateCode
				+ ", trainerPlatformGradeHistoryBefore=" + trainerPlatformGradeHistoryBefore
				+ ", trainerPlatformGradeHistoryAfter=" + trainerPlatformGradeHistoryAfter
				+ ", trainerPlatformGradeHistoryRegDate=" + trainerPlatformGradeHistoryRegDate + "]";
	}
}

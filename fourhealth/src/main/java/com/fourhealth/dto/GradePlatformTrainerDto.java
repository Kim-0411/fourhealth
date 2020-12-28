package com.fourhealth.dto;

public class GradePlatformTrainerDto {

	private String trainerPlatformGradeCode;
	private String trainerPlatformGradeName;
	private int trainerPlatformGradeDuty;
	private String trainerPlatformGradeRegDate;
	public String getTrainerPlatformGradeCode() {
		return trainerPlatformGradeCode;
	}
	public void setTrainerPlatformGradeCode(String trainerPlatformGradeCode) {
		this.trainerPlatformGradeCode = trainerPlatformGradeCode;
	}
	public String getTrainerPlatformGradeName() {
		return trainerPlatformGradeName;
	}
	public void setTrainerPlatformGradeName(String trainerPlatformGradeName) {
		this.trainerPlatformGradeName = trainerPlatformGradeName;
	}
	public int getTrainerPlatformGradeDuty() {
		return trainerPlatformGradeDuty;
	}
	public void setTrainerPlatformGradeDuty(int trainerPlatformGradeDuty) {
		this.trainerPlatformGradeDuty = trainerPlatformGradeDuty;
	}
	public String getTrainerPlatformGradeRegDate() {
		return trainerPlatformGradeRegDate;
	}
	public void setTrainerPlatformGradeRegDate(String trainerPlatformGradeRegDate) {
		this.trainerPlatformGradeRegDate = trainerPlatformGradeRegDate;
	}
	@Override
	public String toString() {
		return "GradePlatformTrainerDto [trainerPlatformGradeCode=" + trainerPlatformGradeCode
				+ ", trainerPlatformGradeName=" + trainerPlatformGradeName + ", trainerPlatformGradeDuty="
				+ trainerPlatformGradeDuty + ", trainerPlatformGradeRegDate=" + trainerPlatformGradeRegDate + "]";
	}
}

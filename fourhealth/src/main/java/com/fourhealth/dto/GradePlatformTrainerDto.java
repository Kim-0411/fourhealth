package com.fourhealth.dto;

public class GradePlatformTrainerDto {

	private String trainerPlatformGradeCode;	//트레이너 플렛폼 공통 등급 관리 코드 
	private String trainerPlatformGradeName;	//트레이너 플렛폼 공통 등급 관리명
	private int trainerPlatformGradeDuty;		//트레이너 플렛폼 공통 등급에 따른 최종 수수료률
	private String trainerPlatformGradeRegDate;	//트레이너 플렛폼 공통 등급 관리 등록 일자
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

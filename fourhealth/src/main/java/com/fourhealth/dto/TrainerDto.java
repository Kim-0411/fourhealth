package com.fourhealth.dto;

public class TrainerDto {

	private String userId;						//회원 공통 관리 아이디
	private String trainerPlatformGradeCode;	//트레이너 플렛폼 공통 등급 관리 코드 
	private String trainerAccessCode;			//트레이너 가입 승인 코드
	private String trainerGym;					//트레이너 소속 GYM
	private String trainerGymAddress;			//트레이너 소속 GYM 주소
	private String trainerAccessReason;			//트레이너 가입 승인 사유
	private String trainerAccessRegDate;		//트레이너 가입승인별 등록 일자
	private String trainerRegDate;				//트레이너 등록 일자
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerPlatformGradeCode() {
		return trainerPlatformGradeCode;
	}
	public void setTrainerPlatformGradeCode(String trainerPlatformGradeCode) {
		this.trainerPlatformGradeCode = trainerPlatformGradeCode;
	}
	public String getTrainerAccessCode() {
		return trainerAccessCode;
	}
	public void setTrainerAccessCode(String trainerAccessCode) {
		this.trainerAccessCode = trainerAccessCode;
	}
	public String getTrainerGym() {
		return trainerGym;
	}
	public void setTrainerGym(String trainerGym) {
		this.trainerGym = trainerGym;
	}
	public String getTrainerGymAddress() {
		return trainerGymAddress;
	}
	public void setTrainerGymAddress(String trainerGymAddress) {
		this.trainerGymAddress = trainerGymAddress;
	}
	public String getTrainerAccessReason() {
		return trainerAccessReason;
	}
	public void setTrainerAccessReason(String trainerAccessReason) {
		this.trainerAccessReason = trainerAccessReason;
	}
	public String getTrainerAccessRegDate() {
		return trainerAccessRegDate;
	}
	public void setTrainerAccessRegDate(String trainerAccessRegDate) {
		this.trainerAccessRegDate = trainerAccessRegDate;
	}
	public String getTrainerRegDate() {
		return trainerRegDate;
	}
	public void setTrainerRegDate(String trainerRegDate) {
		this.trainerRegDate = trainerRegDate;
	}
	@Override
	public String toString() {
		return "TrainerDto [userId=" + userId + ", trainerPlatformGradeCode=" + trainerPlatformGradeCode
				+ ", trainerAccessCode=" + trainerAccessCode + ", trainerGym=" + trainerGym + ", trainerGymAddress="
				+ trainerGymAddress + ", trainerAccessReason=" + trainerAccessReason + ", trainerAccessRegDate="
				+ trainerAccessRegDate + ", trainerRegDate=" + trainerRegDate + "]";
	}
	
}

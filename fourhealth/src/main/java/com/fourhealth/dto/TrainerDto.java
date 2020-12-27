package com.fourhealth.dto;

public class TrainerDto {

	private String userId;
	private String trainerPlatformGradeCode;
	private String trainerAccessCode;
	private String trainerGym;
	private String trainerGymAddress;
	private String trainerAccessReason;
	private String trainerAccessRegDate;
	private String trainerRegDate;
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

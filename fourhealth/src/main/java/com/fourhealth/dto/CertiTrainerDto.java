package com.fourhealth.dto;

public class CertiTrainerDto {
	private String trainerCertiAddCode;
	private String userId;
	private String trainerCertiAuthorityCode;
	private String trainerCertiNum;
	private String trainerCertiAcquisitionDate;
	private String trainerCertiRegistrationDate;
	public String getTrainerCertiAddCode() {
		return trainerCertiAddCode;
	}
	public void setTrainerCertiAddCode(String trainerCertiAddCode) {
		this.trainerCertiAddCode = trainerCertiAddCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerCertiAuthorityCode() {
		return trainerCertiAuthorityCode;
	}
	public void setTrainerCertiAuthorityCode(String trainerCertiAuthorityCode) {
		this.trainerCertiAuthorityCode = trainerCertiAuthorityCode;
	}
	public String getTrainerCertiNum() {
		return trainerCertiNum;
	}
	public void setTrainerCertiNum(String trainerCertiNum) {
		this.trainerCertiNum = trainerCertiNum;
	}
	public String getTrainerCertiAcquisitionDate() {
		return trainerCertiAcquisitionDate;
	}
	public void setTrainerCertiAcquisitionDate(String trainerCertiAcquisitionDate) {
		this.trainerCertiAcquisitionDate = trainerCertiAcquisitionDate;
	}
	public String getTrainerCertiRegistrationDate() {
		return trainerCertiRegistrationDate;
	}
	public void setTrainerCertiRegistrationDate(String trainerCertiRegistrationDate) {
		this.trainerCertiRegistrationDate = trainerCertiRegistrationDate;
	}
	@Override
	public String toString() {
		return "CertiTrainerDto [trainerCertiAddCode=" + trainerCertiAddCode + ", userId=" + userId
				+ ", trainerCertiAuthorityCode=" + trainerCertiAuthorityCode + ", trainerCertiNum=" + trainerCertiNum
				+ ", trainerCertiAcquisitionDate=" + trainerCertiAcquisitionDate + ", trainerCertiRegistrationDate="
				+ trainerCertiRegistrationDate + "]";
	}

}

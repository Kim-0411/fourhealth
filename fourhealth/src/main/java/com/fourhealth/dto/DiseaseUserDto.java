package com.fourhealth.dto;

public class DiseaseUserDto {

	private String userDiseaseAddCode;
	private String userId;
	private String diseaseCode;
	private String userDiseaseAddRegDate;
	public String getUserDiseaseAddCode() {
		return userDiseaseAddCode;
	}
	public void setUserDiseaseAddCode(String userDiseaseAddCode) {
		this.userDiseaseAddCode = userDiseaseAddCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getUserDiseaseAddRegDate() {
		return userDiseaseAddRegDate;
	}
	public void setUserDiseaseAddRegDate(String userDiseaseAddRegDate) {
		this.userDiseaseAddRegDate = userDiseaseAddRegDate;
	}
	@Override
	public String toString() {
		return "DiseaseUserDto [userDiseaseAddCode=" + userDiseaseAddCode + ", userId=" + userId + ", diseaseCode="
				+ diseaseCode + ", userDiseaseAddRegDate=" + userDiseaseAddRegDate + "]";
	}
}

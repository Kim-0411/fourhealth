package com.fourhealth.dto;

public class AuthorityCertTrainerDbDto {
	private String trainerCertiAuthorityCode;
	private String trainerCertiName;
	private String trainerCertiAuthority;
	private String trainerCertiAuthorityRegDate;
	public String getTrainerCertiAuthorityCode() {
		return trainerCertiAuthorityCode;
	}
	public void setTrainerCertiAuthorityCode(String trainerCertiAuthorityCode) {
		this.trainerCertiAuthorityCode = trainerCertiAuthorityCode;
	}
	public String getTrainerCertiName() {
		return trainerCertiName;
	}
	public void setTrainerCertiName(String trainerCertiName) {
		this.trainerCertiName = trainerCertiName;
	}
	public String getTrainerCertiAuthority() {
		return trainerCertiAuthority;
	}
	public void setTrainerCertiAuthority(String trainerCertiAuthority) {
		this.trainerCertiAuthority = trainerCertiAuthority;
	}
	public String getTrainerCertiAuthorityRegDate() {
		return trainerCertiAuthorityRegDate;
	}
	public void setTrainerCertiAuthorityRegDate(String trainerCertiAuthorityRegDate) {
		this.trainerCertiAuthorityRegDate = trainerCertiAuthorityRegDate;
	}
	@Override
	public String toString() {
		return "AuthorityCertTrainerDbDto [trainerCertiAuthorityCode=" + trainerCertiAuthorityCode
				+ ", trainerCertiName=" + trainerCertiName + ", trainerCertiAuthority=" + trainerCertiAuthority
				+ ", trainerCertiAuthorityRegDate=" + trainerCertiAuthorityRegDate + "]";
	}
	
}

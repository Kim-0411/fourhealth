package com.fourhealth.dto;

public class CheckTrainerDto {
	private String trainerCheckCode;
	private String trainerCheckName;
	private String trainerCheckRegDate;
	public String getTrainerCheckCode() {
		return trainerCheckCode;
	}
	public void setTrainerCheckCode(String trainerCheckCode) {
		this.trainerCheckCode = trainerCheckCode;
	}
	public String getTrainerCheckName() {
		return trainerCheckName;
	}
	public void setTrainerCheckName(String trainerCheckName) {
		this.trainerCheckName = trainerCheckName;
	}
	public String getTrainerCheckRegDate() {
		return trainerCheckRegDate;
	}
	public void setTrainerCheckRegDate(String trainerCheckRegDate) {
		this.trainerCheckRegDate = trainerCheckRegDate;
	}
	@Override
	public String toString() {
		return "CheckTrainerDto [trainerCheckCode=" + trainerCheckCode + ", trainerCheckName=" + trainerCheckName
				+ ", trainerCheckRegDate=" + trainerCheckRegDate + "]";
	}
	
}

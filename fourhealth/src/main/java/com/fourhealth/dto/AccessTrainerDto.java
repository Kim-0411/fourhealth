package com.fourhealth.dto;

public class AccessTrainerDto {
	private String trainerAccessCode;
	private String trainerAccessName;
	public String getTrainerAccessCode() {
		return trainerAccessCode;
	}
	public void setTrainerAccessCode(String trainerAccessCode) {
		this.trainerAccessCode = trainerAccessCode;
	}
	public String getTrainerAccessName() {
		return trainerAccessName;
	}
	public void setTrainerAccessName(String trainerAccessName) {
		this.trainerAccessName = trainerAccessName;
	}
	@Override
	public String toString() {
		return "AccessTrainerDto [trainerAccessCode=" + trainerAccessCode + ", trainerAccessName=" + trainerAccessName
				+ "]";
	}
	
}
	

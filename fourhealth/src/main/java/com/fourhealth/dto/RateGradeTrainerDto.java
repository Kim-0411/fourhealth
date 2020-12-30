package com.fourhealth.dto;

public class RateGradeTrainerDto {

	private String trainerGradeRateCode;
	private String estimationCode;
	private String trainerUserMatchingCode;
	private String userId;
	private float trainerEstimationAverage;
	private int trainerCountMatchingNum;
	private String trainerEstimationAverageRegDate;
	public String getTrainerGradeRateCode() {
		return trainerGradeRateCode;
	}
	public void setTrainerGradeRateCode(String trainerGradeRateCode) {
		this.trainerGradeRateCode = trainerGradeRateCode;
	}
	public String getEstimationCode() {
		return estimationCode;
	}
	public void setEstimationCode(String estimationCode) {
		this.estimationCode = estimationCode;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public float getTrainerEstimationAverage() {
		return trainerEstimationAverage;
	}
	public void setTrainerEstimationAverage(float trainerEstimationAverage) {
		this.trainerEstimationAverage = trainerEstimationAverage;
	}
	public int getTrainerCountMatchingNum() {
		return trainerCountMatchingNum;
	}
	public void setTrainerCountMatchingNum(int trainerCountMatchingNum) {
		this.trainerCountMatchingNum = trainerCountMatchingNum;
	}
	public String getTrainerEstimationAverageRegDate() {
		return trainerEstimationAverageRegDate;
	}
	public void setTrainerEstimationAverageRegDate(String trainerEstimationAverageRegDate) {
		this.trainerEstimationAverageRegDate = trainerEstimationAverageRegDate;
	}
	@Override
	public String toString() {
		return "RateGradeTrainerDto [trainerGradeRateCode=" + trainerGradeRateCode + ", estimationCode="
				+ estimationCode + ", trainerUserMatchingCode=" + trainerUserMatchingCode + ", userId=" + userId
				+ ", trainerEstimationAverage=" + trainerEstimationAverage + ", trainerCountMatchingNum="
				+ trainerCountMatchingNum + ", trainerEstimationAverageRegDate=" + trainerEstimationAverageRegDate
				+ "]";
	}
	
}

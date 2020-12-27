package com.fourhealth.dto;

public class EstimationDto {

	private String estimationCode;
	private String userId;
	private String trainerId;
	private String trainerUserMatchingCode;
	private int estimationScore;
	private String estimationDetails;
	private String estimationRegDate;
	public String getEstimationCode() {
		return estimationCode;
	}
	public void setEstimationCode(String estimationCode) {
		this.estimationCode = estimationCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public int getEstimationScore() {
		return estimationScore;
	}
	public void setEstimationScore(int estimationScore) {
		this.estimationScore = estimationScore;
	}
	public String getEstimationDetails() {
		return estimationDetails;
	}
	public void setEstimationDetails(String estimationDetails) {
		this.estimationDetails = estimationDetails;
	}
	public String getEstimationRegDate() {
		return estimationRegDate;
	}
	public void setEstimationRegDate(String estimationRegDate) {
		this.estimationRegDate = estimationRegDate;
	}
	@Override
	public String toString() {
		return "EstimationDto [estimationCode=" + estimationCode + ", userId=" + userId + ", trainerId=" + trainerId
				+ ", trainerUserMatchingCode=" + trainerUserMatchingCode + ", estimationScore=" + estimationScore
				+ ", estimationDetails=" + estimationDetails + ", estimationRegDate=" + estimationRegDate + "]";
	}
}

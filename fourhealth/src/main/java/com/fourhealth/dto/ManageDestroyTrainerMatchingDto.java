package com.fourhealth.dto;

public class ManageDestroyTrainerMatchingDto {

	private String matchingTrainerDestroyManageCode;
	private String trainerUserMatchingCode;
	private String userId;
	private String trainerId;
	private String matchingTrainingDestroyName;
	private String userMatchingDestroyReason;
	private String matchingTrainingDestroyManageRegDate;
	public String getMatchingTrainerDestroyManageCode() {
		return matchingTrainerDestroyManageCode;
	}
	public void setMatchingTrainerDestroyManageCode(String matchingTrainerDestroyManageCode) {
		this.matchingTrainerDestroyManageCode = matchingTrainerDestroyManageCode;
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
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getMatchingTrainingDestroyName() {
		return matchingTrainingDestroyName;
	}
	public void setMatchingTrainingDestroyName(String matchingTrainingDestroyName) {
		this.matchingTrainingDestroyName = matchingTrainingDestroyName;
	}
	public String getUserMatchingDestroyReason() {
		return userMatchingDestroyReason;
	}
	public void setUserMatchingDestroyReason(String userMatchingDestroyReason) {
		this.userMatchingDestroyReason = userMatchingDestroyReason;
	}
	public String getMatchingTrainingDestroyManageRegDate() {
		return matchingTrainingDestroyManageRegDate;
	}
	public void setMatchingTrainingDestroyManageRegDate(String matchingTrainingDestroyManageRegDate) {
		this.matchingTrainingDestroyManageRegDate = matchingTrainingDestroyManageRegDate;
	}
	@Override
	public String toString() {
		return "ManageDestroyTrainerMatchingDto [matchingTrainerDestroyManageCode=" + matchingTrainerDestroyManageCode
				+ ", trainerUserMatchingCode=" + trainerUserMatchingCode + ", userId=" + userId + ", trainerId="
				+ trainerId + ", matchingTrainingDestroyName=" + matchingTrainingDestroyName
				+ ", userMatchingDestroyReason=" + userMatchingDestroyReason + ", matchingTrainingDestroyManageRegDate="
				+ matchingTrainingDestroyManageRegDate + "]";
	}
}

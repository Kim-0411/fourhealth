package com.fourhealth.dto;

public class CheckTrainerExerciseUserDto {
	private String userExerciseTrainerCheckCode;
	private String userId;
	private String trainerId;
	private String userDailyExerciseCode;
	private String trainerCheckCode;
	private String userExerciseTrainerCheckComment;
	private String userExerciseTrainerCheckRegDate;
	public String getUserExerciseTrainerCheckCode() {
		return userExerciseTrainerCheckCode;
	}
	public void setUserExerciseTrainerCheckCode(String userExerciseTrainerCheckCode) {
		this.userExerciseTrainerCheckCode = userExerciseTrainerCheckCode;
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
	public String getUserDailyExerciseCode() {
		return userDailyExerciseCode;
	}
	public void setUserDailyExerciseCode(String userDailyExerciseCode) {
		this.userDailyExerciseCode = userDailyExerciseCode;
	}
	public String getTrainerCheckCode() {
		return trainerCheckCode;
	}
	public void setTrainerCheckCode(String trainerCheckCode) {
		this.trainerCheckCode = trainerCheckCode;
	}
	public String getUserExerciseTrainerCheckComment() {
		return userExerciseTrainerCheckComment;
	}
	public void setUserExerciseTrainerCheckComment(String userExerciseTrainerCheckComment) {
		this.userExerciseTrainerCheckComment = userExerciseTrainerCheckComment;
	}
	public String getUserExerciseTrainerCheckRegDate() {
		return userExerciseTrainerCheckRegDate;
	}
	public void setUserExerciseTrainerCheckRegDate(String userExerciseTrainerCheckRegDate) {
		this.userExerciseTrainerCheckRegDate = userExerciseTrainerCheckRegDate;
	}
	@Override
	public String toString() {
		return "CheckTrainerExerciseUserDto [userExerciseTrainerCheckCode=" + userExerciseTrainerCheckCode + ", userId="
				+ userId + ", trainerId=" + trainerId + ", userDailyExerciseCode=" + userDailyExerciseCode
				+ ", trainerCheckCode=" + trainerCheckCode + ", userExerciseTrainerCheckComment="
				+ userExerciseTrainerCheckComment + ", userExerciseTrainerCheckRegDate="
				+ userExerciseTrainerCheckRegDate + "]";
	}

}

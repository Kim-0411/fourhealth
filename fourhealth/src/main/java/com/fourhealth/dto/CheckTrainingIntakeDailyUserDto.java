package com.fourhealth.dto;

import org.springframework.web.multipart.MultipartFile;

public class CheckTrainingIntakeDailyUserDto {
	private String userDailyIntakeTrainingCheckCode;
	private String userId;
	private String trainerId;
	private String userDailyIntakeCode;
	private String trainerCheckCode;
	private String userDailyIntakeTrainingCheckComment;
	private MultipartFile userDailyIntakeTrainingCheckUploadFile;
	private String userDailyIntakeTrainerCheckRegDate;
	public String getUserDailyIntakeTrainingCheckCode() {
		return userDailyIntakeTrainingCheckCode;
	}
	public void setUserDailyIntakeTrainingCheckCode(String userDailyIntakeTrainingCheckCode) {
		this.userDailyIntakeTrainingCheckCode = userDailyIntakeTrainingCheckCode;
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
	public String getUserDailyIntakeCode() {
		return userDailyIntakeCode;
	}
	public void setUserDailyIntakeCode(String userDailyIntakeCode) {
		this.userDailyIntakeCode = userDailyIntakeCode;
	}
	public String getTrainerCheckCode() {
		return trainerCheckCode;
	}
	public void setTrainerCheckCode(String trainerCheckCode) {
		this.trainerCheckCode = trainerCheckCode;
	}
	public String getUserDailyIntakeTrainingCheckComment() {
		return userDailyIntakeTrainingCheckComment;
	}
	public void setUserDailyIntakeTrainingCheckComment(String userDailyIntakeTrainingCheckComment) {
		this.userDailyIntakeTrainingCheckComment = userDailyIntakeTrainingCheckComment;
	}
	public MultipartFile getUserDailyIntakeTrainingCheckUploadFile() {
		return userDailyIntakeTrainingCheckUploadFile;
	}
	public void setUserDailyIntakeTrainingCheckUploadFile(MultipartFile userDailyIntakeTrainingCheckUploadFile) {
		this.userDailyIntakeTrainingCheckUploadFile = userDailyIntakeTrainingCheckUploadFile;
	}
	public String getUserDailyIntakeTrainerCheckRegDate() {
		return userDailyIntakeTrainerCheckRegDate;
	}
	public void setUserDailyIntakeTrainerCheckRegDate(String userDailyIntakeTrainerCheckRegDate) {
		this.userDailyIntakeTrainerCheckRegDate = userDailyIntakeTrainerCheckRegDate;
	}
	@Override
	public String toString() {
		return "CheckTrainingIntakeDailyUserDto [userDailyIntakeTrainingCheckCode=" + userDailyIntakeTrainingCheckCode
				+ ", userId=" + userId + ", trainerId=" + trainerId + ", userDailyIntakeCode=" + userDailyIntakeCode
				+ ", trainerCheckCode=" + trainerCheckCode + ", userDailyIntakeTrainingCheckComment="
				+ userDailyIntakeTrainingCheckComment + ", userDailyIntakeTrainingCheckUploadFile="
				+ userDailyIntakeTrainingCheckUploadFile + ", userDailyIntakeTrainerCheckRegDate="
				+ userDailyIntakeTrainerCheckRegDate + "]";
	}

}

package com.fourhealth.dto;

import org.springframework.web.multipart.MultipartFile;

public class CheckTrainerBodyUserDto {
	private String userBodyTrainerCheckCode;
	private String userId;
	private String trainerId;
	private String userBodySizeCode;
	private String trainerCheckCode;
	private String userBodyTrainerCheckComment;
	private MultipartFile userBodyTrainerCheckUploadFile;
	private String trainerCheckRegDate;
	public String getUserBodyTrainerCheckCode() {
		return userBodyTrainerCheckCode;
	}
	public void setUserBodyTrainerCheckCode(String userBodyTrainerCheckCode) {
		this.userBodyTrainerCheckCode = userBodyTrainerCheckCode;
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
	public String getUserBodySizeCode() {
		return userBodySizeCode;
	}
	public void setUserBodySizeCode(String userBodySizeCode) {
		this.userBodySizeCode = userBodySizeCode;
	}
	public String getTrainerCheckCode() {
		return trainerCheckCode;
	}
	public void setTrainerCheckCode(String trainerCheckCode) {
		this.trainerCheckCode = trainerCheckCode;
	}
	public String getUserBodyTrainerCheckComment() {
		return userBodyTrainerCheckComment;
	}
	public void setUserBodyTrainerCheckComment(String userBodyTrainerCheckComment) {
		this.userBodyTrainerCheckComment = userBodyTrainerCheckComment;
	}
	public MultipartFile getUserBodyTrainerCheckUploadFile() {
		return userBodyTrainerCheckUploadFile;
	}
	public void setUserBodyTrainerCheckUploadFile(MultipartFile userBodyTrainerCheckUploadFile) {
		this.userBodyTrainerCheckUploadFile = userBodyTrainerCheckUploadFile;
	}
	public String getTrainerCheckRegDate() {
		return trainerCheckRegDate;
	}
	public void setTrainerCheckRegDate(String trainerCheckRegDate) {
		this.trainerCheckRegDate = trainerCheckRegDate;
	}
	@Override
	public String toString() {
		return "CheckTrainerBodyUserDto [userBodyTrainerCheckCode=" + userBodyTrainerCheckCode + ", userId=" + userId
				+ ", trainerId=" + trainerId + ", userBodySizeCode=" + userBodySizeCode + ", trainerCheckCode="
				+ trainerCheckCode + ", userBodyTrainerCheckComment=" + userBodyTrainerCheckComment
				+ ", userBodyTrainerCheckUploadFile=" + userBodyTrainerCheckUploadFile + ", trainerCheckRegDate="
				+ trainerCheckRegDate + "]";
	}
	
}

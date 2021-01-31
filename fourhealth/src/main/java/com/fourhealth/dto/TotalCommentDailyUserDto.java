package com.fourhealth.dto;

public class TotalCommentDailyUserDto {

	private String userDailyCommentTotalCode;
	private String userId;
	private String trainerId; 
	private String userDailyIntakeCode;
	private String userDailyExerciseCode;
	private String userBodySizeCode;
	private String userDailyComment;
	private String userDailyCommentTotalRegDate;
	public String getUserDailyCommentTotalCode() {
		return userDailyCommentTotalCode;
	}
	public void setUserDailyCommentTotalCode(String userDailyCommentTotalCode) {
		this.userDailyCommentTotalCode = userDailyCommentTotalCode;
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
	public String getUserDailyExerciseCode() {
		return userDailyExerciseCode;
	}
	public void setUserDailyExerciseCode(String userDailyExerciseCode) {
		this.userDailyExerciseCode = userDailyExerciseCode;
	}
	public String getUserBodySizeCode() {
		return userBodySizeCode;
	}
	public void setUserBodySizeCode(String userBodySizeCode) {
		this.userBodySizeCode = userBodySizeCode;
	}
	public String getUserDailyComment() {
		return userDailyComment;
	}
	public void setUserDailyComment(String userDailyComment) {
		this.userDailyComment = userDailyComment;
	}
	public String getUserDailyCommentTotalRegDate() {
		return userDailyCommentTotalRegDate;
	}
	public void setUserDailyCommentTotalRegDate(String userDailyCommentTotalRegDate) {
		this.userDailyCommentTotalRegDate = userDailyCommentTotalRegDate;
	}
	@Override
	public String toString() {
		return "TotalCommentDailyUserDto [userDailyCommentTotalCode=" + userDailyCommentTotalCode + ", userId=" + userId
				+ ", trainerId=" + trainerId + ", userDailyIntakeCode=" + userDailyIntakeCode
				+ ", userDailyExerciseCode=" + userDailyExerciseCode + ", userBodySizeCode=" + userBodySizeCode
				+ ", userDailyComment=" + userDailyComment + ", userDailyCommentTotalRegDate="
				+ userDailyCommentTotalRegDate + "]";
	}
	
}
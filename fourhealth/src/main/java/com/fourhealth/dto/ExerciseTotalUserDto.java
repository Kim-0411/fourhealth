package com.fourhealth.dto;

public class ExerciseTotalUserDto {

	private String userTotalExerciseCode;
	private String userId;
	private String matchingExerciseScheduleCode;
	private int userTotalExerciseRatio;
	private String userTotalExerciseRegDate;
	public String getUserTotalExerciseCode() {
		return userTotalExerciseCode;
	}
	public void setUserTotalExerciseCode(String userTotalExerciseCode) {
		this.userTotalExerciseCode = userTotalExerciseCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMatchingExerciseScheduleCode() {
		return matchingExerciseScheduleCode;
	}
	public void setMatchingExerciseScheduleCode(String matchingExerciseScheduleCode) {
		this.matchingExerciseScheduleCode = matchingExerciseScheduleCode;
	}
	public int getUserTotalExerciseRatio() {
		return userTotalExerciseRatio;
	}
	public void setUserTotalExerciseRatio(int userTotalExerciseRatio) {
		this.userTotalExerciseRatio = userTotalExerciseRatio;
	}
	public String getUserTotalExerciseRegDate() {
		return userTotalExerciseRegDate;
	}
	public void setUserTotalExerciseRegDate(String userTotalExerciseRegDate) {
		this.userTotalExerciseRegDate = userTotalExerciseRegDate;
	}
	@Override
	public String toString() {
		return "ExerciseTotalUserDto [userTotalExerciseCode=" + userTotalExerciseCode + ", userId=" + userId
				+ ", matchingExerciseScheduleCode=" + matchingExerciseScheduleCode + ", userTotalExerciseRatio="
				+ userTotalExerciseRatio + ", userTotalExerciseRegDate=" + userTotalExerciseRegDate + "]";
	}
}

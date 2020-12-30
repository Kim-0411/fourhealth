package com.fourhealth.dto;

import java.sql.Blob;

public class ExerciseDailyUserDto {

	private String userDailyExerciseCode;
	private String userId;
	private String matchingExerciseScheduleCode;
	private String userTotalExerciseCode;
	private int userExerciseRealTime;
	private int userRealCalUse;
	private Blob userDailyExerciseUploadFile;
	private String userExerciseRegDate;
	public String getUserDailyExerciseCode() {
		return userDailyExerciseCode;
	}
	public void setUserDailyExerciseCode(String userDailyExerciseCode) {
		this.userDailyExerciseCode = userDailyExerciseCode;
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
	public String getUserTotalExerciseCode() {
		return userTotalExerciseCode;
	}
	public void setUserTotalExerciseCode(String userTotalExerciseCode) {
		this.userTotalExerciseCode = userTotalExerciseCode;
	}
	public int getUserExerciseRealTime() {
		return userExerciseRealTime;
	}
	public void setUserExerciseRealTime(int userExerciseRealTime) {
		this.userExerciseRealTime = userExerciseRealTime;
	}
	public int getUserRealCalUse() {
		return userRealCalUse;
	}
	public void setUserRealCalUse(int userRealCalUse) {
		this.userRealCalUse = userRealCalUse;
	}
	public Blob getUserDailyExerciseUploadFile() {
		return userDailyExerciseUploadFile;
	}
	public void setUserDailyExerciseUploadFile(Blob userDailyExerciseUploadFile) {
		this.userDailyExerciseUploadFile = userDailyExerciseUploadFile;
	}
	public String getUserExerciseRegDate() {
		return userExerciseRegDate;
	}
	public void setUserExerciseRegDate(String userExerciseRegDate) {
		this.userExerciseRegDate = userExerciseRegDate;
	}
	@Override
	public String toString() {
		return "ExerciseDailyUserDto [userDailyExerciseCode=" + userDailyExerciseCode + ", userId=" + userId
				+ ", matchingExerciseScheduleCode=" + matchingExerciseScheduleCode + ", userTotalExerciseCode="
				+ userTotalExerciseCode + ", userExerciseRealTime=" + userExerciseRealTime + ", userRealCalUse="
				+ userRealCalUse + ", userDailyExerciseUploadFile=" + userDailyExerciseUploadFile
				+ ", userExerciseRegDate=" + userExerciseRegDate + "]";
	}
}

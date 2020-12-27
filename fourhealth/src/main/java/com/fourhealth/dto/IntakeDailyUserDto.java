package com.fourhealth.dto;

import java.sql.Blob;
import java.sql.Timestamp;

public class IntakeDailyUserDto {

	private String userDailyIntakeCode;
	private String userId;
	private String matchingFoodScheduleCode;
	private String userDailyTotalIntakeCode;
	private Timestamp userDailyIntakeTime;
	private String userDailyIntakeContents;
	private Blob userDailyIntakeUploadFile;
	private String userDailyIntakeRegDate;
	public String getUserDailyIntakeCode() {
		return userDailyIntakeCode;
	}
	public void setUserDailyIntakeCode(String userDailyIntakeCode) {
		this.userDailyIntakeCode = userDailyIntakeCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMatchingFoodScheduleCode() {
		return matchingFoodScheduleCode;
	}
	public void setMatchingFoodScheduleCode(String matchingFoodScheduleCode) {
		this.matchingFoodScheduleCode = matchingFoodScheduleCode;
	}
	public String getUserDailyTotalIntakeCode() {
		return userDailyTotalIntakeCode;
	}
	public void setUserDailyTotalIntakeCode(String userDailyTotalIntakeCode) {
		this.userDailyTotalIntakeCode = userDailyTotalIntakeCode;
	}
	public Timestamp getUserDailyIntakeTime() {
		return userDailyIntakeTime;
	}
	public void setUserDailyIntakeTime(Timestamp userDailyIntakeTime) {
		this.userDailyIntakeTime = userDailyIntakeTime;
	}
	public String getUserDailyIntakeContents() {
		return userDailyIntakeContents;
	}
	public void setUserDailyIntakeContents(String userDailyIntakeContents) {
		this.userDailyIntakeContents = userDailyIntakeContents;
	}
	public Blob getUserDailyIntakeUploadFile() {
		return userDailyIntakeUploadFile;
	}
	public void setUserDailyIntakeUploadFile(Blob userDailyIntakeUploadFile) {
		this.userDailyIntakeUploadFile = userDailyIntakeUploadFile;
	}
	public String getUserDailyIntakeRegDate() {
		return userDailyIntakeRegDate;
	}
	public void setUserDailyIntakeRegDate(String userDailyIntakeRegDate) {
		this.userDailyIntakeRegDate = userDailyIntakeRegDate;
	}
	@Override
	public String toString() {
		return "IntakeDailyUserDto [userDailyIntakeCode=" + userDailyIntakeCode + ", userId=" + userId
				+ ", matchingFoodScheduleCode=" + matchingFoodScheduleCode + ", userDailyTotalIntakeCode="
				+ userDailyTotalIntakeCode + ", userDailyIntakeTime=" + userDailyIntakeTime
				+ ", userDailyIntakeContents=" + userDailyIntakeContents + ", userDailyIntakeUploadFile="
				+ userDailyIntakeUploadFile + ", userDailyIntakeRegDate=" + userDailyIntakeRegDate + "]";
	}
}

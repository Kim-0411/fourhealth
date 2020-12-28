package com.fourhealth.dto;

public class IntakeTotalDailyUserDto {

	private String userDailyTotalIntakeCode;
	private String userId;
	private String matchingFoodScheduleCode;
	private int userDailyIntakeCalTotal;
	private int userDailyIntakeCarboTotal;
	private int userDailyIntakeProteinTotal;
	private String userDailyIntakeTotalRegDate;
	public String getUserDailyTotalIntakeCode() {
		return userDailyTotalIntakeCode;
	}
	public void setUserDailyTotalIntakeCode(String userDailyTotalIntakeCode) {
		this.userDailyTotalIntakeCode = userDailyTotalIntakeCode;
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
	public int getUserDailyIntakeCalTotal() {
		return userDailyIntakeCalTotal;
	}
	public void setUserDailyIntakeCalTotal(int userDailyIntakeCalTotal) {
		this.userDailyIntakeCalTotal = userDailyIntakeCalTotal;
	}
	public int getUserDailyIntakeCarboTotal() {
		return userDailyIntakeCarboTotal;
	}
	public void setUserDailyIntakeCarboTotal(int userDailyIntakeCarboTotal) {
		this.userDailyIntakeCarboTotal = userDailyIntakeCarboTotal;
	}
	public int getUserDailyIntakeProteinTotal() {
		return userDailyIntakeProteinTotal;
	}
	public void setUserDailyIntakeProteinTotal(int userDailyIntakeProteinTotal) {
		this.userDailyIntakeProteinTotal = userDailyIntakeProteinTotal;
	}
	public String getUserDailyIntakeTotalRegDate() {
		return userDailyIntakeTotalRegDate;
	}
	public void setUserDailyIntakeTotalRegDate(String userDailyIntakeTotalRegDate) {
		this.userDailyIntakeTotalRegDate = userDailyIntakeTotalRegDate;
	}
	@Override
	public String toString() {
		return "IntakeTotalDailyUserDto [userDailyTotalIntakeCode=" + userDailyTotalIntakeCode + ", userId=" + userId
				+ ", matchingFoodScheduleCode=" + matchingFoodScheduleCode + ", userDailyIntakeCalTotal="
				+ userDailyIntakeCalTotal + ", userDailyIntakeCarboTotal=" + userDailyIntakeCarboTotal
				+ ", userDailyIntakeProteinTotal=" + userDailyIntakeProteinTotal + ", userDailyIntakeTotalRegDate="
				+ userDailyIntakeTotalRegDate + "]";
	}
}

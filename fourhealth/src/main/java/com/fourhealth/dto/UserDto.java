package com.fourhealth.dto;

public class UserDto {

	private String userId;
	private String userPlatformGradeCode;
	private String userStatusLevelCode;
	private float userFirstHeight;
	private float userFirstWeight;
	private float userFirstGoal;
	private float userFirstBmi;
	private String userRegDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPlatformGradeCode() {
		return userPlatformGradeCode;
	}
	public void setUserPlatformGradeCode(String userPlatformGradeCode) {
		this.userPlatformGradeCode = userPlatformGradeCode;
	}
	public String getUserStatusLevelCode() {
		return userStatusLevelCode;
	}
	public void setUserStatusLevelCode(String userStatusLevelCode) {
		this.userStatusLevelCode = userStatusLevelCode;
	}
	public float getUserFirstHeight() {
		return userFirstHeight;
	}
	public void setUserFirstHeight(float userFirstHeight) {
		this.userFirstHeight = userFirstHeight;
	}
	public float getUserFirstWeight() {
		return userFirstWeight;
	}
	public void setUserFirstWeight(float userFirstWeight) {
		this.userFirstWeight = userFirstWeight;
	}
	public float getUserFirstGoal() {
		return userFirstGoal;
	}
	public void setUserFirstGoal(float userFirstGoal) {
		this.userFirstGoal = userFirstGoal;
	}
	public float getUserFirstBmi() {
		return userFirstBmi;
	}
	public void setUserFirstBmi(float userFirstBmi) {
		this.userFirstBmi = userFirstBmi;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userPlatformGradeCode=" + userPlatformGradeCode
				+ ", userStatusLevelCode=" + userStatusLevelCode + ", userFirstHeight=" + userFirstHeight
				+ ", userFirstWeight=" + userFirstWeight + ", userFirstGoal=" + userFirstGoal + ", userFirstBmi="
				+ userFirstBmi + ", userRegDate=" + userRegDate + "]";
	}
	
	
}

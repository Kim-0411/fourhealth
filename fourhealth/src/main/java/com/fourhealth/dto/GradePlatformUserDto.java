package com.fourhealth.dto;

public class GradePlatformUserDto {

	private String userPlatformGradeCode;
	private String userPlatformGradeName;
	private String userPlatformGradeRegDate;
	public String getUserPlatformGradeCode() {
		return userPlatformGradeCode;
	}
	public void setUserPlatformGradeCode(String userPlatformGradeCode) {
		this.userPlatformGradeCode = userPlatformGradeCode;
	}
	public String getUserPlatformGradeName() {
		return userPlatformGradeName;
	}
	public void setUserPlatformGradeName(String userPlatformGradeName) {
		this.userPlatformGradeName = userPlatformGradeName;
	}
	public String getUserPlatformGradeRegDate() {
		return userPlatformGradeRegDate;
	}
	public void setUserPlatformGradeRegDate(String userPlatformGradeRegDate) {
		this.userPlatformGradeRegDate = userPlatformGradeRegDate;
	}
	@Override
	public String toString() {
		return "GradePlatformUserDto [userPlatformGradeCode=" + userPlatformGradeCode + ", userPlatformGradeName="
				+ userPlatformGradeName + ", userPlatformGradeRegDate=" + userPlatformGradeRegDate + "]";
	}
}

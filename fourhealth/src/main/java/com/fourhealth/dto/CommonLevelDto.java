package com.fourhealth.dto;

public class CommonLevelDto {
	private String userLevelCode;
	private String userLevelName;
	private String userLevelRegDate;
	public String getUserLevelCode() {
		return userLevelCode;
	}
	public void setUserLevelCode(String userLevelCode) {
		this.userLevelCode = userLevelCode;
	}
	public String getUserLevelName() {
		return userLevelName;
	}
	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}
	public String getUserLevelRegDate() {
		return userLevelRegDate;
	}
	public void setUserLevelRegDate(String userLevelRegDate) {
		this.userLevelRegDate = userLevelRegDate;
	}
	@Override
	public String toString() {
		return "CommonLevelDto [userLevelCode=" + userLevelCode + ", userLevelName=" + userLevelName
				+ ", userLevelRegDate=" + userLevelRegDate + "]";
	}

}

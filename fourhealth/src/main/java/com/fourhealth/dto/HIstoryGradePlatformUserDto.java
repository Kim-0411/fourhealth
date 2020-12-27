package com.fourhealth.dto;

public class HIstoryGradePlatformUserDto {

	private String userPlatformGradeHistoryCode;
	private String userId;
	private String userCheckPercentageCode2;
	private String userPlatformGradeHistoryBefore;
	private String userPlatformGradeHistoryAfter;
	private String userPlatformGradeHistoryRegDate;
	public String getUserPlatformGradeHistoryCode() {
		return userPlatformGradeHistoryCode;
	}
	public void setUserPlatformGradeHistoryCode(String userPlatformGradeHistoryCode) {
		this.userPlatformGradeHistoryCode = userPlatformGradeHistoryCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserCheckPercentageCode2() {
		return userCheckPercentageCode2;
	}
	public void setUserCheckPercentageCode2(String userCheckPercentageCode2) {
		this.userCheckPercentageCode2 = userCheckPercentageCode2;
	}
	public String getUserPlatformGradeHistoryBefore() {
		return userPlatformGradeHistoryBefore;
	}
	public void setUserPlatformGradeHistoryBefore(String userPlatformGradeHistoryBefore) {
		this.userPlatformGradeHistoryBefore = userPlatformGradeHistoryBefore;
	}
	public String getUserPlatformGradeHistoryAfter() {
		return userPlatformGradeHistoryAfter;
	}
	public void setUserPlatformGradeHistoryAfter(String userPlatformGradeHistoryAfter) {
		this.userPlatformGradeHistoryAfter = userPlatformGradeHistoryAfter;
	}
	public String getUserPlatformGradeHistoryRegDate() {
		return userPlatformGradeHistoryRegDate;
	}
	public void setUserPlatformGradeHistoryRegDate(String userPlatformGradeHistoryRegDate) {
		this.userPlatformGradeHistoryRegDate = userPlatformGradeHistoryRegDate;
	}
	@Override
	public String toString() {
		return "HIstoryGradePlatformUserDto [userPlatformGradeHistoryCode=" + userPlatformGradeHistoryCode + ", userId="
				+ userId + ", userCheckPercentageCode2=" + userCheckPercentageCode2
				+ ", userPlatformGradeHistoryBefore=" + userPlatformGradeHistoryBefore
				+ ", userPlatformGradeHistoryAfter=" + userPlatformGradeHistoryAfter
				+ ", userPlatformGradeHistoryRegDate=" + userPlatformGradeHistoryRegDate + "]";
	}
}

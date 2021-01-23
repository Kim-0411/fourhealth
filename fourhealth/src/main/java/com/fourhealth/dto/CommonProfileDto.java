package com.fourhealth.dto;

public class CommonProfileDto {
	private String profileCommonCode;
	private String profileCommonImageCode;
	private String userId;
	private String userLevelCode;
	private String profileCommonIntroduce;
	private String userLevelName;
	private String profileRegDate;
	
	public String getProfileCommonCode() {
		return profileCommonCode;
	}
	public void setProfileCommonCode(String profileCommonCode) {
		this.profileCommonCode = profileCommonCode;
	}
	public String getProfileCommonImageCode() {
		return profileCommonImageCode;
	}
	public void setProfileCommonImageCode(String profileCommonImageCode) {
		this.profileCommonImageCode = profileCommonImageCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserLevelCode() {
		return userLevelCode;
	}
	public void setUserLevelCode(String userLevelCode) {
		this.userLevelCode = userLevelCode;
	}
	public String getProfileCommonIntroduce() {
		return profileCommonIntroduce;
	}
	public void setProfileCommonIntroduce(String profileCommonIntroduce) {
		this.profileCommonIntroduce = profileCommonIntroduce;
	}
	public String getUserLevelName() {
		return userLevelName;
	}
	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}
	public String getProfileRegDate() {
		return profileRegDate;
	}
	public void setProfileRegDate(String profileRegDate) {
		this.profileRegDate = profileRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonProfileDto [profileCommonCode=");
		builder.append(profileCommonCode);
		builder.append(", profileCommonImageCode=");
		builder.append(profileCommonImageCode);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", userLevelCode=");
		builder.append(userLevelCode);
		builder.append(", profileCommonIntroduce=");
		builder.append(profileCommonIntroduce);
		builder.append(", userLevelName=");
		builder.append(userLevelName);
		builder.append(", profileRegDate=");
		builder.append(profileRegDate);
		builder.append("]");
		return builder.toString();
	}
}

package com.fourhealth.dto;


public class SnsUserDto {

	private String userSnsCode;
	private String userId;
	private String userSnsContents;
	private String userSnsUploadFile;
	private String userSnsRegDate;
	private String snsCode;
	public String getUserSnsCode() {
		return userSnsCode;
	}
	public void setUserSnsCode(String userSnsCode) {
		this.userSnsCode = userSnsCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserSnsContents() {
		return userSnsContents;
	}
	public void setUserSnsContents(String userSnsContents) {
		this.userSnsContents = userSnsContents;
	}
	public String getUserSnsUploadFile() {
		return userSnsUploadFile;
	}
	public void setUserSnsUploadFile(String userSnsUploadFile) {
		this.userSnsUploadFile = userSnsUploadFile;
	}
	public String getUserSnsRegDate() {
		return userSnsRegDate;
	}
	public void setUserSnsRegDate(String userSnsRegDate) {
		this.userSnsRegDate = userSnsRegDate;
	}
	public String getSnsCode() {
		return snsCode;
	}
	public void setSnsCode(String snsCode) {
		this.snsCode = snsCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SnsUserDto [userSnsCode=");
		builder.append(userSnsCode);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", userSnsContents=");
		builder.append(userSnsContents);
		builder.append(", userSnsUploadFile=");
		builder.append(userSnsUploadFile);
		builder.append(", userSnsRegDate=");
		builder.append(userSnsRegDate);
		builder.append(", snsCode=");
		builder.append(snsCode);
		builder.append("]");
		return builder.toString();
	}

}

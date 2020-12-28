package com.fourhealth.dto;

import java.sql.Blob;

public class Sns {

	private String userSnsCode;
	private String userId;
	private String userSnsContents;
	private Blob userSnsUploadFile;
	private String userSnsRegDate;
	
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
	public Blob getUserSnsUploadFile() {
		return userSnsUploadFile;
	}
	public void setUserSnsUploadFile(Blob userSnsUploadFile) {
		this.userSnsUploadFile = userSnsUploadFile;
	}
	public String getUserSnsRegDate() {
		return userSnsRegDate;
	}
	public void setUserSnsRegDate(String userSnsRegDate) {
		this.userSnsRegDate = userSnsRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sns [userSnsCode=");
		builder.append(userSnsCode);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", userSnsContents=");
		builder.append(userSnsContents);
		builder.append(", userSnsUploadFile=");
		builder.append(userSnsUploadFile);
		builder.append(", userSnsRegDate=");
		builder.append(userSnsRegDate);
		builder.append("]");
		return builder.toString();
	}
}

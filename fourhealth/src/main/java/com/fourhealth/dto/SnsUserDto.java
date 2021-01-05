package com.fourhealth.dto;

import org.springframework.web.multipart.MultipartFile;

public class SnsUserDto {

	private String userSnsCode;
	private String userId;
	private String userSnsContents;
	private MultipartFile userSnsUploadFile;
	private String userSnsRegDate;
	private String snsCode;
	private String snsImageUrl;
	
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
	public MultipartFile getUserSnsUploadFile() {
		return userSnsUploadFile;
	}
	public void setUserSnsUploadFile(MultipartFile userSnsUploadFile) {
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
	public String getSnsImageUrl() {
		return snsImageUrl;
	}
	public void setSnsImageUrl(String snsImageUrl) {
		this.snsImageUrl = snsImageUrl;
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
		builder.append(", snsImageUrl=");
		builder.append(snsImageUrl);
		builder.append("]");
		return builder.toString();
	}

}

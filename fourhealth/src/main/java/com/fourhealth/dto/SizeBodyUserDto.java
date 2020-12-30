package com.fourhealth.dto;

import java.sql.Blob;

public class SizeBodyUserDto {

	private String userBodySizeCode;
	private String userId;
	private float userBodyHeight;
	private float userBodyWeight;
	private float userBodyBmi;
	private Blob userBodySizeUploadFile;
	private String userBodySizeRegDate;
	public String getUserBodySizeCode() {
		return userBodySizeCode;
	}
	public void setUserBodySizeCode(String userBodySizeCode) {
		this.userBodySizeCode = userBodySizeCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public float getUserBodyHeight() {
		return userBodyHeight;
	}
	public void setUserBodyHeight(float userBodyHeight) {
		this.userBodyHeight = userBodyHeight;
	}
	public float getUserBodyWeight() {
		return userBodyWeight;
	}
	public void setUserBodyWeight(float userBodyWeight) {
		this.userBodyWeight = userBodyWeight;
	}
	public float getUserBodyBmi() {
		return userBodyBmi;
	}
	public void setUserBodyBmi(float userBodyBmi) {
		this.userBodyBmi = userBodyBmi;
	}
	public Blob getUserBodySizeUploadFile() {
		return userBodySizeUploadFile;
	}
	public void setUserBodySizeUploadFile(Blob userBodySizeUploadFile) {
		this.userBodySizeUploadFile = userBodySizeUploadFile;
	}
	public String getUserBodySizeRegDate() {
		return userBodySizeRegDate;
	}
	public void setUserBodySizeRegDate(String userBodySizeRegDate) {
		this.userBodySizeRegDate = userBodySizeRegDate;
	}
	@Override
	public String toString() {
		return "SizeBodyUserDto [userBodySizeCode=" + userBodySizeCode + ", userId=" + userId + ", userBodyHeight="
				+ userBodyHeight + ", userBodyWeight=" + userBodyWeight + ", userBodyBmi=" + userBodyBmi
				+ ", userBodySizeUploadFile=" + userBodySizeUploadFile + ", userBodySizeRegDate=" + userBodySizeRegDate
				+ "]";
	}
}

package com.fourhealth.dto;

public class DormantDto {

	private String dormantCode;
	private String userId;
	private String userDormantReason;
	private String userDormantRegDate;
	public String getDormantCode() {
		return dormantCode;
	}
	public void setDormantCode(String dormantCode) {
		this.dormantCode = dormantCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserDormantReason() {
		return userDormantReason;
	}
	public void setUserDormantReason(String userDormantReason) {
		this.userDormantReason = userDormantReason;
	}
	public String getUserDormantRegDate() {
		return userDormantRegDate;
	}
	public void setUserDormantRegDate(String userDormantRegDate) {
		this.userDormantRegDate = userDormantRegDate;
	}
	@Override
	public String toString() {
		return "DormantDto [dormantCode=" + dormantCode + ", userId=" + userId + ", userDormantReason="
				+ userDormantReason + ", userDormantRegDate=" + userDormantRegDate + "]";
	}
}

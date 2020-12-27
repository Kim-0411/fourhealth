package com.fourhealth.dto;

public class MemberDto {
	private String userId;
	private String userPassword;
	private String userLevel;
	private String userAddr;
	private String userName;
	private String userBirth;
	private String userNickName;
	private String userPhone;
	private String userEmail;
	private String userGender;
	private String userMainBank;
	private String userBankNumber;
	private String userBankMaster;
	private String userRegDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserMainBank() {
		return userMainBank;
	}
	public void setUserMainBank(String userMainBank) {
		this.userMainBank = userMainBank;
	}
	public String getUserBankNumber() {
		return userBankNumber;
	}
	public void setUserBankNumber(String userBankNumber) {
		this.userBankNumber = userBankNumber;
	}
	public String getUserBankMaster() {
		return userBankMaster;
	}
	public void setUserBankMaster(String userBankMaster) {
		this.userBankMaster = userBankMaster;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPassword=" + userPassword + ", userLevel=" + userLevel
				+ ", userAddr=" + userAddr + ", userName=" + userName + ", userBirth=" + userBirth + ", userNickName="
				+ userNickName + ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", userGender=" + userGender
				+ ", userMainBank=" + userMainBank + ", userBankNumber=" + userBankNumber + ", userBankMaster="
				+ userBankMaster + ", userRegDate=" + userRegDate + "]";
	}
	
}

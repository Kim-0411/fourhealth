package com.fourhealth.dto;

//테이블명 : tb_common_user
public class CommonUserDto {

    private String userId;
    private String userLevelCode;
    private String userPw;
    private String userName;
    private String userAddr;
    private String userNickname;
    private String userPhone;
    private String userEmail;
	private String userBirth;
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
	public String getUserLevelCode() {
		return userLevelCode;
	}
	public void setUserLevelCode(String userLevelCode) {
		this.userLevelCode = userLevelCode;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
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
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
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
		StringBuilder builder = new StringBuilder();
		builder.append("CommonUserDto [userId=");
		builder.append(userId);
		builder.append(", userLevelCode=");
		builder.append(userLevelCode);
		builder.append(", userPw=");
		builder.append(userPw);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", userAddr=");
		builder.append(userAddr);
		builder.append(", userNickname=");
		builder.append(userNickname);
		builder.append(", userPhone=");
		builder.append(userPhone);
		builder.append(", userEmail=");
		builder.append(userEmail);
		builder.append(", userBirth=");
		builder.append(userBirth);
		builder.append(", userGender=");
		builder.append(userGender);
		builder.append(", userMainBank=");
		builder.append(userMainBank);
		builder.append(", userBankNumber=");
		builder.append(userBankNumber);
		builder.append(", userBankMaster=");
		builder.append(userBankMaster);
		builder.append(", userRegDate=");
		builder.append(userRegDate);
		builder.append("]");
		return builder.toString();
	}
    
}
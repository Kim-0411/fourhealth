package com.fourhealth.dto;

public class MemberDTO {
	
    private String userId;
    private String userPw;
    private String userLevel;
    private String userName;
    private String userAddr;
    private String userNicname;
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

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getuserLevel() {
        return userLevel;
    }

    public void setuserLevel(String userLevel) {
        this.userLevel = userLevel;
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

    public String getUserNicname() {
        return userNicname;
    }

    public void setUserNicname(String userNicname) {
        this.userNicname = userNicname;
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
        return "Memberdto [UserLevel=" + userLevel + ", userAddr=" + userAddr + ", userBankMaster=" + userBankMaster
                + ", userBankNumber=" + userBankNumber + ", userBirth=" + userBirth + ", userGender=" + userGender
                + ", userId=" + userId + ", userMainBank=" + userMainBank + ", userName=" + userName + ", userNicname="
                + userNicname + ", userPw=" + userPw + ", userRegDate=" + userRegDate + "]";
    }


}

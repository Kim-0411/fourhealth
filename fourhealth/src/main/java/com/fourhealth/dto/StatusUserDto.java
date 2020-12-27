package com.fourhealth.dto;

public class StatusUserDto {

	private String userStatusLevelCode;
	private String userStatusLevelname;
	private String userStatusLevelRegDate;
	public String getUserStatusLevelCode() {
		return userStatusLevelCode;
	}
	public void setUserStatusLevelCode(String userStatusLevelCode) {
		this.userStatusLevelCode = userStatusLevelCode;
	}
	public String getUserStatusLevelname() {
		return userStatusLevelname;
	}
	public void setUserStatusLevelname(String userStatusLevelname) {
		this.userStatusLevelname = userStatusLevelname;
	}
	public String getUserStatusLevelRegDate() {
		return userStatusLevelRegDate;
	}
	public void setUserStatusLevelRegDate(String userStatusLevelRegDate) {
		this.userStatusLevelRegDate = userStatusLevelRegDate;
	}
	@Override
	public String toString() {
		return "StatusUserDto [userStatusLevelCode=" + userStatusLevelCode + ", userStatusLevelname="
				+ userStatusLevelname + ", userStatusLevelRegDate=" + userStatusLevelRegDate + "]";
	}
	
}

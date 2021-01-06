package com.fourhealth.dto;

public class GradePlatformUserDto {

	private String userPlatformGradeCode;			//사용자 플랫폼 레벨 코드
	private String userPlatformGradeName;			//사용자 플랫폼 레벨 네임
	private String userPlatformGradeRegDate;		//사용자 플랫폼 레벨 등록 날짜 
	public String getUserPlatformGradeCode() {
		
		return userPlatformGradeCode;
	}
	public void setUserPlatformGradeCode(String userPlatformGradeCode) {
		this.userPlatformGradeCode = userPlatformGradeCode;
	}
	public String getUserPlatformGradeName() {
		return userPlatformGradeName;
	}
	public void setUserPlatformGradeName(String userPlatformGradeName) {
		this.userPlatformGradeName = userPlatformGradeName;
	}
	public String getUserPlatformGradeRegDate() {
		return userPlatformGradeRegDate;
	}
	public void setUserPlatformGradeRegDate(String userPlatformGradeRegDate) {
		this.userPlatformGradeRegDate = userPlatformGradeRegDate;
	}
	@Override
	public String toString() {
		return "GradePlatformUserDto [userPlatformGradeCode=" + userPlatformGradeCode + ", userPlatformGradeName="
				+ userPlatformGradeName + ", userPlatformGradeRegDate=" + userPlatformGradeRegDate + "]";
	}
}

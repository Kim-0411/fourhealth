package com.fourhealth.dto;

public class User {
	
	private String userId; //사용자아이디
	private String userPlatFormGradeCode; //사용자 플렛폼 공통 등급 관리코드
	private String userStatusLevelCode; //ㅅ사용자 정보 공갯상태 코드
	private String userFirstHeight; //사용자 가입시 키
	private String userFirstWeight; //사용자 가입시 최초 체중
	private String userFirstGoal; //사용자 가입시 최초 다이어트 체중 목표
	private String userFirstBmi; //사욧ㅇ자 가입시 최초 BMI
	private String userRegDate; //사용자 정보 등록일자
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPlatFormGradeCode() {
		return userPlatFormGradeCode;
	}
	public void setUserPlatFormGradeCode(String userPlatFormGradeCode) {
		this.userPlatFormGradeCode = userPlatFormGradeCode;
	}
	public String getUserStatusLevelCode() {
		return userStatusLevelCode;
	}
	public void setUserStatusLevelCode(String userStatusLevelCode) {
		this.userStatusLevelCode = userStatusLevelCode;
	}
	public String getUserFirstHeight() {
		return userFirstHeight;
	}
	public void setUserFirstHeight(String userFirstHeight) {
		this.userFirstHeight = userFirstHeight;
	}
	public String getUserFirstWeight() {
		return userFirstWeight;
	}
	public void setUserFirstWeight(String userFirstWeight) {
		this.userFirstWeight = userFirstWeight;
	}
	public String getUserFirstGoal() {
		return userFirstGoal;
	}
	public void setUserFirstGoal(String userFirstGoal) {
		this.userFirstGoal = userFirstGoal;
	}
	public String getUserFirstBmi() {
		return userFirstBmi;
	}
	public void setUserFirstBmi(String userFirstBmi) {
		this.userFirstBmi = userFirstBmi;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	

}

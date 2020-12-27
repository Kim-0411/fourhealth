package com.fourhealth.dto;

import java.sql.Timestamp;

public class ScheduleFoodMatchingDto {

	private String matchingFoodScheduleCode;
	private String userId;
	private String trainerId;
	private String trainerPromotionNoticeCode;
	private String trainerUserMatchingCode;
	private String userDiseaseAddCode;
	private String foodCode;
	private Timestamp mealTime;
	private String matchingScheduleCategories;
	private int intakeCarbo;
	private int intakeProtein;
	private int intakeFat;
	private int matchingFoodScheduleCalorie;
	private int intakeReal;
	private String matchingFoodScheduleRegDate;
	public String getMatchingFoodScheduleCode() {
		return matchingFoodScheduleCode;
	}
	public void setMatchingFoodScheduleCode(String matchingFoodScheduleCode) {
		this.matchingFoodScheduleCode = matchingFoodScheduleCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerPromotionNoticeCode() {
		return trainerPromotionNoticeCode;
	}
	public void setTrainerPromotionNoticeCode(String trainerPromotionNoticeCode) {
		this.trainerPromotionNoticeCode = trainerPromotionNoticeCode;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public String getUserDiseaseAddCode() {
		return userDiseaseAddCode;
	}
	public void setUserDiseaseAddCode(String userDiseaseAddCode) {
		this.userDiseaseAddCode = userDiseaseAddCode;
	}
	public String getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}
	public Timestamp getMealTime() {
		return mealTime;
	}
	public void setMealTime(Timestamp mealTime) {
		this.mealTime = mealTime;
	}
	public String getMatchingScheduleCategories() {
		return matchingScheduleCategories;
	}
	public void setMatchingScheduleCategories(String matchingScheduleCategories) {
		this.matchingScheduleCategories = matchingScheduleCategories;
	}
	public int getIntakeCarbo() {
		return intakeCarbo;
	}
	public void setIntakeCarbo(int intakeCarbo) {
		this.intakeCarbo = intakeCarbo;
	}
	public int getIntakeProtein() {
		return intakeProtein;
	}
	public void setIntakeProtein(int intakeProtein) {
		this.intakeProtein = intakeProtein;
	}
	public int getIntakeFat() {
		return intakeFat;
	}
	public void setIntakeFat(int intakeFat) {
		this.intakeFat = intakeFat;
	}
	public int getMatchingFoodScheduleCalorie() {
		return matchingFoodScheduleCalorie;
	}
	public void setMatchingFoodScheduleCalorie(int matchingFoodScheduleCalorie) {
		this.matchingFoodScheduleCalorie = matchingFoodScheduleCalorie;
	}
	public int getIntakeReal() {
		return intakeReal;
	}
	public void setIntakeReal(int intakeReal) {
		this.intakeReal = intakeReal;
	}
	public String getMatchingFoodScheduleRegDate() {
		return matchingFoodScheduleRegDate;
	}
	public void setMatchingFoodScheduleRegDate(String matchingFoodScheduleRegDate) {
		this.matchingFoodScheduleRegDate = matchingFoodScheduleRegDate;
	}
	@Override
	public String toString() {
		return "ScheduleFoodMatchingDto [matchingFoodScheduleCode=" + matchingFoodScheduleCode + ", userId=" + userId
				+ ", trainerId=" + trainerId + ", trainerPromotionNoticeCode=" + trainerPromotionNoticeCode
				+ ", trainerUserMatchingCode=" + trainerUserMatchingCode + ", userDiseaseAddCode=" + userDiseaseAddCode
				+ ", foodCode=" + foodCode + ", mealTime=" + mealTime + ", matchingScheduleCategories="
				+ matchingScheduleCategories + ", intakeCarbo=" + intakeCarbo + ", intakeProtein=" + intakeProtein
				+ ", intakeFat=" + intakeFat + ", matchingFoodScheduleCalorie=" + matchingFoodScheduleCalorie
				+ ", intakeReal=" + intakeReal + ", matchingFoodScheduleRegDate=" + matchingFoodScheduleRegDate + "]";
	}
	
}

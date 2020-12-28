package com.fourhealth.dto;

public class ScheduleExerciseMatchingDto {

	private String matchingExerciseScheduleCode;
	private String userId;
	private String trainerId;
	private String trainerPromotionNoticeCode;
	private String trainerUserMatchingCode;
	private String userDiseaseAddCode;
	private String exerciseMetCode;
	private int matchingExerciseMin;
	private String matchingScheduleCategories;
	private int exerciseEnergyConsumption;
	private int matchingTrainerScheduleDate;
	private String exerciseScheduleRegDate;
	public String getMatchingExerciseScheduleCode() {
		return matchingExerciseScheduleCode;
	}
	public void setMatchingExerciseScheduleCode(String matchingExerciseScheduleCode) {
		this.matchingExerciseScheduleCode = matchingExerciseScheduleCode;
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
	public String getExerciseMetCode() {
		return exerciseMetCode;
	}
	public void setExerciseMetCode(String exerciseMetCode) {
		this.exerciseMetCode = exerciseMetCode;
	}
	public int getMatchingExerciseMin() {
		return matchingExerciseMin;
	}
	public void setMatchingExerciseMin(int matchingExerciseMin) {
		this.matchingExerciseMin = matchingExerciseMin;
	}
	public String getMatchingScheduleCategories() {
		return matchingScheduleCategories;
	}
	public void setMatchingScheduleCategories(String matchingScheduleCategories) {
		this.matchingScheduleCategories = matchingScheduleCategories;
	}
	public int getExerciseEnergyConsumption() {
		return exerciseEnergyConsumption;
	}
	public void setExerciseEnergyConsumption(int exerciseEnergyConsumption) {
		this.exerciseEnergyConsumption = exerciseEnergyConsumption;
	}
	public int getMatchingTrainerScheduleDate() {
		return matchingTrainerScheduleDate;
	}
	public void setMatchingTrainerScheduleDate(int matchingTrainerScheduleDate) {
		this.matchingTrainerScheduleDate = matchingTrainerScheduleDate;
	}
	public String getExerciseScheduleRegDate() {
		return exerciseScheduleRegDate;
	}
	public void setExerciseScheduleRegDate(String exerciseScheduleRegDate) {
		this.exerciseScheduleRegDate = exerciseScheduleRegDate;
	}
	@Override
	public String toString() {
		return "ScheduleExerciseMatchingDto [matchingExerciseScheduleCode=" + matchingExerciseScheduleCode + ", userId="
				+ userId + ", trainerId=" + trainerId + ", trainerPromotionNoticeCode=" + trainerPromotionNoticeCode
				+ ", trainerUserMatchingCode=" + trainerUserMatchingCode + ", userDiseaseAddCode=" + userDiseaseAddCode
				+ ", exerciseMetCode=" + exerciseMetCode + ", matchingExerciseMin=" + matchingExerciseMin
				+ ", matchingScheduleCategories=" + matchingScheduleCategories + ", exerciseEnergyConsumption="
				+ exerciseEnergyConsumption + ", matchingTrainerScheduleDate=" + matchingTrainerScheduleDate
				+ ", exerciseScheduleRegDate=" + exerciseScheduleRegDate + "]";
	}
	
}

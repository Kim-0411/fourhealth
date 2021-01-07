
package com.fourhealth.dto;

public class MetExerciseDto {
	private String exerciseMetCode;								//관리자 운동 관리 코드 
	private String exerciseName;								//운동명
	private float exerciseMetCoeffcient;						//MET 계수
	private String exerciseRegDate;								//관리자 운동 등록 일자
	
	public String getExerciseRegDate() {
		return exerciseRegDate;
	}
	public void setExerciseRegDate(String exerciseRegDate) {
		this.exerciseRegDate = exerciseRegDate;
	}
	public float getExerciseMetCoeffcient() {
		return exerciseMetCoeffcient;
	}
	public void setExerciseMetCoeffcient(float exerciseMetCoeffcient) {
		this.exerciseMetCoeffcient = exerciseMetCoeffcient;
	}
	public String getExerciseMetCode() {
		return exerciseMetCode;
	}
	public void setExerciseMetCode(String exerciseMetCode) {
		this.exerciseMetCode = exerciseMetCode;
	}
	public String getExerciseName() {
		return exerciseName;
	}
	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}
	
	
	@Override
	public String toString() {
		return "MetExerciseDto [exerciseMetCode=" + exerciseMetCode + ", exerciseName=" + exerciseName
				+ ", exerciseMetCoeffcient=" + exerciseMetCoeffcient + ", exerciseRegDate=" + exerciseRegDate + "]";
	}
}


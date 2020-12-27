package com.fourhealth.dto;

public class MetExerciseDto {

	private String exerciseMetCode;
	private String exerciseName;
	private float metCoefficient;
	private String exerciseRegDate;
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
	public float getMetCoefficient() {
		return metCoefficient;
	}
	public void setMetCoefficient(float metCoefficient) {
		this.metCoefficient = metCoefficient;
	}
	public String getExerciseRegDate() {
		return exerciseRegDate;
	}
	public void setExerciseRegDate(String exerciseRegDate) {
		this.exerciseRegDate = exerciseRegDate;
	}
	@Override
	public String toString() {
		return "MetExerciseDto [exerciseMetCode=" + exerciseMetCode + ", exerciseName=" + exerciseName
				+ ", metCoefficient=" + metCoefficient + ", exerciseRegDate=" + exerciseRegDate + "]";
	}
}

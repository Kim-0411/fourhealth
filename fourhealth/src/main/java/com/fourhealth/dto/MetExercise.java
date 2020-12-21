package com.fourhealth.dto;

public class MetExercise {
	private String exerciseMetCode; 
	private String exerciseName;
	private float exerciseMetCoeffcient;
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

}

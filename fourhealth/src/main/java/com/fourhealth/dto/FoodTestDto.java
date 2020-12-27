package com.fourhealth.dto;

public class FoodTestDto {

	private String foodCode;
	private String foodName;
	private String foodCal;
	public String getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodCal() {
		return foodCal;
	}
	public void setFoodCal(String foodCal) {
		this.foodCal = foodCal;
	}
	@Override
	public String toString() {
		return "FoodTestDto [foodCode=" + foodCode + ", foodName=" + foodName + ", foodCal=" + foodCal + "]";
	}
}

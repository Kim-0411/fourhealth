package com.fourhealth.dto;

public class FoodDto {

	private String foodCode;
	private String foodName;
	private int foodCalorie;
	private int foodVitamin;
	private int  foodCarbo;
	private int foodProtein;
	private int foodFat;
	private String foodMakerName;
	private String foodRegDate;
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
	public int getFoodCalorie() {
		return foodCalorie;
	}
	public void setFoodCalorie(int foodCalorie) {
		this.foodCalorie = foodCalorie;
	}
	public int getFoodVitamin() {
		return foodVitamin;
	}
	public void setFoodVitamin(int foodVitamin) {
		this.foodVitamin = foodVitamin;
	}
	public int getFoodCarbo() {
		return foodCarbo;
	}
	public void setFoodCarbo(int foodCarbo) {
		this.foodCarbo = foodCarbo;
	}
	public int getFoodProtein() {
		return foodProtein;
	}
	public void setFoodProtein(int foodProtein) {
		this.foodProtein = foodProtein;
	}
	public int getFoodFat() {
		return foodFat;
	}
	public void setFoodFat(int foodFat) {
		this.foodFat = foodFat;
	}
	public String getFoodMakerName() {
		return foodMakerName;
	}
	public void setFoodMakerName(String foodMakerName) {
		this.foodMakerName = foodMakerName;
	}
	public String getFoodRegDate() {
		return foodRegDate;
	}
	public void setFoodRegDate(String foodRegDate) {
		this.foodRegDate = foodRegDate;
	}
	@Override
	public String toString() {
		return "FoodDto [foodCode=" + foodCode + ", foodName=" + foodName + ", foodCalorie=" + foodCalorie
				+ ", foodVitamin=" + foodVitamin + ", foodCarbo=" + foodCarbo + ", foodProtein=" + foodProtein
				+ ", foodFat=" + foodFat + ", foodMakerName=" + foodMakerName + ", foodRegDate=" + foodRegDate + "]";
	}
}

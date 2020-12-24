package com.fourhealth.dto;

public class FoodDto {
	private String foodName;
	private String foodCal;
	private String foodCarbo;
	private String foodProtein;
	private String foodFat;
	private String foodMakerName;
	private String foodVitamine;

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

	public String getFoodCarbo() {
		return foodCarbo;
	}

	public void setFoodCarbo(String foodCarbo) {
		this.foodCarbo = foodCarbo;
	}

	public String getFoodProtein() {
		return foodProtein;
	}

	public void setFoodProtein(String foodProtein) {
		this.foodProtein = foodProtein;
	}

	public String getFoodFat() {
		return foodFat;
	}

	public void setFoodFat(String foodFat) {
		this.foodFat = foodFat;
	}

	public String getFoodMakerName() {
		return foodMakerName;
	}

	public void setFoodMakerName(String foodMakerName) {
		this.foodMakerName = foodMakerName;
	}

	public String getFoodVitamine() {
		return foodVitamine;
	}

	public void setFoodVitamine(String foodVitamine) {
		this.foodVitamine = foodVitamine;
	}

	@Override
	public String toString() {
		return "FoodDto [foodCal=" + foodCal + ", foodCarbo=" + foodCarbo + ", foodFat=" + foodFat + ", foodMakerName="
				+ foodMakerName + ", foodName=" + foodName + ", foodProtein=" + foodProtein + ", foodVitamine="
				+ foodVitamine + "]";
	}

}

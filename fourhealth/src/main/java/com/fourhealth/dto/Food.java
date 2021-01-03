package com.fourhealth.dto;

public class Food {

	/**
	 * 모든 식품 변수는 차후 변경이 될수도 있는 db에도 재사용이 가능하도록 작성한다.
	 * 
	 **/

	private String foodName;							//식품 이름
	private String foodCode;							//식품 코드
	private String foodGroup;							//식품 군(종류)
	private float foodTotalGram;						//식품 그람
	private float foodCal;								//식품 칼로리
	private float foodCarbo;							//식품 탄수화물
	private float foodProtein;							//식품 단백질
	private float foodFat;								//식품 지방
	private float foodChole;							//식품 콜레스테롤
	private float foodSodium;							//식품 나트륨
	private float foodSugar;							//식품 당
	private String foodMakerName;						//식품 제조사 명

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public float getFoodCal() {
		return foodCal;
	}

	public void setFoodCal(float foodCal) {
		this.foodCal = foodCal;
	}

	public float getFoodCarbo() {
		return foodCarbo;
	}

	public void setFoodCarbo(float foodCarbo) {
		this.foodCarbo = foodCarbo;
	}

	public float getFoodProtein() {
		return foodProtein;
	}

	public void setFoodProtein(float foodProtein) {
		this.foodProtein = foodProtein;
	}

	public float getFoodFat() {
		return foodFat;
	}

	public void setFoodFat(float foodFat) {
		this.foodFat = foodFat;
	}

	public String getFoodGroup() {
		return foodGroup;
	}

	public void setFoodGroup(String foodGroup) {
		this.foodGroup = foodGroup;
	}

	public String getFoodMakerName() {
		return foodMakerName;
	}

	public void setFoodMakerName(String foodMakerName) {
		this.foodMakerName = foodMakerName;
	}

	public float getFoodSugar() {
		return foodSugar;
	}

	public void setFoodSugar(float foodSugar) {
		this.foodSugar = foodSugar;
	}

	public float getFoodSodium() {
		return foodSodium;
	}

	public void setFoodSodium(float foodSodium) {
		this.foodSodium = foodSodium;
	}

	public float getFoodChole() {
		return foodChole;
	}

	public void setFoodChole(float foodChole) {
		this.foodChole = foodChole;
	}

	public String getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}

	public float getFoodTotalGram() {
		return foodTotalGram;
	}

	public void setFoodTotalGram(float foodTotalGram) {
		this.foodTotalGram = foodTotalGram;
	}

	@Override
	public String toString() {
		return "Food [foodCal=" + foodCal + ", foodCarbo=" + foodCarbo + ", foodChole=" + foodChole + ", foodCode="
				+ foodCode + ", foodFat=" + foodFat + ", foodGroup=" + foodGroup + ", foodMakerName=" + foodMakerName
				+ ", foodName=" + foodName + ", foodProtein=" + foodProtein + ", foodSodium=" + foodSodium
				+ ", foodSugar=" + foodSugar + ", foodTotalGram=" + foodTotalGram + "]";
	}





}

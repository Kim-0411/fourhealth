package com.fourhealth.dto;

public class Food {

	/**
	 * 모든 식품 변수는 차후 변경이 될수도 있는 db에도 재사용이 가능하도록 작성한다.
	 * 
	 **/

	private String foodName;							//1. 식품 이름
	private String foodCode;							//2. 식품 코드
	private String foodGroup;							//3. 식품 군(종류)
	private String foodTotalGram;						//4. 식품 그람
	private String foodCal;								//5. 식품 칼로리
	private String foodCarbo;							//6. 식품 탄수화물
	private String foodProtein;							//7. 식품 단백질
	private String foodFat;								//8. 식품 지방
	private String foodChole;							//9. 식품 콜레스테롤
	private String foodSugar;							//11. 식품 당
	private String foodSodium;							//10. 식품 나트륨
	private String foodMakerName;						//12. 식품 제조사 명

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}

	public String getFoodGroup() {
		return foodGroup;
	}

	public void setFoodGroup(String foodGroup) {
		this.foodGroup = foodGroup;
	}

	public String getFoodTotalGram() {
		return foodTotalGram;
	}

	public void setFoodTotalGram(String foodTotalGram) {
		this.foodTotalGram = foodTotalGram;
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

	public String getFoodChole() {
		return foodChole;
	}

	public void setFoodChole(String foodChole) {
		this.foodChole = foodChole;
	}

	public String getFoodSodium() {
		return foodSodium;
	}

	public void setFoodSodium(String foodSodium) {
		this.foodSodium = foodSodium;
	}

	public String getFoodSugar() {
		return foodSugar;
	}

	public void setFoodSugar(String foodSugar) {
		this.foodSugar = foodSugar;
	}

	public String getFoodMakerName() {
		return foodMakerName;
	}

	public void setFoodMakerName(String foodMakerName) {
		this.foodMakerName = foodMakerName;
	}

	@Override
	public String toString() {
		return "Food [foodCal=" + foodCal + ", foodCarbo=" + foodCarbo + ", foodChole=" + foodChole + ", foodCode="
				+ foodCode + ", foodFat=" + foodFat + ", foodGroup=" + foodGroup + ", foodMakerName=" + foodMakerName
				+ ", foodName=" + foodName + ", foodProtein=" + foodProtein + ", foodSodium=" + foodSodium
				+ ", foodSugar=" + foodSugar + ", foodTotalGram=" + foodTotalGram + "]";
	}
	
}
package com.fourhealth.dto;

public class IntroduceBeneficialFoodDto {

	private String foodBeneficialIntroduceCode;
	private String userDieaseAddCode;
	private String foodBeneficialDiseaseCode;
	private String foodBeneficialIntroduceRegDate;
	public String getFoodBeneficialIntroduceCode() {
		return foodBeneficialIntroduceCode;
	}
	public void setFoodBeneficialIntroduceCode(String foodBeneficialIntroduceCode) {
		this.foodBeneficialIntroduceCode = foodBeneficialIntroduceCode;
	}
	public String getUserDieaseAddCode() {
		return userDieaseAddCode;
	}
	public void setUserDieaseAddCode(String userDieaseAddCode) {
		this.userDieaseAddCode = userDieaseAddCode;
	}
	public String getFoodBeneficialDiseaseCode() {
		return foodBeneficialDiseaseCode;
	}
	public void setFoodBeneficialDiseaseCode(String foodBeneficialDiseaseCode) {
		this.foodBeneficialDiseaseCode = foodBeneficialDiseaseCode;
	}
	public String getFoodBeneficialIntroduceRegDate() {
		return foodBeneficialIntroduceRegDate;
	}
	public void setFoodBeneficialIntroduceRegDate(String foodBeneficialIntroduceRegDate) {
		this.foodBeneficialIntroduceRegDate = foodBeneficialIntroduceRegDate;
	}
	@Override
	public String toString() {
		return "IntroduceBeneficialFoodDto [foodBeneficialIntroduceCode=" + foodBeneficialIntroduceCode
				+ ", userDieaseAddCode=" + userDieaseAddCode + ", foodBeneficialDiseaseCode="
				+ foodBeneficialDiseaseCode + ", foodBeneficialIntroduceRegDate=" + foodBeneficialIntroduceRegDate
				+ "]";
	}
}

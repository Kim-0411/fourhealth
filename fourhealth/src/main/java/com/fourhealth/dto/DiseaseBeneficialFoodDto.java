package com.fourhealth.dto;

public class DiseaseBeneficialFoodDto {

	private String foodBeneficialDeaseCode;
	private String foodCode;
	private String diseaseCode;
	private String foodBeneficialDiseaseDetails;
	private String foodBeneficialDiseaseRegDate;
	public String getFoodBeneficialDeaseCode() {
		return foodBeneficialDeaseCode;
	}
	public void setFoodBeneficialDeaseCode(String foodBeneficialDeaseCode) {
		this.foodBeneficialDeaseCode = foodBeneficialDeaseCode;
	}
	public String getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getFoodBeneficialDiseaseDetails() {
		return foodBeneficialDiseaseDetails;
	}
	public void setFoodBeneficialDiseaseDetails(String foodBeneficialDiseaseDetails) {
		this.foodBeneficialDiseaseDetails = foodBeneficialDiseaseDetails;
	}
	public String getFoodBeneficialDiseaseRegDate() {
		return foodBeneficialDiseaseRegDate;
	}
	public void setFoodBeneficialDiseaseRegDate(String foodBeneficialDiseaseRegDate) {
		this.foodBeneficialDiseaseRegDate = foodBeneficialDiseaseRegDate;
	}
	@Override
	public String toString() {
		return "DiseaseBeneficialFoodDto [foodBeneficialDeaseCode=" + foodBeneficialDeaseCode + ", foodCode=" + foodCode
				+ ", diseaseCode=" + diseaseCode + ", foodBeneficialDiseaseDetails=" + foodBeneficialDiseaseDetails
				+ ", foodBeneficialDiseaseRegDate=" + foodBeneficialDiseaseRegDate + "]";
	}
	
}

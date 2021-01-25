package com.fourhealth.dto;

public class DiseaseDto {
	private String diseaseCode;
	private String diseaseName;
	private String diseaseDetails;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DiseaseDto [diseaseCode=");
		builder.append(diseaseCode);
		builder.append(", diseaseName=");
		builder.append(diseaseName);
		builder.append(", diseaseDetails=");
		builder.append(diseaseDetails);
		builder.append(", diseaseRegDate=");
		builder.append(diseaseRegDate);
		builder.append("]");
		return builder.toString();
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getDiseaseDetails() {
		return diseaseDetails;
	}
	public void setDiseaseDetails(String diseaseDetails) {
		this.diseaseDetails = diseaseDetails;
	}
	public String getDiseaseRegDate() {
		return diseaseRegDate;
	}
	public void setDiseaseRegDate(String diseaseRegDate) {
		this.diseaseRegDate = diseaseRegDate;
	}
	private String diseaseRegDate;
	
}

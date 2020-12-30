package com.fourhealth.dto;

public class DiseaseDBDto {

	private String diseaseCode;
	private String diseaseName;
	private String diseaseDetails;
	private String diseaseRegDate;
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
	@Override
	public String toString() {
		return "DiseaseDBDto [diseaseCode=" + diseaseCode + ", diseaseName=" + diseaseName + ", diseaseDetails="
				+ diseaseDetails + ", diseaseRegDate=" + diseaseRegDate + "]";
	}
}

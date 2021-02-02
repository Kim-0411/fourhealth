package com.fourhealth.dto;

public class DiseaseDto {
	private String diseaseCode;
	private String diseaseName;
	private String diseaseDetails;

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

	@Override
	public String toString() {
		return "DiseaseDto [diseaseCode=" + diseaseCode + ", diseaseDetails=" + diseaseDetails + ", diseaseName="
				+ diseaseName + "]";
	}

	
	
}

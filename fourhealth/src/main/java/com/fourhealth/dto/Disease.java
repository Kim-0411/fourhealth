package com.fourhealth.dto;

public class Disease {
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

    public String getDiseaseInfo() {
        return diseaseDetails;
    }

    public void setDiseaseInfo(String diseaseDetails) {
        this.diseaseDetails = diseaseDetails;
    }

    @Override
    public String toString() {
        return "Disease [diseaseCode=" + diseaseCode + ", diseaseInfo=" + diseaseDetails + ", diseaseName=" + diseaseName
                + "]";
    }

    
}

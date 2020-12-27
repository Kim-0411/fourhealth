package com.fourhealth.dto;

import org.springframework.web.multipart.MultipartFile;

//테이블명 : tb_notice_trainer
public class PromotionDTO {
    private String proCode;
    private String proId; // 트레이너 아이디
    private String proName;
    private String proGoal;
    private String proShortcon;
    private String proDetailscon;
    private String proPeople;
    private int proPrice;
    private String proLivePeople;
    private String proTotalDate;
    private String proStartDate;
    private String proEndDate;
    private String proAttendStartDate;
    private String proRecruitcloseDate;
    private String proyAddDate;
    private MultipartFile proBgImage; // 화면에서 사진 가져오는 DTO
    private String proImageUrl; // 디비에 들어가는 DTO

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProGoal() {
        return proGoal;
    }

    public void setProGoal(String proGoal) {
        this.proGoal = proGoal;
    }

    public String getProShortcon() {
        return proShortcon;
    }

    public void setProShortcon(String proShortcon) {
        this.proShortcon = proShortcon;
    }

    public String getProDetailscon() {
        return proDetailscon;
    }

    public void setProDetailscon(String proDetailscon) {
        this.proDetailscon = proDetailscon;
    }

    public String getProPeople() {
        return proPeople;
    }

    public void setProPeople(String proPeople) {
        this.proPeople = proPeople;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public String getProTotalDate() {
        return proTotalDate;
    }

    public void setProTotalDate(String proTotalDate) {
        this.proTotalDate = proTotalDate;
    }

    public String getProStartDate() {
        return proStartDate;
    }

    public void setProStartDate(String proStartDate) {
        this.proStartDate = proStartDate;
    }

    public String getProEndDate() {
        return proEndDate;
    }

    public void setProEndDate(String proEndDate) {
        this.proEndDate = proEndDate;
    }

    public String getProAttendStartDate() {
        return proAttendStartDate;
    }

    public void setProAttendStartDate(String proAttendStartDate) {
        this.proAttendStartDate = proAttendStartDate;
    }

    public String getProRecruitcloseDate() {
        return proRecruitcloseDate;
    }

    public void setProRecruitcloseDate(String proRecruitcloseDate) {
        this.proRecruitcloseDate = proRecruitcloseDate;
    }

    public String getProyAddDate() {
        return proyAddDate;
    }

    public void setProyAddDate(String proyAddDate) {
        this.proyAddDate = proyAddDate;
    }

    public String getProLivePeople() {
        return proLivePeople;
    }

    public void setProLivePeople(String proLivePeople) {
        this.proLivePeople = proLivePeople;
    }

    public MultipartFile getProBgImage() {
        return proBgImage;
    }

    public void setProBgImage(MultipartFile proBgImage) {
        this.proBgImage = proBgImage;
    }

    public String getProImageUrl() {
        return proImageUrl;
    }

    public void setProImageUrl(String proImageUrl) {
        this.proImageUrl = proImageUrl;
    }

    @Override
    public String toString() {
        return "PromotionDTO [proCode=" + proCode + ", proId=" + proId + ", proName=" + proName + ", proGoal=" + proGoal
                + ", proShortcon=" + proShortcon + ", proDetailscon=" + proDetailscon + ", proPeople=" + proPeople
                + ", proPrice=" + proPrice + ", proLivePeople=" + proLivePeople + ", proTotalDate=" + proTotalDate
                + ", proStartDate=" + proStartDate + ", proEndDate=" + proEndDate + ", proAttendStartDate="
                + proAttendStartDate + ", proRecruitcloseDate=" + proRecruitcloseDate + ", proBgImage=" + proBgImage
                + ", proyAddDate=" + proyAddDate + ", proImageUrl=" + proImageUrl + "]";
    }

}

package com.fourhealth.dto;

public class CouponDTO {
    private String userPlatformCouponCode; // 사용자 플렛폼 쿠폰 코드
    private String userPlatformGradeCode; // 사용자 플렛폼 공통 등급관리
    private String userPlatformCouponDetails; // 사용자 플렛폼 쿠폰 상세내용
    private String userPlatformCouponRegDate; // 사용자 플렛폼 쿠폰관리 시스템 등록일자

    public String getUserPlatformCouponCode() {
        return userPlatformCouponCode;
    }

    public void setUserPlatformCouponCode(String userPlatformCouponCode) {
        this.userPlatformCouponCode = userPlatformCouponCode;
    }

    public String getUserPlatformGradeCode() {
        return userPlatformGradeCode;
    }

    public void setUserPlatformGradeCode(String userPlatformGradeCode) {
        this.userPlatformGradeCode = userPlatformGradeCode;
    }

    public String getUserPlatformCouponDetails() {
        return userPlatformCouponDetails;
    }

    public void setUserPlatformCouponDetails(String userPlatformCouponDetails) {
        this.userPlatformCouponDetails = userPlatformCouponDetails;
    }

    public String getUserPlatformCouponRegDate() {
        return userPlatformCouponRegDate;
    }

    public void setUserPlatformCouponRegDate(String userPlatformCouponRegDate) {
        this.userPlatformCouponRegDate = userPlatformCouponRegDate;
    }

    @Override
    public String toString() {
        return "CouponDTO [userPlatformCouponCode=" + userPlatformCouponCode + ", userPlatformCouponDetails="
                + userPlatformCouponDetails + ", userPlatformCouponRegDate=" + userPlatformCouponRegDate
                + ", userPlatformGradeCode=" + userPlatformGradeCode + "]";
    }

}

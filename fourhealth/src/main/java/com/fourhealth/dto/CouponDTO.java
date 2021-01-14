package com.fourhealth.dto;

public class CouponDTO {
    private String userPlatformCouponCode;
    private String userPlatformGradeCode;
    private String userPlatformCouponDetails;
    private String userPlatformCouponRegDate;

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

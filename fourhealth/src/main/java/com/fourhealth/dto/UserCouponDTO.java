package com.fourhealth.dto;

import java.util.List;

public class UserCouponDTO {
    private String userCouponCode;
    private String userId;
    private String userPlatformCouponCode;
    private String userCouponValidityStart;
    private String userCouponValidityEnd;
    private String userCouponRegDate;
    private String userCouponUseDate;
    private List<CouponDTO> CouponList;

    public String getUserCouponCode() {
        return userCouponCode;
    }

    public void setUserCouponCode(String userCouponCode) {
        this.userCouponCode = userCouponCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPlatformCouponCode() {
        return userPlatformCouponCode;
    }

    public void setUserPlatformCouponCode(String userPlatformCouponCode) {
        this.userPlatformCouponCode = userPlatformCouponCode;
    }

    public String getUserCouponValidityStart() {
        return userCouponValidityStart;
    }

    public void setUserCouponValidityStart(String userCouponValidityStart) {
        this.userCouponValidityStart = userCouponValidityStart;
    }

    public String getUserCouponValidityEnd() {
        return userCouponValidityEnd;
    }

    public void setUserCouponValidityEnd(String userCouponValidityEnd) {
        this.userCouponValidityEnd = userCouponValidityEnd;
    }

    public String getUserCouponRegDate() {
        return userCouponRegDate;
    }

    public void setUserCouponRegDate(String userCouponRegDate) {
        this.userCouponRegDate = userCouponRegDate;
    }

    public String getUserCouponUseDate() {
        return userCouponUseDate;
    }

    public void setUserCouponUseDate(String userCouponUseDate) {
        this.userCouponUseDate = userCouponUseDate;
    }

    public List<CouponDTO> getCouponList() {
        return CouponList;
    }

    public void setCouponList(List<CouponDTO> couponList) {
        CouponList = couponList;
    }

    @Override
    public String toString() {
        return "UserCouponDTO [CouponList=" + CouponList + ", userCouponCode=" + userCouponCode + ", userCouponRegDate="
                + userCouponRegDate + ", userCouponUseDate=" + userCouponUseDate + ", userCouponValidityEnd="
                + userCouponValidityEnd + ", userCouponValidityStart=" + userCouponValidityStart + ", userId=" + userId
                + ", userPlatformCouponCode=" + userPlatformCouponCode + "]";
    }

}

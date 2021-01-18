package com.fourhealth.dto;

import java.util.List;

public class UserCouponDTO {
    private String userCouponCode; // 사용자 보유 큐폰 코드
    private String userId; // 사용자아이디
    private String userPlatformCouponCode; // 사용자 플렛폼 쿠폰 코드
    private String userCouponValidityStart; // 사용자 보유 쿠폰 유효기간 시작
    private String userCouponValidityEnd; // 사용자 보유 쿠폰 유효기간 종료
    private String userCouponRegDate; // 사용자 쿠폰 시스템 등록일자
    private String userCouponUseDate; // 사용자 쿠폰 사용일자
    private List<CouponDTO> CouponList; // 플렛폼 등급 에 따른 쿠폰 리스트

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

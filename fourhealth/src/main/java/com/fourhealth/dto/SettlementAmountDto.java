package com.fourhealth.dto;

public class SettlementAmountDto {

    private String settlementAmountCode;
    private String userId;
    private String trainerPromotionNoticeCode;
    private String settlementAmountPay;
    private String settlementAmountDay;

    public String getSettlementAmountCode() {
        return settlementAmountCode;
    }

    public void setSettlementAmountCode(String settlementAmountCode) {
        this.settlementAmountCode = settlementAmountCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTrainerPromotionNoticeCode() {
        return trainerPromotionNoticeCode;
    }

    public void setTrainerPromotionNoticeCode(String trainerPromotionNoticeCode) {
        this.trainerPromotionNoticeCode = trainerPromotionNoticeCode;
    }

    public String getSettlementAmountPay() {
        return settlementAmountPay;
    }

    public void setSettlementAmountPay(String settlementAmountPay) {
        this.settlementAmountPay = settlementAmountPay;
    }

    public String getSettlementAmountDay() {
        return settlementAmountDay;
    }

    public void setSettlementAmountDay(String settlementAmountDay) {
        this.settlementAmountDay = settlementAmountDay;
    }

    @Override
    public String toString() {
        return "SettlementAmount [settlementAmountCode=" + settlementAmountCode + ", settlementAmountDay="
                + settlementAmountDay + ", settlementAmountPay=" + settlementAmountPay + ", trainerPromotionNoticeCode="
                + trainerPromotionNoticeCode + ", userId=" + userId + "]";
    }

}

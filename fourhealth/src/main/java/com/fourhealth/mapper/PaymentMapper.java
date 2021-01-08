package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    public String checkPromotionPayment(String userId);

}

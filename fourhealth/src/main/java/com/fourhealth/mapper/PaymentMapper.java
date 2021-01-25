package com.fourhealth.mapper;

import java.util.List;

import com.fourhealth.dto.UserCouponDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    public String checkPromotionPayment(String userId);

    public List<UserCouponDto> userCouponList(String userId);

}

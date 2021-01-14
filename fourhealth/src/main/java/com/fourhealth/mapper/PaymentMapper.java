package com.fourhealth.mapper;

import java.util.List;

import com.fourhealth.dto.UserCouponDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    public String checkPromotionPayment(String userId);

    public List<UserCouponDTO> userCouponList(String userId);

}

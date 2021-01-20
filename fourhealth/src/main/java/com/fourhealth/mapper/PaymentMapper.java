package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import com.fourhealth.dto.UserCouponDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    public String checkPromotionPayment(String userId);

    public List<UserCouponDTO> userCouponList(String userId);

    public int promotionPaymentInsert(Map<String, Object> map);

    public String checkCountPromotionPayment(String userId, String trainerPromotionNoticeCode);

    public String checkMatching(String userId);

}

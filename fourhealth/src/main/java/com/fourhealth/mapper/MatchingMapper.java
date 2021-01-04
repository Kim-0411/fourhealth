package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MatchingMapper {
    public String checkPromotionPayment(String userId);

}

package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserCouponDto;
import com.fourhealth.mapper.MatchingMapper;
import com.fourhealth.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {

	@Autowired
	private PaymentMapper paymentMapper;

	// 사용자가 프로모션 신청시 최초데이터 체크 서비스
	public String checkPromotionPayment(String userId) {
		System.out.println(userId);
		String re = paymentMapper.checkPromotionPayment(userId);
		return re;
	}

	public List<UserCouponDto> userCouponList(String userId) {
		System.out.println(userId);
		List<UserCouponDto> userCouponList = paymentMapper.userCouponList(userId);
		return userCouponList;
	}
}

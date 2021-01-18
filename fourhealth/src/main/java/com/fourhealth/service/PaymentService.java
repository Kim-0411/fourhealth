package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.UserCouponDTO;
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

	// 사용자의 쿠폰 리스트 가져오기
	public List<UserCouponDTO> userCouponList(String userId) {
		System.out.println(userId);
		List<UserCouponDTO> userCouponList = paymentMapper.userCouponList(userId);
		return userCouponList;
	}

	public int checkCountPromotionPayment(String userId, String trainerPromotionNoticeCode) {
		String re = paymentMapper.checkCountPromotionPayment(userId, trainerPromotionNoticeCode);
		int checkCount = Integer.parseInt(re);

		return checkCount;
	}

	public String checkMatching(String userId) {
		String re = paymentMapper.checkMatching(userId);
		return re;
	}
}

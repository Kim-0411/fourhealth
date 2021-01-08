package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.mapper.MatchingMapper;
import com.fourhealth.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {

	@Autowired
	private PaymentMapper paymentMapper;

	public String checkPromotionPayment(String userId) {
		System.out.println(userId);
		String re = paymentMapper.checkPromotionPayment(userId);

		return re;
	}
}

package com.fourhealth.service;

import com.fourhealth.mapper.MatchingMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MatchingService {

    @Autowired
    private MatchingMapper matchingMapper;

    public String checkPromotionPayment(String userId) {
        System.out.println(userId);
        String a = matchingMapper.checkPromotionPayment(userId);

        return a;
    }
}

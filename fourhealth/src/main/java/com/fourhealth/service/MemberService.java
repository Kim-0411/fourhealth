package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MemberDTO;
import com.fourhealth.mapper.MemberMapper;


@Service
@Transactional
public class MemberService {
	@Autowired
    private MemberMapper memberMapper;

    public MemberDTO getMember(String userId) {
    	MemberDTO memberDto = memberMapper.getMember(userId);
        System.out.println("맴버 서비스 ------------" + memberDto);
        return memberDto;
    }

}

package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fourhealth.dto.Member;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional


public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public Member getMemberById(String memberId) {

		Member member = memberMapper.getMemberById(memberId);

		return member;
	}

	public String addMember(Member member) {
		String insertCheck = "회원가입 실패";
		if (member != null) {
			int result = memberMapper.addMember(member);
			if (result > 0)
				insertCheck = "회원가입 성공";
		}

		return insertCheck;
	}

}

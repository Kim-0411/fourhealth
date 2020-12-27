package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional


public class MemberService {
	@Autowired 
	private MemberMapper memberMapper;
	
	
	//로그인 
		public MemberDto getMemberById(String userId) {
			System.out.println(userId);
			
			MemberDto member = memberMapper.getMemberById(userId);
			
			System.out.println("로그인아 성공해" + member);
			return member;
		}
	

	//회원가입
	public String addMember(MemberDto member) {
		String insertCheck = "회원가입 실패";
		if (member != null) {
			int result = memberMapper.addMember(member);
			if (result > 0)
				insertCheck = "회원가입 성공";
		}

		return insertCheck;
	}

	//아이디 중복 체크
	public int userIdCheck(String user_id) {
		int count = memberMapper.userIdCheck(user_id);
		
		
		return count;
		
	}
	

}

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
	
	//전체회원조회 및 관리자, 트레이너, 사용자 변환
	public List<MemberDto> viewMember() {
		List<MemberDto> memberList = memberMapper.viewMember();
		
		System.out.println(memberList);
		
		
//		int listSize = memberList.size();
//		
//		for(int i=0; i<listSize; i++) {
//			if("1".equals(memberList.get(i).getUserLevel())) {
//				memberList.get(i).setUserLevel("관리자");
//			}else if("2".equals(memberList.get(i).getUserLevel())) {
//				memberList.get(i).setUserLevel("트레이너");
//			}else if("3".equals(memberList.get(i).getUserLevel())) {
//				memberList.get(i).setUserLevel("사용자");				
//			}
//		}
//		
//		System.out.println("전체회원 조회" + memberList);
		System.out.println("test");
		
		return memberList;
		
	}
	
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

package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;

	// 로그인 (공통)
	public MemberDto getMemberById(String userId) {
		System.out.println(userId);

		MemberDto member = memberMapper.getMemberById(userId);

		System.out.println("로그인아 성공해" + member);
		return member;
	}

	// 전체회원조회 및 관리자, 트레이너, 사용자 변환
	public List<MemberDto> viewMember() {
		List<MemberDto> memberList = memberMapper.viewMember();
		System.out.println(memberList);

		int listSize = memberList.size();
		for (int i = 0; i < listSize; i++) {
			if ("user_level_001".equals(memberList.get(i).getMemberLevel())) {
				memberList.get(i).setMemberLevel("관리자");
			} else if ("user_level_002".equals(memberList.get(i).getMemberLevel())) {
				memberList.get(i).setMemberLevel("트레이너");
			} else if ("user_level_003".equals(memberList.get(i).getMemberLevel())) {
				memberList.get(i).setMemberLevel("사용자");
			}
		}

		System.out.println("전체회원 조회" + memberList);

		return memberList;
	}

}
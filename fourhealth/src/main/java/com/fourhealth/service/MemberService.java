package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional

public class MemberService {
	@Autowired
	private MemberMapper memberMapper;

	// 전체회원조회 및 관리자, 트레이너, 사용자 변환
	public List<MemberDto> viewMember() { 
		List<MemberDto> memberList = memberMapper.viewMember();
		System.out.println(memberList);
		
		 int listSize = memberList.size();
		 for(int i=0; i<listSize; i++) {
				if("user_level_001".equals(memberList.get(i).getMemberLevel())) {
					memberList.get(i).setMemberLevel("관리자");
				}else if("user_level_002".equals(memberList.get(i).getMemberLevel())) {
					memberList.get(i).setMemberLevel("트레이너");
				}else if("user_level_003".equals(memberList.get(i).getMemberLevel())) {
					memberList.get(i).setMemberLevel("사용자");				
				}
			}
		  
		 System.out.println("전체회원 조회" + memberList); 
		
		 return memberList;
	}
		  

	// 로그인 (공통)
	public MemberDto getMemberById(String userId) {
		System.out.println(userId);

		MemberDto member = memberMapper.getMemberById(userId);

		System.out.println("로그인아 성공해" + member);
		return member;
	}

	// 회원가입(공통)
	public String addMember(MemberDto member) {
		String insertCheck = "회원가입 실패";
		if (member != null) {
			int result = memberMapper.addMember(member);
			if (result > 0)
				insertCheck = "회원가입 성공";
		}

		return insertCheck;
	}

	// 아이디 중복 체크(공통)
	public int userIdCheck(String user_id) {
		int count = memberMapper.userIdCheck(user_id);

		return count;

	}

	// 트레이너 로그인 햇을때 넣어주자.

	/*
	 * //로그인된 내 프로모션 전체 조회 (트레이너) public List<NoticePromotionTrainerDto>
	 * trainerGetMyPromotionList(String trainerId){ List<NoticePromotionTrainerDto>
	 * myPromotionList = memberMapper.trainerGetMyPromotionList(trainerId); return
	 * myPromotionList; }
	 */

	/*
	 * //자신의 프로모션 별 회원에게 운동이나음식 넣어주기위해 프로모션 접근햇을때 등록된회원 조회 (트레이너) public
	 * List<MatchingUserTrainerDto> trainerGetMatchingUserList(String
	 * promotionCode){ List<MatchingUserTrainerDto> getMatchingUserList =
	 * memberMapper.trainerGetMatchingUserList(promotionCode);
	 * 
	 * return getMatchingUserList; }
	 */

	// 내회원 조회 페이지에서 특정 회원 클릭하여 접근시 그 회원 정보(트레이너)
	public UserDto trainerGetMatchingUserInfo(String userId) {

		UserDto userInfo = memberMapper.trainerGetMatchingUserInfo(userId);
		return userInfo;
	}

}
package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.mapper.MemberMapper;


@Service
@Transactional

public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	//관리자 화면단 검색 처리
//	public List<MemberDto> getSearchMemberList(String searchKey, String searchValue){
//		List<MemberDto> member_all_list = memberMapper.getSearchMemberList(searchKey, searchValue);
//		
//		int listSize = member_all_list.size();
//		for(int i=0; i<listSize; i++) {
//			if("1".equals(member_all_list.get(i).getMemberLevel())) {
//				member_all_list.get(i).setMemberLevel("관리자");
//			}else if("2".equals(member_all_list.get(i).getMemberLevel())) {
//				member_all_list.get(i).setMemberLevel("판매자");
//			}else if("3".equals(member_all_list.get(i).getMemberLevel())) {
//				member_all_list.get(i).setMemberLevel("구매자");				
//			}else {
//				member_all_list.get(i).setMemberLevel("일반회원");
//			}
//		}
//		
//		return member_all_list;
//	}
	
	
	//회원 삭제처리
	public String removeMasterMember(String memberId, String memberPw, String memberLevel) {
		String result = "회원 삭제 실패";

		
		//id member테이블 조회하고 조회한 결과 값 중 비밀번호와 화면에서 입력받은 비밀번호가 일치하면 삭제 처리
		MemberDto memberDto = memberMapper.getMemberById(memberId);
		
		if(memberDto != null && memberDto.getMemberPw() != null && memberPw.equals(memberDto.getMemberPw())) {
			
			System.out.println("test성공");
		
			int removeCheck = memberMapper.removeMemberById(memberId);
			/*
			int removeCheck = memberMapper.removeLoginById(memberId);
			
			if("판매자".equals(memberLevel)) removeCheck += memberMapper.removeGoodsById(memberId);
			
			if("구매자".equals(memberLevel)) removeCheck += memberMapper.removeOrderById(memberId);
			
			removeCheck += memberMapper.removeMemberById(memberId);
			*/
			//if(removeCheck > 0) result = "회원 삭제 성공";
			
		}
	//	return null;
		return result;
	}
	
	//전체회원조회 후 수정처리
	public String modifyMasterMember(MemberDto membedto) {
		String result = "회원 수정 실패";
		int modifyMemberCheck = memberMapper.modifyMasterMember(membedto);
		if(modifyMemberCheck > 0) result = "회원 수정 성공";
		return result;
	}
	

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
	


}
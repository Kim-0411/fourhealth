package com.fourhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;

	// 전체회원조회 및 관리자, 트레이너, 사용자 변환
	public List<CommonUserDto> viewMember() { 
		List<CommonUserDto> userList = memberMapper.viewMember();
		System.out.println(userList);
		
		 int listSize = userList.size();
		 for(int i=0; i<listSize; i++) {
				if("user_level_001".equals(userList.get(i).getUserLevelCode())) {
					userList.get(i).setUserLevelCode("관리자");
				}else if("user_level_002".equals(userList.get(i).getUserLevelCode())) {
					userList.get(i).setUserLevelCode("트레이너");
				}else if("user_level_003".equals(userList.get(i).getUserLevelCode())) {
					userList.get(i).setUserLevelCode("사용자");				
				}
			}
		  
		 System.out.println("전체회원 조회" + userList); 
		
		 return userList;
	}

	// 로그인 (공통)
	public CommonUserDto getMemberById(String userId) {
		System.out.println(userId);

		CommonUserDto user = memberMapper.getMemberById(userId);

		System.out.println("로그인아 성공해" + user);
		return user;
	}

	// 회원가입(공통)
	public String addMember(CommonUserDto user) {
		String insertCheck = "회원가입 실패";
		if (user != null) {
			int result = memberMapper.addMember(user);
			if (result > 0)
				insertCheck = "회원가입 성공";
		}

		return insertCheck;
	}

	// 아이디 중복 체크(공통)
	public int memberIdCheck(String user_id) {
		int count = memberMapper.memberIdCheck(user_id);

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
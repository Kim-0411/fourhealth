package com.fourhealth.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.fourhealth.dto.MemberDto;


@Mapper
public interface MemberMapper {
	
	
	public List<MemberDto> viewMember();

	public MemberDto getMemberById(String memberId);
	
	public int userIdCheck(String userId);
	
	//회원가입
	public int addMember(MemberDto member);


	
}

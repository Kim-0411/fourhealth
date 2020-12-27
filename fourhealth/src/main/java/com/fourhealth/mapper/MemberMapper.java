package com.fourhealth.mapper;


import org.apache.ibatis.annotations.Mapper;
import com.fourhealth.dto.MemberDto;


@Mapper
public interface MemberMapper {


	public MemberDto getMemberById(String memberId);
	
	public int userIdCheck(String userId);
	
	//회원가입
	public int addMember(MemberDto member);


	
}

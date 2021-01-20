package com.fourhealth.dto;

import java.util.List;

//테이블명 : tb_common_user 회원 공통 관
public class MemberDto {

    private String memberId;			//회원 공통 관리 아이디
    private String memberLevel;			//회원 공통 권한별 레벨
    private String memberPw;			//회원 공통 비밀번호
    private String memberName;			//회원 공통 이름
    private String memberAddr;			//회원 공통 주소
    private String memberNickname;		//회원 공통 닉네임
    private String memberPhone;			//회원 공통 전화번호
    private String memberEmail;			//회원 공통 이메일
	private String memberBirth;			//회원 공통 생년월일
    private String memberGender;		//회원 공통 성별
    private String memberMainBank;		//회원 계좌 은행
    private String memberBankNumber;	//회원 계좌 번호
    private String memberBankMaster;	//회원 계좌주
    private String memberRegDate;       //회원 공통 등록 일자
    private UserDto userDto;			//UserDto 활용
    private TrainerDto trainerDto;		//TrainerDto 활용
    
    
    public TrainerDto getTrainerDto() {
		return trainerDto;
	}

	public void setTrainerDto(TrainerDto trainerDto) {
		this.trainerDto = trainerDto;
	}

	public String getMemberEmail() {
    	return memberEmail;
    }
    
    public void setMemberEmail(String memberEmail) {
    	this.memberEmail = memberEmail;
    }

    public String getMemberPhone() {
    	return memberPhone;
    }
    
    public void setMemberPhone(String memberPhone) {
    	this.memberPhone = memberPhone;
    }
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddr() {
        return memberAddr;
    }

    public void setMemberAddr(String memberAddr) {
        this.memberAddr = memberAddr;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberBirth() {
        return memberBirth;
    }

    public void setMemberBirth(String memberBirth) {
        this.memberBirth = memberBirth;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberMainBank() {
        return memberMainBank;
    }

    public void setMemberMainBank(String memberMainBank) {
        this.memberMainBank = memberMainBank;
    }

    public String getMemberBankNumber() {
        return memberBankNumber;
    }

    public void setMemberBankNumber(String memberBankNumber) {
        this.memberBankNumber = memberBankNumber;
    }

    public String getMemberBankMaster() {
        return memberBankMaster;
    }

    public void setMemberBankMaster(String memberBankMaster) {
        this.memberBankMaster = memberBankMaster;
    }

    public String getMemberRegDate() {
        return memberRegDate;
    }

    public void setMemberRegDate(String memberRegDate) {
        this.memberRegDate = memberRegDate;
    }   

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberLevel=" + memberLevel + ", memberPw=" + memberPw
				+ ", memberName=" + memberName + ", memberAddr=" + memberAddr + ", memberNickname=" + memberNickname
				+ ", memberPhone=" + memberPhone + ", memberEmail=" + memberEmail + ", memberBirth=" + memberBirth
				+ ", memberGender=" + memberGender + ", memberMainBank=" + memberMainBank + ", memberBankNumber="
				+ memberBankNumber + ", memberBankMaster=" + memberBankMaster + ", memberRegDate=" + memberRegDate
				+ ", userDto=" + userDto + ", trainerDto=" + trainerDto + "]";
	}

}
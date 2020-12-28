package com.fourhealth.dto;

//테이블명 : tb_common_user
public class MemberDto {

    private String memberId;
    private String memberLevel;
    private String memberPw;
    private String memberName;
    private String memberAddr;
    private String memberNickname;
    private String memberPhone;
    private String memberEmail;
	private String memberBirth;
    private String memberGender;
    private String memberMainBank;
    private String memberBankNumber;
    private String memberBankMaster;
    private String memberRegDate;
    
    
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

    @Override
    public String toString() {
        return "MemberDTO [memberAddr=" + memberAddr + ", memberBankMaster=" + memberBankMaster + ", memberBankNumber="
                + memberBankNumber + ", memberBirth=" + memberBirth + ", memberGender=" + memberGender + ", memberId="
                + memberId + ", memberLevel=" + memberLevel + ", memberMainBank=" + memberMainBank + ", memberName="
                + memberName + ", memberNickname=" + memberNickname + ", memberPw=" + memberPw + ", memberRegDate="
                + memberRegDate + "]";
    }

}
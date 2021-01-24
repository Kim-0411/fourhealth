package com.fourhealth.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.mapper.MemberMapper;

@Service
@Transactional
public class pwService {

    @Autowired
    private MemberMapper memberMapper;

    // 아이디 있을시 이메일 전송
    public void emailSend(String email) throws AddressException, MessagingException {
        String host = "smtp.naver.com";
        final String userName = "thsgusdnr123";
        final String passWord = "altnr12";
        int port = 465;
        System.out.println("아이디 있을 시 이메일 전송 : 됨");

        String recipient = "thsgusdnr123@naver.com";
        String subject = "안녕하세요.Fourhealth입니다.";
        String rePw = "";

        // 난수를 통해 임시 비밀번호 12 자리 생성.
        for (int i = 0; i < 12; i++) {
            rePw += (char) ((Math.random() * 26) + 97);
        }
        String body = "임시 비밀번호는 " + rePw + "입니다.";
        MemberDto member = new MemberDto();
        member.setMemberEmail(email);
        member.setMemberPw(rePw);
        System.out.println(rePw + " 임시 비밀번호 출력 : 됨");

        // 비번 변경.
        int result = memberMapper.rePw(member);

        Properties props = System.getProperties();

        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.trust", host);

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            String un = userName;
            String pw = passWord;

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(un, pw);
            }
        });

        session.setDebug(true);

        Message mimeMessage = new MimeMessage(session);
        // 이부분이 받은사람 이메일 .
        mimeMessage.setFrom(new InternetAddress(email));
        mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(body);
        Transport.send(mimeMessage);
    }

    // 검색 결과 이메일
    public String userEmail(String email) {
        String useremail = memberMapper.find_pw(email);
        return useremail;

    }

}

package com.fourhealth.encryption;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor(); 
		pbeEnc.setAlgorithm("PBEWithMD5AndDES"); 
		pbeEnc.setPassword("ksmart37"); 
		String url = "jdbc:log4jdbc:mysql://kjc0411.cafe24.com:3306/ksmart37db?serverTimezone=UTC&characterEncoding=UTF8"; 
		String username = "kjc0411"; 
		String password = "ksmart37!!"; 
		System.out.println("기존 URL :: " + url + " | 변경 URL :: " + pbeEnc.encrypt(url)); 
		System.out.println("기존 username :: " + username + " | 변경 username :: " + pbeEnc.encrypt(username)); 
		System.out.println("기존 password :: " + password + " | 변경 password :: " + pbeEnc.encrypt(password));
		System.out.println(pbeEnc.decrypt("4oqbgkf8H4XDac8cZiAc7A=="));
		System.out.println(pbeEnc.decrypt("eJXFZWCeK6H8CtdJPVwV+kMkIHR2Yt5S"));
	}

}

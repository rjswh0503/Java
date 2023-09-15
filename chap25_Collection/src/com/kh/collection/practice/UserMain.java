package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMain {

	
	public static void main(String[] args) {
		
		
		Map<String,String> UserInfo = new HashMap<>();
		
		
		//유저 정보 (이름 이메일)
		UserInfo.put("김", "kim1234@naver.com");
		UserInfo.put("신", "Shin1234@naver.com");
		UserInfo.put("박", "Park1234@naver.com");
		UserInfo.put("이", "Lee1234@naver.com");
		
		System.out.println("회원 목록 ");
		for(Map.Entry<String , String > user : UserInfo.entrySet()) {
			String name = user.getKey();
			String addr = user.getValue();
			System.out.println("유저 정보 : " + name + "|" + "주소 : " + addr);
		}
		
		
		//특정 유저 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 회원이름 : ");
		String UserName = sc.next();
		
		if(UserInfo.containsKey(UserName)) {
			String name = UserInfo.get(UserName);
			System.out.println("유저 검색 : " + UserName);
		}else {
			System.out.println(UserName + "을 찾을 수 없습니다.");
		}
		
		//유저 주소 수정
		System.out.print("수정할 회원 : ");
		String UserUpdate = sc.next();
		String newAdr = sc.next();
		UserInfo.put(UserUpdate, newAdr);
		System.out.println("유저정보 수정 : " + UserUpdate + "님의 주소를  " + newAdr + "으로 수정했습니다.");
		
		
		
		//회원 탈퇴
		System.out.print("회원 탈퇴 : ");
		String removeUser = sc.next();
		UserInfo.remove(removeUser);
		System.out.println("'" + removeUser +"'" +"님이 회원탈퇴 하였습니다.");
		
		
		
		System.out.println("남은 회원 : ");
		for(Map.Entry<String, String> user : UserInfo.entrySet()) {
			String name = user.getKey();
			String addr = user.getValue();
			System.out.println("유저 정보 : " + name + "|" + " 주소 : " + addr);
		}
		
	}

}

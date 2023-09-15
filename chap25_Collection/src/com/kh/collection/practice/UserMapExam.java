package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {

		
			//HashMap 생성 UserAge 
			Map<String,Integer> UserAge = new HashMap<>();
		
			//유저의 이름과 나이
			UserAge.put("KIM", 20);
			UserAge.put("Park",24);
			UserAge.put("Son", 27);
			UserAge.put("Yang", 30);
			
			System.out.println("유저 목록 : ");
			for(Map.Entry<String , Integer>entry : UserAge.entrySet()) {
				String name = entry.getKey();
				int age = entry.getValue();
				System.out.println(name + " : " + age);
			}
			System.out.println("===========================");
			
			
		
			//특정 유저 검색 
			String UserName = "Yang";
			if(UserAge.containsKey(UserName)) {
				
				int name = UserAge.get(UserName);
				System.out.println("유저 검색 : " + UserName);
			}else {
				System.out.println(UserName + "을 찾을 수 없습니다.");
			}
				
			System.out.println("===========================");
		
			// 유저 나이 수정
			String UserUpdate = "Yang";
			int newAge = 31;
			UserAge.put(UserUpdate, newAge);
			System.out.println("유저 수정 :" +   UserUpdate + "의 나이를" + newAge + "로 수정했습니다.");
			
			

		
			//유저 탈퇴
			System.out.println("************************");
			String removeUser = "Yang";
			UserAge.remove(removeUser);
			System.out.println(removeUser + "이 회원탈퇴 했습니다.");
			
			
			
			
			//최종 유저 출력 
			System.out.println("**************************");
			System.out.println("최종 유저 목록 : ");
			for(Map.Entry<String , Integer>entry : UserAge.entrySet()) {
				String name = entry.getKey();
				int age = entry.getValue();
				System.out.println(name + " : " + age);
				
			}
			
		
		
	}

}

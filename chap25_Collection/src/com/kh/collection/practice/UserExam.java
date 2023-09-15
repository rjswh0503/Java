package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		
		Map<String, Integer> UserInfo = new HashMap<>();
		
		
		
		UserInfo.put("kim", 20);
		UserInfo.put("Shin", 30);
		UserInfo.put("son", 27);
		UserInfo.put("Park", 24);
		
		
		String UserAge = "30";
		if(UserInfo.containsValue(UserAge)) {
			String name = UserInfo.toString();
			System.out.println("나이가" + UserAge + "인 사람은"+name+"입니다.");
		}else {
			System.out.println(UserAge + "인 사람의 이름을 찾지 못했습니다.");
			
		}

	}

}

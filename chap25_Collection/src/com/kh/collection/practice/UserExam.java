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
			System.out.println("���̰�" + UserAge + "�� �����"+name+"�Դϴ�.");
		}else {
			System.out.println(UserAge + "�� ����� �̸��� ã�� ���߽��ϴ�.");
			
		}

	}

}

package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {

		
			//HashMap ���� UserAge 
			Map<String,Integer> UserAge = new HashMap<>();
		
			//������ �̸��� ����
			UserAge.put("KIM", 20);
			UserAge.put("Park",24);
			UserAge.put("Son", 27);
			UserAge.put("Yang", 30);
			
			System.out.println("���� ��� : ");
			for(Map.Entry<String , Integer>entry : UserAge.entrySet()) {
				String name = entry.getKey();
				int age = entry.getValue();
				System.out.println(name + " : " + age);
			}
			System.out.println("===========================");
			
			
		
			//Ư�� ���� �˻� 
			String UserName = "Yang";
			if(UserAge.containsKey(UserName)) {
				
				int name = UserAge.get(UserName);
				System.out.println("���� �˻� : " + UserName);
			}else {
				System.out.println(UserName + "�� ã�� �� �����ϴ�.");
			}
				
			System.out.println("===========================");
		
			// ���� ���� ����
			String UserUpdate = "Yang";
			int newAge = 31;
			UserAge.put(UserUpdate, newAge);
			System.out.println("���� ���� :" +   UserUpdate + "�� ���̸�" + newAge + "�� �����߽��ϴ�.");
			
			

		
			//���� Ż��
			System.out.println("************************");
			String removeUser = "Yang";
			UserAge.remove(removeUser);
			System.out.println(removeUser + "�� ȸ��Ż�� �߽��ϴ�.");
			
			
			
			
			//���� ���� ��� 
			System.out.println("**************************");
			System.out.println("���� ���� ��� : ");
			for(Map.Entry<String , Integer>entry : UserAge.entrySet()) {
				String name = entry.getKey();
				int age = entry.getValue();
				System.out.println(name + " : " + age);
				
			}
			
		
		
	}

}

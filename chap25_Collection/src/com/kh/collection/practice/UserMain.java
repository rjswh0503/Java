package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMain {

	
	public static void main(String[] args) {
		
		
		Map<String,String> UserInfo = new HashMap<>();
		
		
		//���� ���� (�̸� �̸���)
		UserInfo.put("��", "kim1234@naver.com");
		UserInfo.put("��", "Shin1234@naver.com");
		UserInfo.put("��", "Park1234@naver.com");
		UserInfo.put("��", "Lee1234@naver.com");
		
		System.out.println("ȸ�� ��� ");
		for(Map.Entry<String , String > user : UserInfo.entrySet()) {
			String name = user.getKey();
			String addr = user.getValue();
			System.out.println("���� ���� : " + name + "|" + "�ּ� : " + addr);
		}
		
		
		//Ư�� ���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻� �� ȸ���̸� : ");
		String UserName = sc.next();
		
		if(UserInfo.containsKey(UserName)) {
			String name = UserInfo.get(UserName);
			System.out.println("���� �˻� : " + UserName);
		}else {
			System.out.println(UserName + "�� ã�� �� �����ϴ�.");
		}
		
		//���� �ּ� ����
		System.out.print("������ ȸ�� : ");
		String UserUpdate = sc.next();
		String newAdr = sc.next();
		UserInfo.put(UserUpdate, newAdr);
		System.out.println("�������� ���� : " + UserUpdate + "���� �ּҸ�  " + newAdr + "���� �����߽��ϴ�.");
		
		
		
		//ȸ�� Ż��
		System.out.print("ȸ�� Ż�� : ");
		String removeUser = sc.next();
		UserInfo.remove(removeUser);
		System.out.println("'" + removeUser +"'" +"���� ȸ��Ż�� �Ͽ����ϴ�.");
		
		
		
		System.out.println("���� ȸ�� : ");
		for(Map.Entry<String, String> user : UserInfo.entrySet()) {
			String name = user.getKey();
			String addr = user.getValue();
			System.out.println("���� ���� : " + name + "|" + " �ּ� : " + addr);
		}
		
	}

}

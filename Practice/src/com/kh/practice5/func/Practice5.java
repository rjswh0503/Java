package com.kh.practice5.func;

public class Practice5 {

	public static void main(String[] args) {
		
		//1. �ֹι�ȣ �����
		String jumin = "123456-1234567"; // �� 14�ڸ�
		
		//2. �����ڸ� ���� ��ǥ ����°� �����
		String makestar = "*";
		
		//toCharArray�� ����ؼ� String -> char Array�� ����
		char[] juminStar = jumin.toCharArray();
		//  {'1','2','3','4','5','6','-','1','2','3','4','5','6','7'}
		
		for(int i = 8; 8 <=14;i++) {
			
			juminStar[i] = '*';
			System.out.println(juminStar);
			
		}
		
		

	}
	

}

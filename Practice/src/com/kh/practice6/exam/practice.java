package com.kh.practice6.exam;

public class practice {
	public static void main(String[] args) {
		//���ڿ� �迭�� ����ؼ�
		//���� for Loop�� ���ڿ� �迭�� ��� �� 
		// ���� �� �����ڿ��� ã�� ����ϱ�
		
		String[] ss = {"apple","banana","cherry","elderberry"};
		String longss = " ";
		//���� �� ���ڿ� ã�Ƽ� ����ϱ�
		for(String str : ss) {
			//str.length
			if(str.length()>longss.length()) {
				longss = str;
			}
		}
		System.out.println("���� �� ���ڿ��� : " + longss);
		
		
	}

}

package com.kh.api.Exam1;

public class StringBufferMain {
	
	/*
	 StringBuffer
	  	���ڿ��� ȿ�������� �ٷ�� ���� Ŭ���� 
	  	�ٲ�ų� �ٲ� �� �ִ� ���ڿ��� ��Ÿ����, 
	  	���ڿ��� �����̳� ������ �ʿ��� ��� ���
	 * */
	
	

	public static void main(String[] args) {
		//�� StringBuffer ��ü ����
		StringBuffer sb = new StringBuffer();
		
		//���ڿ� �߰�
		sb.append("Hello, ");
		sb.append("Java  ");
		sb.append("StringBuffer");
		System.out.println(sb.toString());
		
		//���ڿ� ����
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		//���ڿ� ����
		sb.delete(13, 20);
		System.out.println(sb.toString());
		
		//���ڿ� ������
		sb.reverse();
		System.out.println(sb.toString());
		
	}

}

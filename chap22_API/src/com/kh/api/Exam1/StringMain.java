package com.kh.api.Exam1;

public class StringMain {

	public static void main(String[] args) {
		String greeting = "Hello, World";
		
		
		//���࿡ ���ڿ��� ���� �� ���� ���� == equals
		if(greeting.equals("Hello, World")) {
			System.out.println("���ڿ��� �����ϴ�.");
		}
		//���ڸ� ����
		String name = "Alice";
		String msg = " Hello, " + name +" ! ";
		System.out.println(msg);

	}

}

package com.kh.OverloadingEx;

public class OverloadingEx {
	public int sum(int a, int b) {
		return a+b;
		/*
		 java ������ ����µ�
		 ���ϸ� : OverSample.java �����
		 �����ε� 5�� ����� �޼��� 5�� ����ϱ� 
		 
		 */
		
		
		
	}
	
	
	public int sum(int a, int b,int c) {
		return a+b+c;
	
	
	}
	public double sum(double a, double b) {
		return a+b;
		
	}
	public double sum(double a, double b,double c) {
		return a+b;
	
	}
	
	public static void main(String[] args) {
		OverloadingEx obj = new OverloadingEx();
		
		
		System.out.println("�� ������ �� : " + obj.sum(0, 0));
		System.out.println("�� ������ �� : " + obj.sum(0, 0, 0));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(0, 0));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(0, 0, 0));
		
		
		
		
	}
	

}



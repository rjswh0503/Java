package com.kh.OverloadingEx;

public class OverloadingEx {
	public int sum(int a, int b) {
		return a+b;
		/*
		 java 파일을 만드는데
		 파일명 : OverSample.java 만들고
		 오버로딩 5개 만들고 메서드 5개 출력하기 
		 
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
		
		
		System.out.println("두 정수의 합 : " + obj.sum(0, 0));
		System.out.println("세 정수의 합 : " + obj.sum(0, 0, 0));
		System.out.println("두 실수의 합 : " + obj.sum(0, 0));
		System.out.println("세 실수의 합 : " + obj.sum(0, 0, 0));
		
		
		
		
	}
	

}



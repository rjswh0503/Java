package com.kh.classCircle;

public class Circle {
	//맴버변수 
	private final double PI = 3.14; // 상수 
	private int redius = 1; // 변수 
	
	
	//생성자
	public Circle() {
			//기본 생성자
		
	}
	//메서드에서 
	//반지름에 대해 출력
	public void inRadius() {
		redius++;
		//반지름 증가 증가시킬 양을 지정할 수 있다
	}
	public void AreaCircle() {
	
		
		//원의 넓이를 계산하고 출력하는 메소
		double area = PI * redius * redius;
		System.out.println("원의 넓이 : " + area);
		
		
	}
	public void SizeOfCircle() {
		System.out.println();
		
		
		
	}
	

}

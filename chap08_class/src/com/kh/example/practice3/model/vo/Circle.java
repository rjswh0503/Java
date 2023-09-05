package com.kh.example.practice3.model.vo;

public class Circle {
	double dNum = 3.14;
	int Num = 1;
	
	
	
	public Circle() {
		
		
		
	}
	
	public void incrementRadius() {
		Num++;
		System.out.println("Num : " + Num);
		
		
	}
	public void getAreaOfCIRCLE() {
		double area = dNum * Num * Num;
		System.out.println("area : " + area);	
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : " +Num );
	}
	
	
	
	
	
			

}

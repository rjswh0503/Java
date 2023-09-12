package com.kh.abstractSample;

abstract class Shape {
// 추상클래스 정의 
	private String color;
	
	
	//추상 메서드 (하위 클래스에서 구현해야 함)
	abstract double calculateArea();
	abstract double rectangleArea();
	
	
	//생성자
	public Shape(String color) {
		this.color = color;
	}
	
	
	//일반 메서드 
	
	public void  setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}

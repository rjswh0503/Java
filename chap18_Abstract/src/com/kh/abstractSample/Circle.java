package com.kh.abstractSample;
//추상 클래스를 상속받는 구체적은 클래스 정의(하위 클래스)
public class Circle extends Shape {

		// TODO Auto-generated constructor stub
	

	private double radius;
	
	
	
	
	//생성자
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	
	}
	
	//추상 메서드 구현
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;

	
	}
	

}

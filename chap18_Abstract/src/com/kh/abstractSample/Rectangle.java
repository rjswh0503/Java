package com.kh.abstractSample;
							  //부모클래스
public abstract class Rectangle extends Shape {
	
	
	private double width;
	private double height;
	
	
	
	
	public Rectangle(String color,double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	
	
	@Override
	public double calculateArea() {
		return  width * height;
	}
	
	
	

}

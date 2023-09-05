package com.kh.example.practice3.model.vo;

public class Cricle {
	private double PI = 3.14;
	private int radius = 1;
	
	
	
	public Cricle() {
		
		
		
		
	}
	
	
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void setPI(double pI) {
		PI = pI;
	}
	
	
	
	
	

	public double getPI() {
		return PI;
	}



	



	public int getRadius() {
		return radius;
	}
	
	
	
	public void incrementRadius() {
		radius++;
		
		
		
	}
	public void getAreaOfCircle() {
		double area = PI * radius * radius;
		System.out.println("¿øÀÇ ³ÐÀÌ : " + area);
		
	}
	public void getSizeOfCircle() {
		
	}



	
		
	
		
		
	
	

}

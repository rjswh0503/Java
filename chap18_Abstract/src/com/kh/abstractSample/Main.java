package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle("red",5.0);
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle Color : " + circle.getColor());
		//Rectangle r = new Rectangle
		System.out.println();
		
		Rectangle retangle = new Rectangle("red",2.0,3.0);
		System.out.println("Rectangle Area : " + retangle.rectangleArea());
		

	}

}

package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	
	public String calArea(int x, int y, int radius) {
		return "���� : " + c.toString()  +Math.PI * radius * radius;
	}
	public String calCircum(int x, int y, int radius) {
		return "�ѷ� : " + c.toString() +Math.PI * radius *2;
	}
	
	
	
	

}

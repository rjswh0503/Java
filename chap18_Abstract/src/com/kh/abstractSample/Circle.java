package com.kh.abstractSample;
//�߻� Ŭ������ ��ӹ޴� ��ü���� Ŭ���� ����(���� Ŭ����)
public class Circle extends Shape {

		// TODO Auto-generated constructor stub
	

	private double radius;
	
	
	
	
	//������
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	
	}
	
	//�߻� �޼��� ����
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;

	
	}
	

}

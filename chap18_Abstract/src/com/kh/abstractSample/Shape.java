package com.kh.abstractSample;

abstract class Shape {
// �߻�Ŭ���� ���� 
	private String color;
	
	
	//�߻� �޼��� (���� Ŭ�������� �����ؾ� ��)
	abstract double calculateArea();
	abstract double rectangleArea();
	
	
	//������
	public Shape(String color) {
		this.color = color;
	}
	
	
	//�Ϲ� �޼��� 
	
	public void  setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}

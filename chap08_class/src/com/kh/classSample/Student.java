package com.kh.classSample;

public class Student {
	// 1. �ɹ����� ( �л��� �Ӽ�)
	String name;
	int age;
	String grade; 
	
	      //(�޼��� �� �Ϻ�)
	/********** ������ **********/
	
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	//�л� ���� ��� �޼ҵ�
	public void displayInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println(" �� �� : " + age);
		System.out.println(" �� �� : " + grade);
		
	}
	
	  
	  
	  
	  

}

package com.kh.example.practice4.model.vo;

public class Student {
	/*
	  - grade : int
- classroom : int
- name : String
- height : double
- gender : char
+ Student()
+ information() : void
	  
	  */
	
	int grade;
	int classroom;
	String name;
	double height;
	char gender;

	
	public Student() {
		
		this.grade = 6; // 6���� �ʱ�ȭ
		this.classroom = 4; //4���� �ʱ�ȭ
		this.name = "������"; // �̸� �ʱ�ȭ
		this.height = 176.7; // ���� 176.7�� �ʱ�ȭ
		this.gender = '��'; //������ �ʱ�ȭ
		
		
		// ��� �޼���
		
	}
	
	public void information() {
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("���� : " + gender);
		
		
	}


		
	
	
	
	
	
	
	

}

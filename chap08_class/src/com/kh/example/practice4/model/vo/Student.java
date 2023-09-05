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
		
		this.grade = 6; // 6으로 초기화
		this.classroom = 4; //4으로 초기화
		this.name = "신재헌"; // 이름 초기화
		this.height = 176.7; // 무게 176.7로 초기화
		this.gender = '남'; //성별로 초기화
		
		
		// 출력 메서드
		
	}
	
	public void information() {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		
	}


		
	
	
	
	
	
	
	

}

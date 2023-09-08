package com.kh.pattern.mvc.model;

public class UserModel {
	
	
	// 정보 넣는곳 
	
	
	
	private String name;
	private int age;
	
	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	

	

	

	
	
	

	
		
		
		/*
		 1.학생 정보 출력
		 private  이름 나이
		 getter setter 만들기
		  
		  
		  
		  
		  
		  */

	

}

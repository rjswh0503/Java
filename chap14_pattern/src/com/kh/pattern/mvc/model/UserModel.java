package com.kh.pattern.mvc.model;

public class UserModel {
	
	
	// ���� �ִ°� 
	
	
	
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
		 1.�л� ���� ���
		 private  �̸� ����
		 getter setter �����
		  
		  
		  
		  
		  
		  */

	

}

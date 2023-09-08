package com.kh.pattern.single;

public class SingleStudent {	
	private String name;
	//생성자
	
	
	
	private SingleStudent() {
		
	}
	
	
	
	public void display() {
		System.out.println("싱글톤 학생입니다.");
	}
	
	
	
	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent();
		
		
		std1.display();
		

	}

}

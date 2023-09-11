package com.kh.pattern.single;

public class SingleStudent {	
	private String name;
	//생성자
	
	
	//모델
	private SingleStudent() {
		
	}
	
	
	//뷰
	public void display() {
		System.out.println("싱글톤 학생입니다.");
	}
	
	
	//컨트롤러
	
	
	
	//클라이언트
	
	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent();
		
		
		std1.display();
		

	}

}

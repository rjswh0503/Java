package com.kh.superSample;

// 			  자식이 상속받는다 부모를

public class Child extends Parent {				// 자식 클래스 
	
	
	//Child()  접근제한자가 default로 변경된 것일 뿐 public이랑 쓰임은 똑같음
	
	Child() {
		super();// 부모클래스의 기본 생성자를 호출 
		System.out.println("자식 클래스의 기본 생성자입니다.");
		
	}
	
	public Child(String name) {
		super(name); // 부모 클래스의 문자열 파라미터 생성자 호출
		System.out.println("자식 클래스의 문자열 파라미터 생성자입니다.");
		
	}
	
	public void display() {
		super.show(); //부모 클래스의 show 출력 메서드 호출
		System.out.println("자식 클래스의 display 메서드 입니다.");
	}
	
	
	
	
	
}

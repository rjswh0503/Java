package com.kh.inheritance.animal;

public class Animal { //동물 클래스 정의
	private String name; // 객체(=인스턴스)에 할당된  변수 
	
	
	
	public Animal(String name) {
		this.name = name; // this 키워드를 이용해서 인스턴스 변수에 값을 할당 
		
	}
	
	
	public void setName() {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	
	public void info() {
		System.out.println("이름 :" + name);
	}
	
	
	//animal에 적혀 있는 eat을 고양이 안에서만 다시 정의를 내린다.
	public void eat() {
		System.out.println(name + " 먹이를 먹습니다.");
		
	}
	
	public void sleep() {
		System.out.println(name + " 이(가) 잠을 잡니다.");
		
	}
	
	
	public void run() {
		System.out.println(name + "주인이 와서 달린다");
	}
	
	public void up() {
		System.out.println("나무 위로 올라갔다.");
	}
	
	public void jump() {
		System.out.println("주인을 보자 점프한다");
	}
	
	public void bite() {
		System.out.println("주인을 보자 물었습니다.");
	}

}

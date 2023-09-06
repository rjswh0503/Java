package com.kh.inheritance.animal;

public class Rabbit extends Animal {

	public Rabbit(String name) {
		super(name);
		
	}
	
	
	@Override
	public void jump() {
		System.out.println("주인을 보자 점프했습니다.");
	}
	

}

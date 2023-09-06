package com.kh.inheritance.animal;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		
	}
	
	@Override
	public void run() {
		System.out.println("주인이 와서 달린다");
	}
	

}

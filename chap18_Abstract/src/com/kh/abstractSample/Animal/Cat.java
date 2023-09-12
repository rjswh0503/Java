package com.kh.abstractSample.Animal;

public class Cat extends Animal {
	
	private String Cat;
	
	
	public Cat(String name) {
		super(name);
		this.Cat = name;
	}
	
	
	
	
	@Override
	public void makeSound() {
		System.out.println(" ╬ъ©к го╟М ©С╢о╢ы.");
	}
	
	
	
	

}

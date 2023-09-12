package com.kh.abstractSample.Animal;

public abstract class Animal {
	
	
	private String name;
	
	
	
	

	public Animal(String name) {
		this.name = name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}
	
	
	public abstract void makeSound();
	
	
	
	public void displayName() {
		System.out.println("동물이름 : " + name);
		
	}
		
	
	
	
	
	//추상메서드 동물소리출력 void makeSound()
	
	
	
	//일반메서드 동물이름출력 void displayName()
	
	

}

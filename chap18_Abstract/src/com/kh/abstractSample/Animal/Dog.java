package com.kh.abstractSample.Animal;

public class Dog extends Animal {
	
	
	
	private String Dog;
	
	
	
	public Dog(String name) {
		super(name);
		this.Dog = name;
	}
	
	
	
	@Override
		public void makeSound() {
		System.out.println(" ¸Û¸Û Áþ½À´Ï´Ù.");
	
	}
	
	
	
	//@Override
	

}

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
		System.out.println("�����̸� : " + name);
		
	}
		
	
	
	
	
	//�߻�޼��� �����Ҹ���� void makeSound()
	
	
	
	//�Ϲݸ޼��� �����̸���� void displayName()
	
	

}

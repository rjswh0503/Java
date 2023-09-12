package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		
		Dog dg = new Dog("������");
		dg.displayName();
		dg.makeSound();
		
		System.out.println("================");
		
		Cat ct = new Cat("�����");
		ct.displayName();
		ct.makeSound();
		
		
		System.out.println("=================");
		System.out.println();
	
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog("������");
		animal[1] = new Cat("�����");
		
		
		for(Animal a: animal) {
			a.displayName();
			a.makeSound();
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//1. cat �����
		// Cat ct = new Cat("�����")
		//2. ��ü�迭�� animal �����ؼ� ����ϱ�
		//animal[] animal = new Animal[2];
		
		
		
		

	}

}

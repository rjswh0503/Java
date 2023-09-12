package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		
		Dog dg = new Dog("강아지");
		dg.displayName();
		dg.makeSound();
		
		System.out.println("================");
		
		Cat ct = new Cat("고양이");
		ct.displayName();
		ct.makeSound();
		
		
		System.out.println("=================");
		System.out.println();
	
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog("강아지");
		animal[1] = new Cat("고양이");
		
		
		for(Animal a: animal) {
			a.displayName();
			a.makeSound();
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//1. cat 만들기
		// Cat ct = new Cat("고양이")
		//2. 객체배열로 animal 정의해서 출력하기
		//animal[] animal = new Animal[2];
		
		
		
		

	}

}

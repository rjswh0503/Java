package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.eat();
		myDog.speak();
		
		
		
		Cat myCat = new Cat("�����");
		myCat.info();
		myCat.run();
		myCat.eat();
		
		Rabbit myRabbit = new Rabbit("�䳢");
		myRabbit.info();
		myRabbit.jump();
		myRabbit.sleep();
		
		Lion myLion = new Lion("����");
		myLion.info();
		myLion.bite();
		myLion.sleep();
		
		Monkey myMonkey = new Monkey("������ ");
		myMonkey.info();
		myMonkey.up();
		myMonkey.sleep();
		
		

	}

}

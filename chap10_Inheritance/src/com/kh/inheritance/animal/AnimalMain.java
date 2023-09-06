package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("´ó´óÀÌ");
		myDog.info();
		myDog.eat();
		myDog.speak();
		
		
		
		Cat myCat = new Cat("°í¾çÀÌ");
		myCat.info();
		myCat.run();
		myCat.eat();
		
		Rabbit myRabbit = new Rabbit("Åä³¢");
		myRabbit.info();
		myRabbit.jump();
		myRabbit.sleep();
		
		Lion myLion = new Lion("»çÀÚ");
		myLion.info();
		myLion.bite();
		myLion.sleep();
		
		Monkey myMonkey = new Monkey("¿ø¼şÀÌ ");
		myMonkey.info();
		myMonkey.up();
		myMonkey.sleep();
		
		

	}

}

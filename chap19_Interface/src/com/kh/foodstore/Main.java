package com.kh.foodstore;

public class Main {

	public static void main(String[] args) {
							//클래스이기 떄문에 Order
		FoodStore order = new Order();
		order.addMenu("짬뽕주문");
		order.addMenu("짜장면주문");
		order.addMenu("굴짬뽕주문");
		order.printMenu();
		
		System.out.println();
		
		FoodStore order2 = new Order2();
		order2.addMenu("밥 주문");
		order2.addMenu("국 주문");
		order2.addMenu("반찬 주문");
		order2.printMenu();

	}

}

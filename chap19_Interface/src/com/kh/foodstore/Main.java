package com.kh.foodstore;

public class Main {

	public static void main(String[] args) {
							//Ŭ�����̱� ������ Order
		FoodStore order = new Order();
		order.addMenu("«���ֹ�");
		order.addMenu("¥����ֹ�");
		order.addMenu("��«���ֹ�");
		order.printMenu();
		
		System.out.println();
		
		FoodStore order2 = new Order2();
		order2.addMenu("�� �ֹ�");
		order2.addMenu("�� �ֹ�");
		order2.addMenu("���� �ֹ�");
		order2.printMenu();

	}

}

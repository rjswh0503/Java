package com.kh.foodstore;

import java.util.ArrayList;
import java.util.List;

public class Order2 implements FoodStore {
	
	private List<Menu> OrderMenu;
	
	
	public Order2() {
		OrderMenu = new ArrayList<>();
		
		
	}


	@Override			//�Ķ����
	public void addMenu(String menu) {
		Menu menuB = new Menu(menu);
		OrderMenu.add(menuB);
		
	}


	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
		
	}


	@Override
	public void printMenu() {
		System.out.println("=== �ֹ� ���� 2 ===");
		for(Menu menuB:OrderMenu) {
			System.out.println(menuB.getItem());
		}
		
		
		
	}
	
	
	

}

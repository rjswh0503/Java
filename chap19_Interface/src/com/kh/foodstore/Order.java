package com.kh.foodstore;

import java.util.ArrayList;
import java.util.List;

//�ֹ� ��ü2 ��� ���� ���� 

public class Order implements FoodStore {
	private List<Menu> OrderMenu;
	
	
	public Order() {
		OrderMenu = new ArrayList<>(); //�ֹ��� �����
		
		
		
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenu.add(menuA);
		
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("=== �ֹ� ����1 ===");
		for(Menu menuA:OrderMenu) {
			System.out.println(menuA.getItem());
		}
		//OrderMenu
		
	}
	
	

}

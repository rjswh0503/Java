package com.kh.foodstore;

import java.util.ArrayList;
import java.util.List;

//주문 객체2 출력 문구 변경 

public class Order implements FoodStore {
	private List<Menu> OrderMenu;
	
	
	public Order() {
		OrderMenu = new ArrayList<>(); //주문한 내용들
		
		
		
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
		System.out.println("=== 주문 내역1 ===");
		for(Menu menuA:OrderMenu) {
			System.out.println(menuA.getItem());
		}
		//OrderMenu
		
	}
	
	

}

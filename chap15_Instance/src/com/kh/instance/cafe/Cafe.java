package com.kh.instance.cafe;

public class Cafe {
	private String type; //음료종류
	private int size; 	//음료 사이즈
	private boolean isSugar; //설탕여부
	

	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void Coffe() {
		System.out.println("커피 종류 : "+ type);
		System.out.println("크기 : "+ size);
		
		if(isSugar) {
			System.out.println("설탕을 추가합니다.");
		}
		
	
		
		
	}
}


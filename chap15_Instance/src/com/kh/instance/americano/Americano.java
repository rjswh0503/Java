package com.kh.instance.americano;
//기본 아메리카노 
public class Americano {
	private int size; // 아메리카노 사이즈
	private boolean hasSugar; // 설탕여부
	
	
	public Americano(int size,boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("아메리카노를 만듭니다.");
		System.out.println("크기 : " + size);
		//만약에 설탕을 넣는다면
		if(hasSugar) {//true
			System.out.println("설탕을 추가합니다.");
			
		}
	
	}

}

package com.kh.example.practice5.model.vo;

public class Produck {
	
	private String pNum;
	private int price;      // private 같은 클래스 안에서만 사용 가능 
	private String brand;
	
	
	public Produck(String pNum, int price, String brand) {
		this.pNum = pNum;
		this.price = price;
		this.brand = brand;
		
		
	
		
	}
	
	public void information() {
		System.out.println("상품이름 : " + pNum);
		System.out.println("가격 : " + price);
		System.out.println("브랜드 : " + brand);
		
		
		
		
		
	}
	
	
	
	
	
		
	
	
	
	
		
		
		
		
	
	}
	
	
	
	
	
	
	
	

	


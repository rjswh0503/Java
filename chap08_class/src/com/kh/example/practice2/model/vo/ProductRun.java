package com.kh.example.practice2.model.vo;

public class ProductRun {

	public static void main(String[] args) {
		//Product 생성 3개 하고 
		//각각 상품명 가격 브랜드명 출력하기 
	
	// public Product(String pName, int price, String brand) {
		Product sk = new Product(" 과자",2000,"롯데");
		Product sk2 = new Product(" 아이스크림", 1000, "해태");
		Product sk3 = new Product(" 껌", 500, "노브랜드");
		
		
		
		
		sk.information();
		sk2.information();
		sk3.information();
		
		
		
		
		System.out.println("Product 정보 : ");
		                                   
		
		
		

	}

}

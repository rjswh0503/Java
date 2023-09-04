package com.kh.example.practice2.model.vo;

/*
  com.kh.example.practice2.model.vo;
 	Product
 	
 */

public class Product {
	

 	//1. 맴버변수 생성
  	//pName :String, price : int, brand :String
  	
  	String pName;
  	int price;
  	String brand;
  	
  //==========================================
  	
  	//2. 생성자 this를 활용해서 만들어야 함
  	//+ Product()
  	public Product(String pName, int price, String brand) {
  		this.pName = pName;
  		this.price = price;
  		this.brand = brand;
  	}
  	
  	//3. 정보 출력 메소드 만들기
  	//+ information(): void
  	
  	public void information() {
  		//Sysout + ctrl + space = 자동완성
  		
  		System.out.println("상품명 :" + pName);
  		System.out.println("가격 : " + price + "원");
  		System.out.println("브랜드 : " + brand);
  	}
  	
  	
 
 

}

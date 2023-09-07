package com.kh.example.practice6.model.vo;

public class Snack {
	
	private String  kind;  //종류
	private String  name;  //이름
	private	String flavor; //맛
	private int numOf;    //개수
	private int price;   //가격
	
	
	
	
	public void Snack() {
		
		
	}
	
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	public String getKind() {
		return kind;
	}


	


	public String getName() {
		return name;
	}


	


	public String getFlavor() {
		return flavor;
	}


	


	public int getNumOf() {
		return numOf;
	}


	


	public int getPrice() {
		return price;
	}


	


	
	public void information() {
		System.out.println("종류 : " +kind);
		System.out.println("이름 : " +name);
		
		
		
		
	}
	
	
	
	
	
		
}
	
	
	
	
	
	
	



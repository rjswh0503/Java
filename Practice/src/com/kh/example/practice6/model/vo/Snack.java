package com.kh.example.practice6.model.vo;

public class Snack {
	
	private String  kind;  //����
	private String  name;  //�̸�
	private	String flavor; //��
	private int numOf;    //����
	private int price;   //����
	
	
	
	
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
		System.out.println("���� : " +kind);
		System.out.println("�̸� : " +name);
		
		
		
		
	}
	
	
	
	
	
		
}
	
	
	
	
	
	
	



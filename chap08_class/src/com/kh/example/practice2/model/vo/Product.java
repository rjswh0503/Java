package com.kh.example.practice2.model.vo;

/*
  com.kh.example.practice2.model.vo;
 	Product
 	
 */

public class Product {
	

 	//1. �ɹ����� ����
  	//pName :String, price : int, brand :String
  	
  	String pName;
  	int price;
  	String brand;
  	
  //==========================================
  	
  	//2. ������ this�� Ȱ���ؼ� ������ ��
  	//+ Product()
  	public Product(String pName, int price, String brand) {
  		this.pName = pName;
  		this.price = price;
  		this.brand = brand;
  	}
  	
  	//3. ���� ��� �޼ҵ� �����
  	//+ information(): void
  	
  	public void information() {
  		//Sysout + ctrl + space = �ڵ��ϼ�
  		
  		System.out.println("��ǰ�� :" + pName);
  		System.out.println("���� : " + price + "��");
  		System.out.println("�귣�� : " + brand);
  	}
  	
  	
 
 

}

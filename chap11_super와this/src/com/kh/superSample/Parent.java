package com.kh.superSample;
//��ӹ޾Ƽ� super() super. ������
	/*
	  super = �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
	  super() = �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ��� 
	  			���� Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ�� �Ǿ�� �Ѵ�.  
	  */
	
  //�θ� Ŭ����
public class Parent {
	String name;
	
	
	
	Parent(){
		System.out.println("�θ� Ŭ������ �⺻ ������ �Դϴ�.");
		
		
	}
	
	Parent(String name){
		this.name = name;
		System.out.println("�θ� Ŭ������ ���ڿ� �Ķ���� ������ �Դϴ�. ");
		System.out.println("�̸� : " +name);
	}
	
	public void show() {
		System.out.println("�θ� Ŭ������ show �޼��� �Դϴ�.");
	}
	
}

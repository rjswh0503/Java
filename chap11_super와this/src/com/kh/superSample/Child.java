package com.kh.superSample;

// 			  �ڽ��� ��ӹ޴´� �θ�

public class Child extends Parent {				// �ڽ� Ŭ���� 
	
	
	//Child()  ���������ڰ� default�� ����� ���� �� public�̶� ������ �Ȱ���
	
	Child() {
		super();// �θ�Ŭ������ �⺻ �����ڸ� ȣ�� 
		System.out.println("�ڽ� Ŭ������ �⺻ �������Դϴ�.");
		
	}
	
	public Child(String name) {
		super(name); // �θ� Ŭ������ ���ڿ� �Ķ���� ������ ȣ��
		System.out.println("�ڽ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�.");
		
	}
	
	public void display() {
		super.show(); //�θ� Ŭ������ show ��� �޼��� ȣ��
		System.out.println("�ڽ� Ŭ������ display �޼��� �Դϴ�.");
	}
	
	
	
	
	
}

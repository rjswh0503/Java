package com.kh.instance.cafe;

public class Cafe {
	private String type; //��������
	private int size; 	//���� ������
	private boolean isSugar; //��������
	

	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void Coffe() {
		System.out.println("Ŀ�� ���� : "+ type);
		System.out.println("ũ�� : "+ size);
		
		if(isSugar) {
			System.out.println("������ �߰��մϴ�.");
		}
		
	
		
		
	}
}


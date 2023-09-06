package com.kh.inheritance.animal;

public class Animal { //���� Ŭ���� ����
	private String name;
	
	
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	
	public void setName() {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	
	public void info() {
		System.out.println("�̸� :" + name);
	}
	
	
	//animal�� ���� �ִ� eat�� ����� �ȿ����� �ٽ� ���Ǹ� ������.
	public void eat() {
		System.out.println(name + " ���̸� �Խ��ϴ�.");
		
	}
	
	public void sleep() {
		System.out.println(name + " ��(��) ���� ��ϴ�.");
		
	}
	
	
	public void run() {
		System.out.println(name + "������ �ͼ� �޸���");
	}
	
	public void up() {
		System.out.println("���� ���� �ö󰬴�.");
	}
	
	public void jump() {
		System.out.println("������ ���� �����Ѵ�");
	}
	
	public void bite() {
		System.out.println("������ ���� �������ϴ�.");
	}

}

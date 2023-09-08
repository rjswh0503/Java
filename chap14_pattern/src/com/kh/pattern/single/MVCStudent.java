package com.kh.pattern.single;

public class MVCStudent {
	
	
	//1.model
	
	private String name;
	private int age;
	
	public MVCStudent(String name,int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}
	
	
	//2. ��Ʈ�ѷ�
	
	public class SController{
		private MVCStudent model;
		private MVCStudent view;
	
		public SController() {
			this.model = model;
			this.view = view;
			
		}
		
		public void UpdateView() {
			view.printInfo();
		}
			
			
	}
	
	
	
	
	
	

	//3. view
	public void printInfo() {
		System.out.println("�л����� ����");
	}
	
	
	//etc, Client
	public static void main(String[] args) {
		
		
		
		
		 

	}

}

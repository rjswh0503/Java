package com.kh.classSample;

public class Car {
	//1. ���� �ʵ� �ɹ�����
	String brand;        //�귣��    
	String model;    	 // ��           // �ɹ� ���� 
	int speed;    	     // �ӵ�
	boolean engineOn;    // ���� ����
	
	
// =======================================================================
//  �ɹ����� �ؿ��� ��� �޼���� ����
	
	
	
	
	//2. �����ڴ� �޼����� �Ѱ��� ����
	public Car(String brand, String model) { // ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� �� 
		
		
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
		System.out.println("Car ����");
	}
	
	
	
	
	
	

	


	//���� ���� �޼���
	public void startEngine() { //
		//���࿡ ������ true�� ���� �õ�
		
		if(engineOn) {
			System.out.println("������ �õ��մϴ�."); //��� �޼ҵ� �ۼ�
			
		}else {// ���࿡ ������ false�� �̹� ���� �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
		
		
	}
	
	//���� �޼���
		public void acclerate(int amount) {
			if(engineOn) {
				//������ true�� ���� �ӵ��� �󸶴�.	
				System.out.println("�ӵ� ���Դϴ�.");
			}else {
				System.out.println("�ӵ��� �� �� ����.");
				// ������ false�� ������ ���� �־� �ӵ��� �� �� ����		
				
			}
		}

}

package com.kh.classCircle;

public class Circle {
	//�ɹ����� 
	private final double PI = 3.14; // ��� 
	private int redius = 1; // ���� 
	
	
	//������
	public Circle() {
			//�⺻ ������
		
	}
	//�޼��忡�� 
	//�������� ���� ���
	public void inRadius() {
		redius++;
		//������ ���� ������ų ���� ������ �� �ִ�
	}
	public void AreaCircle() {
	
		
		//���� ���̸� ����ϰ� ����ϴ� �޼�
		double area = PI * redius * redius;
		System.out.println("���� ���� : " + area);
		
		
	}
	public void SizeOfCircle() {
		System.out.println();
		
		
		
	}
	

}

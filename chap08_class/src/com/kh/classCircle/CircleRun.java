package com.kh.classCircle;

public class CircleRun {

	public static void main(String[] args) {
		//�⺻������ ��ü ����!
		Circle circle = new Circle();
		
		
		//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ���
		System.out.println("�ʱ⿡ ���� ������ �˰�ʹ�.");
		
		circle.AreaCircle();
		circle.SizeOfCircle();
		
		//�������� 1�� ������Ų��.
		circle.inRadius();
		
		//���� �ѷʿ� ���̰� ������ 1�� ������ ���� ��� ����ϱ�
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaCircle();
		circle.SizeOfCircle();

	}

}

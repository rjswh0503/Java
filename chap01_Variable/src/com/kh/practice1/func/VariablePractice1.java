package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, mg;
		
		int age = 30;
		double height = 177.5;
		System.out.print("�̸��� �Է��ϼ���. : " );
		name = sc.next();
		System.out.print("������ �Է��ϼ���. : " );
		mg = sc.next();
		System.out.print("���̸� �Է��ϼ��� : " );
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		height = sc.nextDouble();
		System.out.println("Ű" + height + "��" + age + "�� ����" + name +"�� �ݰ����ϴ�.");
		
	}

}

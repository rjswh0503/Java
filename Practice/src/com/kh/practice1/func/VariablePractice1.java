package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���. :");
		String name = sc.next();
		System.out.print("������ �Է��ϼ���  (�� / ��) : ");
		String gd = sc.next();
		
		System.out.print("���̸� �Է��ϼ���. :");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է����ּ���. :");
		double height = sc.nextDouble();
		System.out.println("Ű : " + height + "�� " + age + " �� " + gd + "��" + name + "�� �ݰ����ϴ�.");
	}

}

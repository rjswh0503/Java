package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intNum1 = 23;
		int intNum2 = 7;
		System.out.print("ù ��° ���� : ");
		intNum1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		intNum2 = sc.nextInt();
		System.out.println("���ϱ� ��� : " + (intNum1 + intNum2) );
		System.out.println("���� ��� : " + (intNum1 - intNum2) );
		System.out.println("���ϱ� ��� : " + (intNum1 * intNum2) );
		System.out.println("������ ��� : " + (intNum1 / intNum2) );
		
	}

}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1 = 23;
		int iNum2 = 7;
		System.out.print("ù ��° ���� : ");
		iNum1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		iNum2 = sc.nextInt();
		System.out.println("�� �ϱ� ��� : " + (iNum1 + iNum2));
		System.out.println("���� ��� : " + (iNum1 - iNum2));
		System.out.println(" �� �ϱ� ��� :" + (iNum1 * iNum2));
		System.out.println("������ ��� : " + (iNum1 / iNum2));
		System.out.println("������ ��� : " + (iNum1 % iNum2));
		
    }
	
}

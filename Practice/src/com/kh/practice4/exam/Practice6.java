package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice6 {
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		//����ڷκ��� �� ���� ���� �Է� �޾�
		System.out.print("ù ��° ���ڸ� �Է����ּ���. :");
		int fristNumber = sc.nextInt();
		
		
		System.out.print("�� ���� ���ڸ� �Է����ּ��� : ");
		int secondNumber = sc.nextInt();
		//start���� �� �� ��������� �� �������� ����.
		int start = Math.min(fristNumber, secondNumber);
		//end���� �� �� ��������� �� ū ���� ����.
		int end = Math.max(fristNumber, secondNumber);
	
		/*
		int reStart = end; // end�� start���� ���� �� restart�� �־��ش�.
		int reEnd = start; // start�� end���� ���� �� reend�� �־��ش�. 
		
		System.out.println(start + "����" + end +"���� ����");
		if(start < end) {
			for(int i = start; i <= end; i++) {
				System.out.println(i);
		}

		
	}else if(reEnd < reStart) {
		for (int i = reStart; i <= reEnd; i++) {
			System.out.println(i);
			}
		*/
		//Math �ڹٿ� �ִ� ���� Ŭ����
		//min (���� ���� ��) �־��� �ΰ��� ���� �߿��� �� ���� ���� ��ȯ
		//max (���� ū ��) �־��� �ΰ��� ���� �߿��� �� ū ���� ��ȯ
		int a = 5;
		int b = 8;
		int minValue = Math.min(a, b); //minValue�� 5�� �����
		System.out.println(minValue);
		int maxValue = Math.max(a, b); //maxValue�� 8�� �����
		System.out.println(maxValue);
		
		
		
		
		
		
	}
		
}






package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		double ko = sc.nextDouble();
		System.out.print("�������� : ");
		double en = sc.nextDouble();
		System.out.print("�������� : ");
		double math = sc.nextDouble();
		
		int averageScore = (int)(ko + en + math);
		int totalScore = (averageScore / 3);
		System.out.println("�������� = " + ko +"   �������� = "+ en + "    �������� = " + math + "  ���� = " +averageScore+ "    ������� = " + totalScore  );
		
		

	}

}

package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		double ko = sc.nextDouble();
		System.out.print("영어점수 : ");
		double en = sc.nextDouble();
		System.out.print("수학점수 : ");
		double math = sc.nextDouble();
		
		int averageScore = (int)(ko + en + math);
		int totalScore = (averageScore / 3);
		System.out.println("국어점수 = " + ko +"   영어점수 = "+ en + "    수학점수 = " + math + "  총점 = " +averageScore+ "    평균점수 = " + totalScore  );
		
		

	}

}

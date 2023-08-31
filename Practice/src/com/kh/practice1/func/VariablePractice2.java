package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1 = 23;
		int iNum2 = 7;
		System.out.print("첫 번째 정수 : ");
		iNum1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		iNum2 = sc.nextInt();
		System.out.println("더 하기 결과 : " + (iNum1 + iNum2));
		System.out.println("빼기 결과 : " + (iNum1 - iNum2));
		System.out.println(" 곱 하기 결과 :" + (iNum1 * iNum2));
		System.out.println("나누기 결과 : " + (iNum1 / iNum2));
		System.out.println("나머지 결과 : " + (iNum1 % iNum2));
		
    }
	
}

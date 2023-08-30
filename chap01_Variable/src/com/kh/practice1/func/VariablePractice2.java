package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intNum1 = 23;
		int intNum2 = 7;
		System.out.print("첫 번째 정수 : ");
		intNum1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		intNum2 = sc.nextInt();
		System.out.println("더하기 결과 : " + (intNum1 + intNum2) );
		System.out.println("빼기 결과 : " + (intNum1 - intNum2) );
		System.out.println("곱하기 결과 : " + (intNum1 * intNum2) );
		System.out.println("나누기 결과 : " + (intNum1 / intNum2) );
		
	}

}

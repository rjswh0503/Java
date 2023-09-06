package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator {

	public static void main(String[] args) {
		/*Scanner 이용해서 코드 변경하기*/
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력하세요 : ");
		int num2 = sc.nextInt();
	
		
		
		
		
		
		/*
		Calculator cal = new Calculator();
		int result1 = cal.add();
		int result2 = cal.substruck();
		int result3 = cal.multiplay();
		int result4 = cal.divide();
		System.out.println("더하기 : " + result1);
		System.out.println("빼기 : " + result2);
		System.out.println("곱하기 : " + result3);
		System.out.println("나누기 : " + result4);
		*/
		
	}

}

package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	public static void main(String[] args) {
		
	//정수 두 개를 입력받아, 두 수의 합, 차, 곱, 나누기 한 몫과 나머지 출력
		
		int iNum1 = 30;
		int iNum2 = 3;
		Scanner sc = new Scanner(System.in);
		
		int iNum4, iNum5;
		System.out.println("정수를 입력하세요 : ");
		iNum4 = sc.nextInt();
		System.out.println("또 다른 정수를 입력하세요 : ");
		iNum5 = sc.nextInt();
		System.out.println(iNum4 - iNum5);
		
		
		
	 
	}

}

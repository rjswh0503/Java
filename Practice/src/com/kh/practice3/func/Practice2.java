package com.kh.practice3.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.print("짝수입니다.");
			}else
				System.out.print("홀수입니다.");
		 
		}else
		  System.out.println("양수만 입력해주세요.");
	
		
		

	}

}

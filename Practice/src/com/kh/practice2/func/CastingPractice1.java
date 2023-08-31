package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : "  );
		char inputChar = sc.next().charAt(0);
		
		int ChangeChar = inputChar;
		System.out.println("입력문자  :" + inputChar + " 유니코드 : " +ChangeChar);
		
	}

}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. :");
		String name = sc.next();
		System.out.print("성별을 입력하세요  (남 / 여) : ");
		String gd = sc.next();
		
		System.out.print("나이를 입력하세요. :");
		int age = sc.nextInt();
		System.out.print("키를 입력해주세요. :");
		double height = sc.nextDouble();
		System.out.println("키 : " + height + "인 " + age + " 살 " + gd + "자" + name + "님 반갑습니다.");
	}

}

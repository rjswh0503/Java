package com.kh.practice3.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.print("¦���Դϴ�.");
			}else
				System.out.print("Ȧ���Դϴ�.");
		 
		}else
		  System.out.println("����� �Է����ּ���.");
	
		
		

	}

}

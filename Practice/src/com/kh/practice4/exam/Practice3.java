package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}else {
			System.out.println("");
			
			for(int i =num ;i >= 1; i--) {
				System.out.println(i);
				
			}
			
		}
		


	       
	}
	
	
}
		
		

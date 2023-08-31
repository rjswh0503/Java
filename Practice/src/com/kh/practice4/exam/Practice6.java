package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
				
		}else { // 1 이상의 숫자0
			for(int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		}
			
		
		
		
		

	}

}

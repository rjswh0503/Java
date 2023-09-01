package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= 8; i++) {
				System.out.println(i +"");
				
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
		

	}

}

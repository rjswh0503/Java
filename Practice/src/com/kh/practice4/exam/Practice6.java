package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice6 {
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 두 개의 값을 입력 받아
		System.out.print("첫 번째 숫자를 입력해주세요. :");
		int fristNumber = sc.nextInt();
		
		
		System.out.print("두 번쨰 숫자를 입력해주세요 : ");
		int secondNumber = sc.nextInt();
		//start에는 둘 중 상대적으로 더 작은값에 들어간다.
		int start = Math.min(fristNumber, secondNumber);
		//end에는 둘 중 상대적으로 더 큰 값에 들어간다.
		int end = Math.max(fristNumber, secondNumber);
	
		/*
		int reStart = end; // end가 start보다 작을 때 restart로 넣어준다.
		int reEnd = start; // start가 end보다 작을 때 reend로 넣어준다. 
		
		System.out.println(start + "부터" + end +"까지 숫자");
		if(start < end) {
			for(int i = start; i <= end; i++) {
				System.out.println(i);
		}

		
	}else if(reEnd < reStart) {
		for (int i = reStart; i <= reEnd; i++) {
			System.out.println(i);
			}
		*/
		//Math 자바에 있는 내장 클래스
		//min (가장 작은 값) 주어진 두개의 숫자 중에서 더 작은 값을 반환
		//max (가장 큰 값) 주어진 두개의 숫자 중에서 더 큰 값을 반환
		int a = 5;
		int b = 8;
		int minValue = Math.min(a, b); //minValue는 5가 저장됨
		System.out.println(minValue);
		int maxValue = Math.max(a, b); //maxValue는 8이 저장됨
		System.out.println(maxValue);
		
		
		
		
		
		
	}
		
}






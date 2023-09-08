package com.kh.practice.ArrayList;

import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요.");
		
		
		
		
		int[] numbers = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("정수 " +(i) + " : ");
			numbers[i] = sc.nextInt();
			//ArrayList 경우 colors.get(0)
			//배열은[]안에 넣음
			
			//조건이 최종까지 더 하는 것이기 때문에 항샹된 for문 사용
			//또는 기본 for문을 사용하고 싶다면 length 이용해서 출력 가능

			
		}
		
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		
			
		}
		//향상된 결고 ㅏ출력
		System.out.println("배열의 모든 요소를 더한 결과 : " + sum);
		
		
		
		
		

	}

}

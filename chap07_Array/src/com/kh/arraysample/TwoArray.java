package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		
		String[][] fruits = {
				{"Apple","Banana","Cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi", "Mango","PineApple"}
				
		};
		System.out.println("fruits.length : " + fruits.length);
		System.out.println("fruits.length : " + fruits[0].length);	
		for(int i = 0; i < fruits.length; i++) {
			System.out.println("첫 번째 포문 : " + i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
				System.out.println("두 번째 포문 : " + a);
			}
			System.out.println(); //다음행으로 이동할 수 있게 enter로 출력 매소드 입력
		}

	}

}

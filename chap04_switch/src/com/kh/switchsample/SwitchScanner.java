package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
			
		
		/*
		System.out.println("과일을 선택해주세요.");
		
		int fruit = sc.nextInt();
		switch(fruit) {
			case 1:
				System.out.println("사과");
				break;
			case 2:
				System.out.println("포도");
				break;
			default :
				System.out.println("잘못된 선택입니다.");
		}
		
		*/
		
		
		/*
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.println("1, 아이스 아메리카노");
		System.out.println("2, 얼그레이 티");
		System.out.println("3, 핫 초코");
		System.out.println("4, 카페 라때");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("아이스 아메리카노 주문하셨습니다.");
			break;
		case 2:
			System.out.println("얼그레이 티 주문하셨습니다.");
			break;
		case 3:
			System.out.println("핫 초코  주문하셨습니다.");
			break;
		case 4:
			System.out.println("카페 라때 주문하셨습니다.");
			break;
		default :
			System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
		*/
		
		
		//sacnner 를 이용해서 과자를 선택하는 switch 를 하나 만들어주세요.
		
		
		
		
		
		
		
		/*
		System.out.println("과자를  선택해주세요.");
		System.out.println("1, 칸쵸");
		System.out.println("2, 스윙칩");
		System.out.println("3, 포카칩");
		
		int sk = sc.nextInt();
		
 
		switch(sk) {
			case 1:
				System.out.println("칸쵸을 선택했습니다.");
				break;
			case 2:
				System.out.println("스윙칩을 선택하셨습니다.");
				break;
			case 3:
				System.out.println("포카칩을 선택하셨습니다.");
				break;
			default :
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				
				*/
				
				System.out.println("영화를 선택해 주세요.");
				System.out.println("1.어벤져스 인피니티워");
				System.out.println("2.어벤져스 앤드게임");
				System.out.println("3.어벤져스 에이지오브 울트론");
				
				int movie = sc.nextInt();
				
				switch(movie) {
					case 1:
						System.out.println("어벤져스 인피니티워 선택했습니다.");
						break;
					case 2:
						System.out.println("어벤져스 앤드게임 선택하셨습니다.");
						break;
					case 3:
						System.out.println("어벤져스 에이지오브 울트론 선택하셨습니다.");
						break;
					default :
						System.out.println("잘못 된 선택입니다. 다시 선택해주세요.");
						
						
				}
				
				
				
				
				
				
			
		}
		

	}



package com.kh.exceptionSample;

import java.util.Scanner;

/*
	 Throw
	  	예외를 발생시키는 키워드
	  	프로그램 실행 중 예치지 않은 상황이 발생됐을 때 사용
	  	예외를 발생시키면 예외 처리가 시작되고 프로그램은 해당 예외를 적절히 처리하거나 상위 호출 스택 예외를 전파
	  	
	  	user 숫자를 입력해야함
	  	양수만 입력해야하는데 음수를 입력함
	  	음수인 경우 예외를 발생시키는 간단한 예제
	  
	 * */
public class ThrowMain {	
	
	public static void main(String[] args) {
		try {
			
			int number = getNumber(); //숫자를 가지고 옴
			if(number < 0) {
				throw new NegativeNumberException("음수는 허용이 되지 않습니다.");
				//없애버림
			}
			
			System.out.println("입력한 숫자 : " + number);
		}catch(NegativeNumberException e) {
			System.out.println("예외 발생!!!" + e.getMessage());
			
			
		}
		
		
		
		
		
		
	}
	public static int getNumber() {//사용자로부터 숫자를 입력받는 메서드
		//여기에서 음수를 입력하면 예외가 발생할 것!
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. : ");
		int number = sc.nextInt();
		return number;
	}
}




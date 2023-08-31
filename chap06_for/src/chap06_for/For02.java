package chap06_for;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		//구구단
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("첫번째 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요. : ");
		int num2 = sc.nextInt();
		
		
		int result = 0; // 최초 값을 0으로 줍니다.
		for (int i = 0; i < num2; i++) { // for 루프를 사용해서 i 변수를 0부터 num2미만까지 반복
			      						// 이 루프는 두번째 숫자인 num2 만큼 반복
			result += num1;
			//result 변수에 num1 값을 더함
			//num2 만큼 num1을 더하는 효과를 줌 
			System.out.println("안 = "+ num1 + " * " + num2 + " = " + result);
		}
		System.out.println(num1 + " * " + num2 + " = " + result);
		//계산된 결과를 출력 입력받은 두 숫자와 결과 값을 문자열로 결합해서 출력
		
		

	}
	
	*/
		System.out.print("첫번째 숫자를 입력하세요. : ");
		                  //(2)
		int num3 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요. : ");
		                   //(4)
		int num4 = sc.nextInt();
		
		int result = 0;    //(4)
		for(int i  = 1; i <= num4; i++) {
			
			
			result += num3;
			
			System.out.println( num3 + " * " + i + " = " + result);
		
		}
		 		
		
		

	
	
	
	}
	
	
	

}

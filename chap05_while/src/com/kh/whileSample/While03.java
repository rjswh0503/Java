package com.kh.whileSample;

public class While03 {

	public static void main(String[] args) {
		
		//반복적으로 출력 
		
		//int i = 1;
		/*i가 1부터 10까지 출력되게 하기*/
		//while (i <=10) { //i가 5보다 같거나 작을 때 true
			 //조건
			//숫자가 5일 때 출력을 멈추고 싶다
			//System.out.println(i);//위 부등호가 참일 경우 출력
			//i = ++i ; //i++ 무한 루프 끝나게 만들기 -> ++i
			
			/*
			 i++ 일때 i가 1인 값을 먼저 대입했기 떄문에 ++가 작동하지 않음
			 무한루프 발생
			 ++i 일때 i에 +1을 먼저 대입 했기 때문에 1~10까지 출력 가능
			 무한루프가 발생하지 않음 
			  
			  
			  
			 */
		
			int i = 1;
			while(i <= 30) {
				System.out.println(i);
				i = ++i ;
			
		
	
			
			
			
			
		}
		

	}

}

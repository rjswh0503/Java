package com.kh.operator;

public class Logical {

	public static void main(String[] args) {
		//5. 논리연산자 (Logical)
		/*
		 논리 연산자는 논리적인 조건을 다룰 때 사용한다.
		 &&(논리 AND), ||(논리 OR), !(논리 NOT)
		 
		 &&(논리곱) 두 항이 모두 참인 경우 참, 아니면 거짓
		       ex) boolean val = (5 > 2) && (5 > 3);
		       
		 ||(논리합) 두 항 중 하나의 항이라도 참이면 참 
		       ex) boolean val = (5 > 2) || (5 < 3); //true
		       
		 !(부정) 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꾼다.
		       ex) boolean val = ! (5 > 2); //false		            
		  
		  
		 
		  */
		
		boolean isTrue = true;
		boolean isFalse = false;
		//1. &&(논리 AND)
		boolean logicalAnd = isTrue && isFalse;
		System.out.println("&& : " + logicalAnd);
		boolean val1 = 5 > 2 && 5 > 3;
		System.out.println(val1);
		
		int a = 10;
		int b = 5;
		int c = 3;
		
		boolean val2 = a > b && a > c;
		System.out.println(val2);
		
		boolean val3 = a > b && a < c;
		System.out.println(val3);
		
	 // 2. ||(논리합)
		boolean val4 = 5 > 2 || 5 < 3;
		System.out.println("|| : " + val4);
		
		int d = 20;
		int e = 10;
		int f = 5;
		
		boolean val5 = d > e || d < f;
		System.out.println(val5);
		boolean val6 = d < e || d < f;
		System.out.println("val6 : " + val6);
		
		
	// 3. !(부정)
		boolean val7 = !(5 > 2); //false 
		System.out.println("val7 : " + val7);
		
		int g = 100;
		int h = 200;
		int i = 100;
		boolean val8 = !(g > h);
		System.out.println(val8);
		boolean val9 = !(g > i);
		System.out.println(val9);
		
	
		
		
		

	}

}

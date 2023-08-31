package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String s = sc.next(); // 
		
		char a = s.charAt(0);
		System.out.println("index 0번째 자리 : " + a);
		
		char p = s.charAt(1);
	    System.out.println("index 1번째 자리 : " + p );
	    
	    String p2 = s.substring(2,3);
	    System.out.println("index 2번째 자리 : " + p2 );
	    
	    char p3 = s.charAt(3);
	    System.out.println("index 3번째 자리 : " + p3 );
	    
	    char p4 = s.charAt(4);
	    System.out.println("index 4번째 자리 : " + p4);
	   
	    
	}

}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s = sc.next(); // 
		
		char a = s.charAt(0);
		System.out.println("index 0��° �ڸ� : " + a);
		
		char p = s.charAt(1);
	    System.out.println("index 1��° �ڸ� : " + p );
	    
	    String p2 = s.substring(2,3);
	    System.out.println("index 2��° �ڸ� : " + p2 );
	    
	    char p3 = s.charAt(3);
	    System.out.println("index 3��° �ڸ� : " + p3 );
	    
	    char p4 = s.charAt(4);
	    System.out.println("index 4��° �ڸ� : " + p4);
	   
	    
	}

}

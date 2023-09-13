package com.kh.objexam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		//practice1();
		PracticeMain practice = new PracticeMain();
		practice.practice1();
	
		
		
		

	}

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 문자열 입력 : ");
		String str = sc.next();
		System.out.print("두 번째 문자열 입력 : ");
		String str2 = sc.next();
		
		sc.close();
		
		
		
		int hashCode1 = str.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("첫 번째 문자열의 해시코드 : " + hashCode1);
		System.out.println("두 번째 문자열의 해시코드 : " + hashCode2);
		
		
		String objString = str.toString();
		String obj2String = str2.toString();
		System.out.println("첫 번째 문자열의 문자열 : " + objString);
		System.out.println("두 번째 문자열의 문자열 : " + obj2String);
		
		
		
		
		
		
		
	}

	

		

		
		
		
		
	}



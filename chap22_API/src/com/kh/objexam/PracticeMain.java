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
		
		
		System.out.print("ù ��° ���ڿ� �Է� : ");
		String str = sc.next();
		System.out.print("�� ��° ���ڿ� �Է� : ");
		String str2 = sc.next();
		
		sc.close();
		
		
		
		int hashCode1 = str.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("ù ��° ���ڿ��� �ؽ��ڵ� : " + hashCode1);
		System.out.println("�� ��° ���ڿ��� �ؽ��ڵ� : " + hashCode2);
		
		
		String objString = str.toString();
		String obj2String = str2.toString();
		System.out.println("ù ��° ���ڿ��� ���ڿ� : " + objString);
		System.out.println("�� ��° ���ڿ��� ���ڿ� : " + obj2String);
		
		
		
		
		
		
		
	}

	

		

		
		
		
		
	}



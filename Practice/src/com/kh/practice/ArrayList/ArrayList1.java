package com.kh.practice.ArrayList;

import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ��� .");
		
		
		int[] numbers = new int[5];
		for(int i = 0; i < 5;i++) {
			System.out.print("���� " + (i) + " : ");
			numbers[i] = sc.nextInt();
			
		}
		
		
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		
		
		
		
		System.out.println("���� : " + sum);
		
		
		
		
	
		
		
		}
	}
		
		

package com.kh.practice.ArrayList;

import java.util.Scanner;

public class ArrayList3 {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);



	        System.out.print("���� 5�� :  ");
	        int num = sc.nextInt();
	        


	       int[] numbers = new int[5];



	        int sum = 0;

	        for(int number : numbers){
	                sum += number;



	        }
	        System.out.println("���� : " + sum);




	    }
	
	}



package com.kh.practice1.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ko, en, mt;

		System.out.print("±¹¾î : ");
		ko = sc.nextDouble();
		System.out.print("¿µ¾î : ");
		en = sc.nextDouble();
		System.out.print("¼öÇÐ : ");
		mt = sc.nextDouble();
		
		double doubleValue = ko;
		double doubleValue1 = en;
		double doubleValue2 = mt;
		int intPart = (int) doubleValue;
		int intPart1 = (int) doubleValue1;
		int intPart2 = (int) doubleValue2;

		
		System.out.println("ÃÑÁ¡ : "  + (intPart + intPart1 + intPart2));
		System.out.println("Æò±Õ : "  + (intPart + intPart1 + intPart2 ) / 3);
				
		
		
		
	
		
		
		
		

	}

}

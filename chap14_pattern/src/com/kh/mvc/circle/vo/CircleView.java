package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {
	
	public double getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		return sc.nextDouble(); 
	}
	
	public void displayResult(double result) {
		System.out.println("결과 : " + result);
	}

}

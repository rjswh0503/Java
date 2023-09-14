package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain ptm = new PracticeMain();
		ptm.ArithException();
		ptm.NPException();
		ptm.NumformatException();
	

	}
	public void ArithException() {
		//int dividend / divisor 나누었을 때 예외처리
		try {
			//indexOf subText 에 있는 null 값을 포함한 문자열 검색 
			int dividend = 100;
			int divisor = 0;
			
			int result = dividend / divisor;
			System.out.println("Result : " + result);
		}catch(ArithmeticException go1) {
			System.out.println("ArithmeticException : "+ go1.getMessage());
		}
		
		
		
		
	}
	
	public void NPException() {
		try {
			String text = "Hello World";
			String subText = null;
			int lenght = text.indexOf(subText);
		}catch(NullPointerException gg) {
			System.out.println("NullPointerException:  " + gg.getMessage() );
		}
		
		
		
	}
	
	public void NumformatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println("숫자 : " + number);
			
		}catch(NumberFormatException asd) {
			System.out.println("NumberFormatException :" + asd.getMessage());
		}
		
		
	}
	
	

}

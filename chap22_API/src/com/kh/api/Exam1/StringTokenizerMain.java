package com.kh.api.Exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	/*
	 StringTokenizer 클래스 :  문자열을 분리하는데 사용 
	 						주어진 구분자(기본:공백)을 기본으로 문자열을 토큰으로 분리 
	  
	 * */
	
	

	public static void main(String[] args) {
	
		StringTokenizerMain stm = new StringTokenizerMain();
		//stm.stExam1();
		//stm.stExam2();
		//stm.stExam3();
		//stm.stExam5();
		//stm.stExam6();
		stm.StringtoMath();
		
	}	
	
	public void stExam1() {
			String text = "apple banana grape orange";   
			StringTokenizer tokenizer1 = new StringTokenizer(text,",");
			
			while (tokenizer1.hasMoreElements()) {
				String fruit1 = tokenizer1.nextToken();
				System.out.println(fruit1);
			}
		
		
		System.out.println("===================");
	}
		
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer2 = new StringTokenizer(text,"");
		
		while (tokenizer2.hasMoreElements()) {
			String fruit2 = tokenizer2.nextToken();
			System.out.println(fruit2);
		}
		
		System.out.println("===================");
	}
	
	public void stExam3() {
		// 구분자를 사용해서 text를 만들고 - 구분자로 꾾어서 출력하기 
		String text = "apple-banana-grape-orange";
		StringTokenizer tokenizer3 = new StringTokenizer(text,"");
		
		while(tokenizer3.hasMoreElements()) {
			String fruit3 = tokenizer3.nextToken();
			System.out.println(fruit3);
		}
		
	}
	
	public void stExam5() {
		//특정 단어 제외하고 구분자로 분리
		String text = "This is a test.But not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
				System.out.println(word);
			}
		}
			
	}
	
	public void stExam6() {
		//날짜 구분자로 분리
		
		String Date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(Date, " - ");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println(year + "년 ");
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		
		
		
		
		
	}
	
	public void StringtoMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number : " + token );
			}
		}	
		
	
		
	}
	
	
}
	
	



package com.kh.api.Exam1;

public class WrapperMain {
	
	/*
	  Wrapper :  기본 데이터 유형을 객체로 래핑(wrap)
	  			객체로 작업할 때 유용
	  			클래스로는 Integer,Double,Boolean 등이 있음
	 * */
	public static void main(String[] args) {
		Integer num = 40;
		System.out.println("정수 값 : " + num);
		
		
		//Wrapper 클래스를 기본 데이터 유형으로 변환
		int intValue = num.intValue();
		System.out.println("기본 데이터 유형 값 : " + intValue);
		
		Double pi = 3.14159265359;
		
		//원의 넓이 계산
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("원의 넓이 : " + area);
		
		//문자열을 실수로 변환
		
		String numStr = "10.7";
		Double parsedDouble = Double.parseDouble(numStr);
		//parseDouble String 문자열 데이터를 정수, 소수로 변환하겠다
		System.out.println("문자열을 실수로 변환한 값 : " + parsedDouble);
		
		//Boolean Wrapper 클래스 만들기
		Boolean isJavaFun = true;
		
		//조건문 활용
		
		if(isJavaFun) {
			System.out.println("자바는 재밌습니다.");
			
		}else {
			System.out.println("자바는 힘들어요");
		}
		String boolStr = "true";
		Boolean parseBool = Boolean.parseBoolean(boolStr);
		System.out.println("문자열을 불리언으로 변환한 값 : " + parseBool);
		
		
		
		
	}

}

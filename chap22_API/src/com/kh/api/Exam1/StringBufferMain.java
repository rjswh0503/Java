package com.kh.api.Exam1;

public class StringBufferMain {
	
	/*
	 StringBuffer
	  	문자열을 효과적으로 다루기 위한 클래스 
	  	바뀌거나 바뀔 수 있는 문자열을 나타내고, 
	  	문자열이 변경이나 조작이 필요한 경우 사용
	 * */
	
	

	public static void main(String[] args) {
		//빈 StringBuffer 객체 생성
		StringBuffer sb = new StringBuffer();
		
		//문자열 추가
		sb.append("Hello, ");
		sb.append("Java  ");
		sb.append("StringBuffer");
		System.out.println(sb.toString());
		
		//문자열 삽입
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		//문자열 삭제
		sb.delete(13, 20);
		System.out.println(sb.toString());
		
		//문자열 뒤집기
		sb.reverse();
		System.out.println(sb.toString());
		
	}

}

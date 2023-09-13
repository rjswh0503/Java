package com.kh.api.Exam1;

public class StringMain {

	public static void main(String[] args) {
		String greeting = "Hello, World";
		
		
		//만약에 문자열이 같을 때 나올 문구 == equals
		if(greeting.equals("Hello, World")) {
			System.out.println("문자열이 같습니다.");
		}
		//문자를 연결
		String name = "Alice";
		String msg = " Hello, " + name +" ! ";
		System.out.println(msg);

	}

}

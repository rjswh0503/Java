package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		//정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intbook = new Book<>();
		intbook.put(42);
		intbook.put(15);
		int intvalue = intbook.get(); //형 변환 필요 없음
		
		
		
		//문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("python");
		strBook.put("c++");
		strBook.put("javaScript");
		
		String strValue = strBook.get();// 형 변환 필요 없음 
		
		
		System.out.println("Int value : "  + intvalue);
		System.out.println("String value : " + strValue);
	}
	
	
	
	

}

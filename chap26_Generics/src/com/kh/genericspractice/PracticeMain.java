package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain ptMain = new PracticeMain();
		//ptMain.practice1();
		ptMain.practice2();
		
		//Stirng integer T 사용하여 출력
		

	}
	
	public void practice1() {
		
		ArrayList<Integer> intList  = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("숫자1");
		strList.add("숫자2");
		strList.add("숫자3");
		
		printList(intList);
		printList(strList);
		
	}
	
	public static <T> void printList(ArrayList <T> list) {
		for(T item:list) {
			System.out.println(item);
		}
	}

	
	
	
	public void practice2() {
		Box<Integer> intbox = new Box<>();
		intbox.put(44);
		intbox.put(17);
		intbox.put(999);
		int intvalue = intbox.get();
		
		
		
		Box<String> Strbox = new Box<>();
		Strbox.put("Java");
		Strbox.put("JavaScript");
		Strbox.put("Database");
		Strbox.put("python");
		
		String strvalue = Strbox.get();
		
		
		System.out.println("Int value : " + intvalue);
		System.out.println("String value : " + strvalue);
		
		
		
		
		
		
		
		
		
		
		
		//box 객체를 com.kh.genericspractice; 밑에 생성
		//정수형 데이터를 지정하는 box 인스턴스 생성
		//문자열 데이터를 저장하는 box 인스턴스 생성
		//각 각 출력
		//향상된 for문  이용해서 값 모두 출력
		
	}
	
	
}

		

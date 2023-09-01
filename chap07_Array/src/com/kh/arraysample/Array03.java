package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		/*
		 
		 1.문자열을 입력 받아서 
		 2. 문자 하나 하나 배열에 넣고 
		 3. 검색할 문자 Scanner 
		 4. 문자열에 몇개 들어가 있는지 
		 5. 개수와 몇번째 인덱스에 위치하는지 
		 6. 인덱스 출력하기
		 
		 문자 하나 하나 배열에 넣는다.
		 String 안에 있는 문자들을 배열로 담는다.
		 char로 문자를 만들어서 만든 문자들을 배열에 넣는다.
		 String 안에 char 배열로 만들어주는 녀석 -> toCharArry
		 ex) String 안녕하세요 = { '안''녕''하''세''요'}
		 
		   
		 */
		

		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: "); //1. 문자열을 입력 받기
		String inputString = sc.next();
		
		
		System.out.print("검색할 문자를 입력하세요: ");// 2. 검색할 문자
		
		char searchChar = sc.next().charAt(0);// 첫 번째
		//문자열을 -> 문자로 반환
				// 안녕하세요 -> '안''녕''하''세''요'
				//String -> char 값으로 
		//toCharArray - > 문자열을 문자 배열로 변환시키는 역할
		
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount : " + charCount );
		
		
		
		//검색할 문자가 문자열에 몇개 들어가 있는지 -> length
		//몇번째 인덱스에 위치하는지 -> 인덱스
		int count = 0;//검색할 문자 개수 카운트
		System.out.println(inputString +"에 " + searchChar + " 가 존재하는 위치(인덱스)");
		//반복문을 사용해서 위치 찾기
		
		for(int i = 0; i <charCount; i++ ) {
			//만약에 내가 이 문자를 검색했을 때 이 문자는 몇 번째 인덱스에 위치하는지 인덱스 출력하기
			if(charString[i] == searchChar) {
			//charString[i] 고정값이 아니라 i값이 되야 하는 이유는 	
			//serchChar 우리가 검색해서 문자값을 지정해주기 때문에 값이 고정되어 있어야 함
			
			//문자배열이 내가 검색한 문자와 일치하는지
			System.out.println(i);
			count++;
			
			
			
			
			
			}
			
		}
		
		
		
	}

}

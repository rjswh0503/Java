package com.kh.practice5.func;

public class Practice5 {

	public static void main(String[] args) {
		
		//1. 주민번호 만들기
		String jumin = "123456-1234567"; // 총 14자리
		
		//2. 성별자리 이후 별표 만드는거 만들기
		String makestar = "*";
		
		//toCharArray를 사용해서 String -> char Array로 변경
		char[] juminStar = jumin.toCharArray();
		//  {'1','2','3','4','5','6','-','1','2','3','4','5','6','7'}
		
		for(int i = 8; 8 <=14;i++) {
			
			juminStar[i] = '*';
			System.out.println(juminStar);
			
		}
		
		

	}
	

}

package com.kh.staticvar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar st = new StaticVar();
		st.setStudentName("kh학생1");
		System.out.println(st.serialNum);
		st.serialNum++;
		//우리 서점 국어책 10번 칸
		//우리 서점 국어책 2번째 11번 칸
		
		StaticVar kh = new StaticVar();
		st.setStudentName("국어책 1");
		System.out.print("KH st : ");
		System.out.println(st.serialNum);
		
		kh.setStudentName("국어책 2 : ");
		System.out.println(kh.serialNum);
		

		
		
		
	}

}

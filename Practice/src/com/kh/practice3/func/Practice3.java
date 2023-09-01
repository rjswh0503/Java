package com.kh.practice3.func;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("국어점수 : ");
	    int kor = sc.nextInt();
	    System.out.print("수학점수 : ");
	    int math = sc.nextInt();
	    System.out.print("영어점수 : ");
	    int eng = sc.nextInt();
	    boolean isTrue = true;

	    int num = kor + math + eng;

	    System.out.println("국어 : " + kor);
	    System.out.println("수학 : " + math);
	    System.out.println("영어 : " + eng);

	    double Score = ((double)num) / 3;
	    if(Score >= 61.0){
	        System.out.println("합계 : " + num);
	        System.out.println("평균 : " + ((double)num) / 3 );
	        System.out.println("축하합니다, 합격입니다.");
	        isTrue = true;
	    }else{
	        System.out.println("불합격 입니다.");
	    }
	    
	}
	
}


package com.kh.practice3.func;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("�������� : ");
	    int kor = sc.nextInt();
	    System.out.print("�������� : ");
	    int math = sc.nextInt();
	    System.out.print("�������� : ");
	    int eng = sc.nextInt();
	    boolean isTrue = true;

	    int num = kor + math + eng;

	    System.out.println("���� : " + kor);
	    System.out.println("���� : " + math);
	    System.out.println("���� : " + eng);

	    double Score = ((double)num) / 3;
	    if(Score >= 61.0){
	        System.out.println("�հ� : " + num);
	        System.out.println("��� : " + ((double)num) / 3 );
	        System.out.println("�����մϴ�, �հ��Դϴ�.");
	        isTrue = true;
	    }else{
	        System.out.println("���հ� �Դϴ�.");
	    }
	    
	}
	
}


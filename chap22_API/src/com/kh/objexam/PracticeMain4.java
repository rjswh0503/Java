package com.kh.objexam;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {
	
	public void Practice1() {
		String name = "kh";
		
	}
	public void Practice2() {
		//��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		String formatStr = String.format("���� ��¥ : %s",smDateFormat.format(currentDate));
		System.out.println(formatStr);
		
	}
	public void Practice3() {
		int num1 = 123;
		int num2 = 7;
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		//��µǴ� ������ �ּ� �ʺ� �ڸ��� 5�ڸ��� �ϰ�ʹ�.
		String formatInt = String.format("����1: %07d, ����2: %d ",num1 , num2);
		System.out.println(formatInt);
		//String ������ = String.format("����1:     , ����2:    ",   ,    );
	}
	public void Practice4() {
		String text = "Hello";
		String text2 = "World";
		//10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		//���� �����ڿ��� 10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		//' ����ǥ�� �����׾ƾ���
	
		
		String formatStr = String.format("'%-10s' '%10s' " ,text, text2 );
		System.out.println(formatStr);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PracticeMain4 pm4 = new PracticeMain4();
		pm4.Practice1();
		pm4.Practice2();
		pm4.Practice3();
		pm4.Practice4();
	}
	
	

}

package com.kh.api.Exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	
	/*
	 
	  Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
	  java.1 ���� ������� ����
	   		java.time ��Ű�� LocalDate LocalTime LocalDateTime
	   		
	  
	  
	 * */

	public static void main(String[] args) {
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� :  " + currentDateTime);
		
		System.out.println("======================================");
		
		//��¥ ��� 
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		System.out.println("10�� �� ��¥ : " + futureDate);
		LocalDate today1 = LocalDate.now();
		LocalDate futureDate1 = today1.plusDays(20);
		System.out.println("20�� �� ��¥ : " + futureDate1);
		
		//���̳ʽ� �÷��� ���� �ΰ���
		
		LocalDate yester = LocalDate.now();
		LocalDate paDate = today.minusDays(10);
		System.out.println("10�� �� ��¥ : " + paDate);
		LocalDate yester1 = LocalDate.now();
		LocalDate paDate1 = today.minusWeeks(2);
		System.out.println("2�� �� ��¥ : " + paDate1);
		
		
		
		System.out.println("======================================");
		
		LocalDate  date1 = LocalDate.of(2023, 9, 12);
		LocalDate  date2 = LocalDate.of(2023, 9, 13);
		LocalDate  date3 = LocalDate.of(1993, 3, 19);
		
		if(date1.isBefore(date2)){
			System.out.println(date1+ " �� " + date2 + " �����Դϴ�.");
		}else if(date1.isBefore(date3)){
			System.out.println(date3 + " �� " + date2 + "�����Դϴ�.");
		} else {
				System.out.println();
			
		}
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3�ð� �� �ð� : " + laterTime);
		
		System.out.println("======================================");
		
		LocalDate today4 = LocalDate.now();
		LocalDate day = today.plusDays(15);
		System.out.println("�߼� : " + day);
		
		
		
		
		

		
		
	
		
		
		
		
 
		
	}

}

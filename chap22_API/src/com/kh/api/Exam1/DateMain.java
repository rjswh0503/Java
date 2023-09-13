package com.kh.api.Exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	
	/*
	 
	  Date : 날짜와 시간 정보를 나타내는데 사용
	  java.1 이후 권장되지 않음
	   		java.time 패키지 LocalDate LocalTime LocalDateTime
	   		
	  
	  
	 * */

	public static void main(String[] args) {
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 :  " + currentDateTime);
		
		System.out.println("======================================");
		
		//날짜 계산 
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		System.out.println("10일 후 날짜 : " + futureDate);
		LocalDate today1 = LocalDate.now();
		LocalDate futureDate1 = today1.plusDays(20);
		System.out.println("20일 후 날짜 : " + futureDate1);
		
		//마이너스 플러스 각각 두개씩
		
		LocalDate yester = LocalDate.now();
		LocalDate paDate = today.minusDays(10);
		System.out.println("10일 전 날짜 : " + paDate);
		LocalDate yester1 = LocalDate.now();
		LocalDate paDate1 = today.minusWeeks(2);
		System.out.println("2주 전 날짜 : " + paDate1);
		
		
		
		System.out.println("======================================");
		
		LocalDate  date1 = LocalDate.of(2023, 9, 12);
		LocalDate  date2 = LocalDate.of(2023, 9, 13);
		LocalDate  date3 = LocalDate.of(1993, 3, 19);
		
		if(date1.isBefore(date2)){
			System.out.println(date1+ " 은 " + date2 + " 이전입니다.");
		}else if(date1.isBefore(date3)){
			System.out.println(date3 + " 은 " + date2 + "이전입니다.");
		} else {
				System.out.println();
			
		}
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3시간 후 시간 : " + laterTime);
		
		System.out.println("======================================");
		
		LocalDate today4 = LocalDate.now();
		LocalDate day = today.plusDays(15);
		System.out.println("추석 : " + day);
		
		
		
		
		

		
		
	
		
		
		
		
 
		
	}

}

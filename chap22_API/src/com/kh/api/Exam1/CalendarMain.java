package com.kh.api.Exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {
	
	public static void main(String[] args) {
		
		//Calendar 클래스를 사용한 현재 날짜와 시간 가져오기
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		System.out.println("calendar 클래스를 이용한 현재 날짜와 시간");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		System.out.println("현재 : " + year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초 ");
		
		//GregorianCalendar 클래스를 활용한 현재 날씨와 시간 가져오기
		GregorianCalendar gCalendar = new GregorianCalendar();
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.MONTH) +1;
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+ "년" + month + "월" + day + "일");
		
		
		
				
		
	}

}

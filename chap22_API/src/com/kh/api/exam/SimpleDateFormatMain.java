package com.kh.api.exam;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatMain {
	/*
	  
	 SimpleDateFormat
	  날짜와 시간을 원하는 형식으로 포멧팅 하거나 
	  문자열로부터 날짜와 시간을 파싱하는데 사용되는 클래스
	  
	  y : 연도
	  M : 월
	  d : 일
	  H : 24시간 형식의 시간
	  m : 분
	  s : 초
	  
	 
	  
	  */
	
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//포멧팅된 문자열로 변환
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜 및 시간 : " + forDate);
	}

}

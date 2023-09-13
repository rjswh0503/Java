package com.kh.api.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
		pm.Practice4();
		pm.Practice5();
		pm.Practice6();

	}
	
	public void Practice1() {
		//����� yyyy-MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String forDate = sdf.format(currentDate);
		System.out.println(" �� �� �� : "+forDate);
		
		
		
	}
	
	public void Practice2() {
		//�ú��� HH:mm:ss
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String forDate = sdf.format(currentDate);
		System.out.println(" �� �� �� : "+forDate);
		
		
		
		
		
	}
	public void Practice3() {
		//���� MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		
		String forDate = sdf.format(currentDate);
		System.out.println(" �� ��   :  " +forDate);
		
		
		
		
		
		
	}
	
	public void Practice4() {
		//���� �ð� yyyy-HH
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		
		String forDate = sdf.format(currentDate);
		System.out.println(" ���� �ð� : "+forDate);
		
		
		
		
	}
	public void Practice5() {
		//��¥ ���� yyyy-HH
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
		String forDate = sdf.format(currentDate);
		System.out.println(" �� �� �� : "+forDate);
		
		
		
	}
	public void Practice6() {
		//��¥ ���� yyyy-HH
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" yyyy.MM.dd (E) a HH:mm:ss");
		
		String forDate = sdf.format(currentDate);
		System.out.println(" �� �� �� : "+forDate);
		

	}
	
	
	
}

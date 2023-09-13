package com.kh.api.exam;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatMain {
	/*
	  
	 SimpleDateFormat
	  ��¥�� �ð��� ���ϴ� �������� ������ �ϰų� 
	  ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
	  
	  y : ����
	  M : ��
	  d : ��
	  H : 24�ð� ������ �ð�
	  m : ��
	  s : ��
	  
	 
	  
	  */
	
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//�����õ� ���ڿ��� ��ȯ
		String forDate = sdf.format(currentDate);
		System.out.println("������ �� ��¥ �� �ð� : " + forDate);
	}

}

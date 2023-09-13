package com.kh.api.Exam1;

public class WrapperMain {
	
	/*
	  Wrapper :  �⺻ ������ ������ ��ü�� ����(wrap)
	  			��ü�� �۾��� �� ����
	  			Ŭ�����δ� Integer,Double,Boolean ���� ����
	 * */
	public static void main(String[] args) {
		Integer num = 40;
		System.out.println("���� �� : " + num);
		
		
		//Wrapper Ŭ������ �⺻ ������ �������� ��ȯ
		int intValue = num.intValue();
		System.out.println("�⺻ ������ ���� �� : " + intValue);
		
		Double pi = 3.14159265359;
		
		//���� ���� ���
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("���� ���� : " + area);
		
		//���ڿ��� �Ǽ��� ��ȯ
		
		String numStr = "10.7";
		Double parsedDouble = Double.parseDouble(numStr);
		//parseDouble String ���ڿ� �����͸� ����, �Ҽ��� ��ȯ�ϰڴ�
		System.out.println("���ڿ��� �Ǽ��� ��ȯ�� �� : " + parsedDouble);
		
		//Boolean Wrapper Ŭ���� �����
		Boolean isJavaFun = true;
		
		//���ǹ� Ȱ��
		
		if(isJavaFun) {
			System.out.println("�ڹٴ� ��ս��ϴ�.");
			
		}else {
			System.out.println("�ڹٴ� ������");
		}
		String boolStr = "true";
		Boolean parseBool = Boolean.parseBoolean(boolStr);
		System.out.println("���ڿ��� �Ҹ������� ��ȯ�� �� : " + parseBool);
		
		
		
		
	}

}

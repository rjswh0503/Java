package com.kh.operator;

public class OperatorEaxm {

	public static void main(String[] args) {
		// 1.���� ���� ������
		/*
		  ���� ���� �����ڴ� ���� 1�� ������Ų �� �� ���� �ٽ� ������ �Ҵ�
		  i�� ���� 1 ������Ű�� �� ���� �ٽ� i�� �Ҵ�
		 
		 */
		int i = 5;
		i = ++i;
		System.out.println("i = ++i :" + i);
		
		
		
		//2. ���� ���� ������
		/*
		 ���� ���� �����ڴ� ������ ���� ���� ����� �� 
		 ���� 1�� ���� 
		 i�� ���� ���� i�� �Ҵ��ϰ�, �� �Ŀ� i�� ���� 1���� ��Ų��. ������ �Ҵ��� ���簪�̹Ƿ� i�� ������� �ʴ´�.
		  
		  
		  */
		
		int i1 = 5;
		i1 = i1++;
		//System.out.println("i1 = i1++ : " + i1);
		
		
		int a = 5;
		++a;
		System.out.println("++a : " + a);
		
		// �켱 ������ ������ 
		int b = 5;
		b++;
		System.out.println("b++ : " + b);

	}

}

package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		// ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		/*
		  ������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ�
		  �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		  �迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ���
		  �������� ������ ���� �ٷ� �� �ֵ��� ������
		  �迭�� ������
		  	�迭 ���� �� �ʱ�ȭ
		  	������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
		  
		  
		  
		  
		  Ư¡ : 
		  	1. ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ ����������
		  				  ���� �� ũ�⸦ ������ �� ����
		  				  
		  	2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ �Ѵ�.
		  					 ex)intŸ���� �迭�� ��� ��Ұ� ����
		  					 
		  	3. index ��� ���� : �� �迭 ��Ҵ� �������� �ε����� ������
		  					  0���� �����ؼ� �迭ũ�� -1������ ���� ����
		  					  �ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ����
		  					  ex) �迭ũ�� = 5�� ��ٸ� index�� 0 ~ 4
		  					  
		  	4. �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�.
		  	
		  	
		  */
			
			
			//score�� 5������ ���߿� score�� 1000�� ���? => �迭 ���
			//int Ÿ�� �迭 ���� 
			String[] stringArray = new String[4];
			stringArray[0] = "��";	
			System.out.println("stringArray : " + stringArray[0]);
			stringArray[1] = "��";
			System.out.println("stringArray : " + stringArray[1]);
			stringArray[2] = "��";
			System.out.println("stringArray : " + stringArray[2]);
			stringArray[3] = "��";
			System.out.println("stringArray : " + stringArray[3]);
			
			
			
			String[] food = {"����","����","����","�Ұ��"}; // 3
			int foodLength = food.length;
			System.out.println("food �迭�� ���� : " + foodLength);
			
			
			
			
			
			
			
			

	}

}

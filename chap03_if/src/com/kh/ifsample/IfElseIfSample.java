package com.kh.ifsample;
   	 
public class IfElseIfSample {

	public static void main(String[] args) {
		//if-else if-else
		/*
		 ���� ���� ������ ���������� ��
		 �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		 ���� if�� else if ���ǵ� ���� �ƴ϶�� ������ else��� ����
		 
		 if(����1) {
		   //����1�� ���� �� ����Ǵ� �ڵ�
		     
		 } else if(����2) {
		    //����2�� ���� �� ����Ǵ� �ڵ�
		 
		 } else {
		   //���� ��� ������ ������ �� ����Ǵ� �ڵ�
		    
		 }
		  */
		
		int age = 23;
		if(age == 20) {
			System.out.println("�ؿܿ����� ������!");
			
		}else if(age >= 20) {
			System.out.println("���迩�� ������!");
			
		}else {
			System.out.println("���� ��������!");
		}
		
		
		//int score = 85;
		/*
		 ���࿡ 
			  90�� �̸� B+
		      90���� ������ A
		      90�� �̸��̸� B
		      
		      
		  */
		
		
		int score = 85;
		
		if(score == 90) {//90�� �̸� B
			System.out.println("B");
			
		}else if (score > 90 ) { //90���� ������ A
			System.out.println("A");
			
		}else {//90�� �̸��̸� C
			System.out.println("C");
		}
		
		int hour = 15;
		
		if(hour < 12) { 
			System.out.println("���� ��ħ�Դϴ�.!");
			
		}else if(hour < 18) { //18�� ����
			System.out.println("������ �ڵ��սô�.");
			
		}else { //18�� ����
			System.out.println("�����ϼ̽��ϴ�.");
		}
		
		
		//����üũ
		
		int temp = 28;
		
		if(temp > 30) { //31���� ��
			System.out.println("���� �����Դϴ�.");
		}else if(temp > 20) { //21 ~ 30 ���̰� ��
			System.out.println("������ �����Դϴ�.");
			
		}else { //20�� ����
			System.out.println("�ҽ��� �����Դϴ�.");
		}
		
		
		
		int number = -5;
		
		if (number > 0) { // 0���� Ŭ �� �� (true)
			System.out.println("����Դϴ�.");
		}else if(number < 0) { // 0���� ���� �� (true)
			System.out.println("�����Դϴ�.");
		}else {// 0�� �� ��(true)
			System.out.println("0 �Դϴ�.");
		}
		
		/*
		 int myAge = 15; ���� ���̰� 15�� �� ��
		 û�ҳ����� ������� �������� ����ϱ� 
		 */
		
		int myAge = 20;
		
		if(myAge == 14 && myAge <= 20) {// 14 ~ 20
			System.out.println("û�ҳ�");
		}else if(myAge > 20) { // 21�� �̻� ������ ��
			System.out.println("����");
		}else { // 14�� ������ ��� ���� �� ���
			System.out.println("���");
		}
		
	
	
		//���� ����ϱ�
		
		int	month = 1;
		if(month ==1 || month == 2 || month == 12) { //12�� 1�� 2�� �ܿ�
			System.out.println("�ܿ�");
		}else if (month >= 3 && month <= 5 ) { // 3�� 4�� 5�� ��
			System.out.println("��");
			
		}else if (month >= 6 && month <= 8) { // 6�� 7�� 8�� ����
			System.out.println("����");
		}else {                               // 9�� 10�� 11�� ����
			System.out.println("����");
		}
		
			
		
			

	}

}

package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		/*
		 
		 1.���ڿ��� �Է� �޾Ƽ� 
		 2. ���� �ϳ� �ϳ� �迭�� �ְ� 
		 3. �˻��� ���� Scanner 
		 4. ���ڿ��� � �� �ִ��� 
		 5. ������ ���° �ε����� ��ġ�ϴ��� 
		 6. �ε��� ����ϱ�
		 
		 ���� �ϳ� �ϳ� �迭�� �ִ´�.
		 String �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
		 char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
		 String �ȿ� char �迭�� ������ִ� �༮ -> toCharArry
		 ex) String �ȳ��ϼ��� = { '��''��''��''��''��'}
		 
		   
		 */
		

		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: "); //1. ���ڿ��� �Է� �ޱ�
		String inputString = sc.next();
		
		
		System.out.print("�˻��� ���ڸ� �Է��ϼ���: ");// 2. �˻��� ����
		
		char searchChar = sc.next().charAt(0);// ù ��°
		//���ڿ��� -> ���ڷ� ��ȯ
				// �ȳ��ϼ��� -> '��''��''��''��''��'
				//String -> char ������ 
		//toCharArray - > ���ڿ��� ���� �迭�� ��ȯ��Ű�� ����
		
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount : " + charCount );
		
		
		
		//�˻��� ���ڰ� ���ڿ��� � �� �ִ��� -> length
		//���° �ε����� ��ġ�ϴ��� -> �ε���
		int count = 0;//�˻��� ���� ���� ī��Ʈ
		System.out.println(inputString +"�� " + searchChar + " �� �����ϴ� ��ġ(�ε���)");
		//�ݺ����� ����ؼ� ��ġ ã��
		
		for(int i = 0; i <charCount; i++ ) {
			//���࿡ ���� �� ���ڸ� �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if(charString[i] == searchChar) {
			//charString[i] �������� �ƴ϶� i���� �Ǿ� �ϴ� ������ 	
			//serchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ� �־�� ��
			
			//���ڹ迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
			System.out.println(i);
			count++;
			
			
			
			
			
			}
			
		}
		
		
		
	}

}

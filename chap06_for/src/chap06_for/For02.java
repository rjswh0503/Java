package chap06_for;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		//������
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("ù��° ���ڸ� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ���. : ");
		int num2 = sc.nextInt();
		
		
		int result = 0; // ���� ���� 0���� �ݴϴ�.
		for (int i = 0; i < num2; i++) { // for ������ ����ؼ� i ������ 0���� num2�̸����� �ݺ�
			      						// �� ������ �ι�° ������ num2 ��ŭ �ݺ�
			result += num1;
			//result ������ num1 ���� ����
			//num2 ��ŭ num1�� ���ϴ� ȿ���� �� 
			System.out.println("�� = "+ num1 + " * " + num2 + " = " + result);
		}
		System.out.println(num1 + " * " + num2 + " = " + result);
		//���� ����� ��� �Է¹��� �� ���ڿ� ��� ���� ���ڿ��� �����ؼ� ���
		
		

	}
	
	*/
		System.out.print("ù��° ���ڸ� �Է��ϼ���. : ");
		                  //(2)
		int num3 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���. : ");
		                   //(4)
		int num4 = sc.nextInt();
		
		int result = 0;    //(4)
		for(int i  = 1; i <= num4; i++) {
			
			
			result += num3;
			
			System.out.println( num3 + " * " + i + " = " + result);
		
		}
		 		
		
		

	
	
	
	}
	
	
	

}

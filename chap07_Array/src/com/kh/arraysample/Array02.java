package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/*
		//  1. �迭�� ���̸� ����
		int[] num = new int[10]; // ���̰� 3�� �迭 ����
		//  1~10 ������ �ݺ����� �̿��ؼ�
		for(int i = 0; i <num.length;i++) {
			num[i] = i + 1;
			System.out.println("num["+ i+"]"+num[i]);
			
		}
	     
		//  ������� �迭 �ε����� ���� �� �� ���� ���
		//for(int i = 0; i < num.length; i++) {
			//System.out.println(num[i]);
			//System.out.println();
		//}
		//���̰� 10�� �融�� ���� 1~10������ ���� �ݺ����� �̿��Ͽ� 
		//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		// ��°� : 10 9 8 7 6  5 4 3 2 1
		          //    10>10
		/*
		for(int i = 0; i <=num.length; i++) {
			num[i] = num.length - 1;
			System.out.println(num[i]);
			//System.out.println("num[" + i + "] = " + num[i]);
		}
		*/
		
		/*
		int[] numbers = new int[10];
		
		int value = numbers.length;
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = value--;
			System.out.println("numbers[" + i + "] = "  + numbers[i]);
		}
		
		*/
		/*
		int[] num2 = new int[20];
		
		int value1 = num2.length;
		for(int i = 0; i<num2.length; i++) {
			num2[i] = value1--;
			System.out.println("number[" + i + "] = " + num2[i]);
		}
		*/
		
		//2. ���̰� 5�� String �迭 ����
		// "��� "��" "����" "������"" ����" �� �ʱ�ȭ �� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ���
		
		
		              //    0    1    2     3     4  //     5
		String[] fruit = {"���","��","����","������","����"};
		System.out.println(fruit[1]);
		
		
		int[] test = new int[5];
		for(int i = 0; i <5; i++) {
			test[i] = i + 1;
			System.out.println(test[i]);
			
		
			
			
			
			
			
			
			
			
		}
		 
		
		

	}

}

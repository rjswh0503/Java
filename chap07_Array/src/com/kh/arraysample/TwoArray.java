package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		
		String[][] fruits = {
				{"Apple","Banana","Cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi", "Mango","PineApple"}
				
		};
		System.out.println("fruits.length : " + fruits.length);
		System.out.println("fruits.length : " + fruits[0].length);	
		for(int i = 0; i < fruits.length; i++) {
			System.out.println("ù ��° ���� : " + i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
				System.out.println("�� ��° ���� : " + a);
			}
			System.out.println(); //���������� �̵��� �� �ְ� enter�� ��� �żҵ� �Է�
		}

	}

}

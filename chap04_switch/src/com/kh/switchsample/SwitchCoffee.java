package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		//while���� Ȱ���� switch
		Scanner sc = new Scanner(System.in);
		
		int choice;
		boolean isChoice = false;
		
		while(!isChoice) {
			System.out.println("Ŀ���ֹ� ���ּ���. 1. �Ƹ޸�ī�� 2.ī��� 3.ȫ��");
			
		
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ�");
				isChoice = true;
				break;
			case 2:
				System.out.println("ī��� �ֹ�");
				isChoice = true;
				break;
			case 3:
				System.out.println("ȫ�� �ֹ�");
				isChoice = true;
				break;
				
			default :
				System.out.println("�߸��� ����. �ٽ� �ֹ� ���");
				
			}
		}

	}

}

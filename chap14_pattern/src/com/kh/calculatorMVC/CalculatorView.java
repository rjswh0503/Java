package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	//Ŭ���̾�Ʈ�� ���� ��
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		return sc.nextInt(); //�Է��� ���� ����
		
		
	}
	//���� ���
	public void displayResult(int result) {
		System.out.println("��� : " + result);
		
	}
	

}

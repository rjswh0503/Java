package com.kh.practice3.func;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in); //  �Է� ���� �� Scanner
	    System.out.print("1 ~ 12 ������ ���� �Է� : ");
	    int month = sc.nextInt();

	    switch (month){
	        case 12: case 1: case 2: // case ���� 12 ~ 2
	            System.out.println(+ month + "���� �ܿ��Դϴ�.");

	            break;
	        case 3: case 4: case 5:
	            System.out.println(+ month + "���� �� �Դϴ�.");

	            break;
	        case 6: case 7: case 8:
	            System.out.println(+ month +"���� ���� �Դϴ�.");

	            break;
	        case 9: case 10: case 11:
	            System.out.println(+ month +"���� ���� �Դϴ�.");

	            break;
	        default:
	            System.out.println(+ month + "���� �߸� �Էµ� �� �Դϴ�.");
	    }

	}
}

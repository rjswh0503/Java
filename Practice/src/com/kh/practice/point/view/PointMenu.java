package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("====�޴�====");
		System.out.println("1. ��");
		System.out.println("2. �簢��");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ: " );
		int num = sc.nextInt();
		
		if(num == 1) {
			circleMenu();
		}else if(num == 2) {
			rectangleMenu();
			
		}else {
			System.out.println("�����մϴ�.");
		}
		
	}
	
	public void circleMenu() {
		System.out.println("====�� �޴�====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int num1 = sc.nextInt();
		if(num1 == 1) {
			calcCircum();
		}else if(num1 == 2) {
			CirArea();
			
		}else if(num1 == 9) {
			mainMenu();
				
		}
		System.out.println("�������� ���ư��ϴ�.");

		
	}
	
	public void rectangleMenu() {
		System.out.println("====�簢�� �޴�====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.println("�޴� ��ȣ : ");
		int num2 = sc.nextInt();
	}
	
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		
		
		
	}
	public void CirArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.println("������ : ");
		int radius = sc.nextInt();
		
	}
	

}

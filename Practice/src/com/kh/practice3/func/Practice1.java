package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է¹ٶ�// 1.�Է� 2.���� 3.��ȸ 4.���� 7.����");
		
	   int choice = sc.nextInt();
	   
	   /**1.if�� **/
	   /*
	   if(choice == 1) {
		   System.out.println("�Է�");   
	   }else if(choice == 2) {
		   System.out.println("����");
	   }else if(choice == 3) {
		   System.out.println("��ȸ");
	   }else if(choice == 4) {
		   System.out.println("����");
	   }else if(choice == 7) { //else�� �� ��� ������ ���� ���ϱ� ������ else if�� ��� ��
		   System.out.println("���α׷��� ����˴ϴ�.");
	   }
         
	   */
	   /** 2. switch �� **/
	   
	   switch(choice) {
	   case 1:
		   System.out.println("�Է�");
		   break;
	   case 2:
		   System.out.println("����");
		   break;
	   case 3:
		   System.out.println("��ȸ");
		   break;
	   case 4:
		   System.out.println("����");
		   break;
	   case 7:
		   System.out.println("����");
		   break;
		default :
			System.out.println("�ùٸ��� ���� ��ȣ �Դϴ�.");
	   
	   }
	   
	   
	}

}

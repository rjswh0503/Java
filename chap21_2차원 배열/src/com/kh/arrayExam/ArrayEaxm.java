package com.kh.arrayExam;

import java.util.Scanner;

public class ArrayEaxm {
	public void practice1() {

		int value = 16;
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
				
			}
			
		}
		
	
	
	}
	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];
		
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j <arr[i].length;j++) {
				arr[i][j] = value++;
				
			}
		}
		
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.printf("%2d " , arr[i][j]);
				//printf("출력서식",출력할 내용);
					//출력 후 줄바꿈 하지 않음
				// 줄 바꿈을 할려면 지시자 %n을 넣어줘야 함
				//%b는 boolean형식으로 출력
				//%d 정수 형식으로 출력
				
				//println(안에 이미 %n이 포함 되어있어서 줄바꿈)
				
				
				
				
			}
			System.out.println();
		}		
	}
	public void practice3() {
		int row = 0; //행
		int col = 0; //열
		char value = 'a';
		char[][] arr = null;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("행의 크기 : " );
		row = sc.nextInt();
		arr = new char[row][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 ");
			col = sc.nextInt();
			
			
			arr[i] = new char[col];
		}
		
		for(int i = 0; i <arr.length;i++) {
			for(int j = 0; j <arr[i].length;j++) {
				arr[i][j] = value++;
			}
			
		}
		
		
		
	
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public void practice4() {
		int count = 0;
		String[] students = {"강건강","남나나","도대담","류라라","문미미", "박보배", "송성실","윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		for(int i = 0; i < seat1.length;i++){
			for(int j = 0; j <seat1[i].length;j++) {
				seat1[i][j] = students[count++];
			}
			
		}
		for(int i = 0; i < seat2.length;i++){
			for(int j = 0; j <seat2[i].length;j++) {
				seat2[i][j] = students[count++];
			}
			
			
		}
		System.out.println("==1분단==");
		for(int i = 0; i <seat1.length;i++) {
			for(int j = 0; j <seat1[i].length;j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println("==2분단==");
		for(int i = 0; i <seat2.length;i++) {
			for(int j = 0; j <seat2[i].length;j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}


	}
	
}



package com.kh.practice6.exam;

import java.util.Scanner;

public class DD {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�Է� : ");
        int n = sc.nextInt();
        
        if(n % 2==0){
            System.out.println("¦��");
        }else{
            System.out.println("Ȧ��");
        }
                   
    }
}
package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class voidNReturn {
	public void practice1() {
		//�� ���� �� ���
		 Scanner scanner = new Scanner(System.in);
		 
	       System.out.print("���� �Է�1 :");	        
	       int num1 = scanner.nextInt();
	       System.out.print("���� �Է�2 :");
	        int num2 = scanner.nextInt();
	        int sum = 0;
	        System.out.println("��  : " + (num1 + num2));
	         
	    }
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� : ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
       
	    
	}
	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("�Է� : "); 
	     String input = scanner.nextLine();

	     String reversed = new StringBuilder(input).reverse().toString();
	       System.out.println(reversed);
	}
	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�迭ũ�� �Է� : ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;


       
        for (int i = 0; i < size; i++) {
        	System.out.print("�Է� : ");
            numbers[i] = scanner.nextInt();
            sum +=numbers[i];
            System.out.println(sum);
        }
    
        
        
	}
	public void practice5() {
		Scanner scanner = new Scanner(System.in);
	       System.out.print("�Է� : ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
        	System.out.print("�Է� : " );
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                System.out.println(max);
            }
        }
	        
	        
	}
	/*
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
          
        } else {
           
        }
    }
    /*
    public void  boolean isPrimeNumber(int num) {
        if (num <= 1) {
            
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
               
            }
        }
        
        
	}
    
    public practice7() {
    	/*���� ����� (���� ��� ��ȯ):

    	�޼��� �̸�: calculate

    	�Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator
    	���: num1�� num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
    
    

    }
    public practice8() {
    	/*
    	�ܾ� ���� ����:

    	�޼��� �̸�: countWords

    	�Ű�����: ���ڿ�(String Ÿ��) text
    	���: �Էµ� ���ڿ����� ������ �������� �ܾ��� ������ ���� ����� �����(void ���� Ÿ��).
    	
    

    }
    public practice9() {
    	/*
    	�ﰢ�� �� ���:

    	�޼��� �̸�: printTriangle

    	�Ű�����: ���� ����(int Ÿ��) height
    	���: ���̰� height�� �ﰢ�� ����� ���� �����(void ���� Ÿ��).
    	
    

    }
    public practice10() {
    	/*
    	�ζ� ��ȣ ������:
    	Random
    	�޼��� �̸�: generateLottoNumbers

    	�Ű�����: �ζ� ��ȣ�� ����(int Ÿ��) count
    	���: �ߺ����� �ʴ� ������ �ζ� ��ȣ�� count��ŭ �����Ͽ� �����(void ���� Ÿ��).
    */

    
    }
   



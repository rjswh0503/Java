package com.kh.ifsample;

public class IfElseSample {

	public static void main(String[] args) {
		//if-else
		/*
		 ���α׷� ���ǿ� ���� �ΰ��� ���� �ٸ� �ڵ� ��� �� �ϳ��� �����ϴ� �����
		 ���� if ���� ������ ���̸� if ���� �ִ� ����� ������ �ǰ� 
		 ������ �����̸� else ����� ������ �ȴ�.
		 �̸� ���� �ΰ��� ��Ȳ�� ���� �ٸ� ������ ������ �� �ִ�.
		 if(����) {
		    //������ ���� �� ����Ǵ� �ڵ�
		  } else {
		    //������ ������ �� ����Ǵ� �ڵ�
		  }
		     
		 * */
		
		int age = 60;
		if (age >= 60) {
			System.out.println("ȯ����ġ�� �Ұž�");//60���� ũ�ų� ������ ����
			
		}else {
			System.out.println("���� �־���...");//60���� ������ ����
			
			
		}
		
		
		int temp = 21;
		if (temp >= 25) {
			System.out.println("���� ���� ����˴ϴ�.");
		} else {
			System.out.println("������ ������ ����˴ϴ�.");
		}
		
		
		double height = 175.3;
		if (height >= 177.5) {
			System.out.println("Ű�� ũ��");
			
		}else {
			System.out.println("Ű�� �۴�");
		}
		
	

	}

}

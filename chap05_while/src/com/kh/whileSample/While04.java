package com.kh.whileSample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 1���� �� ���ϱ�
		
		int sum = 0; // ���� ��
		int num = 1; 
		while(num <= 5) { //true
			System.out.println("num �� : " + num);
			sum += num;
			// sum += 1 + 2
			num = num + 1;
			//System.out.println("sum �� : " + sum)
			//sum�� �հ踦 �ֱ������� ��������� while�� �ȿ� �ۼ��ϱ�
	        //sum(0) += 1 = 1
			//sum(1) += 2 = 3 
			//sum(3) += 10 = 13
			
			
		}
		System.out.println("sum �� :" + sum);
		
		/*
		 * while�� ����Ǿ��� �ؼ� Ŭ������ ����� ���� �ƴ�
		 * while���� ����� �� �����ִ� System.out.println(sum)�� ��µ�
		 * 
		 * 
		 * */
	
	
		
		
	}

}

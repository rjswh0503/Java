package com.kh.arraysample;

public class Array05 {

	public static void main(String[] args) {
	// 배열 더하기 
		    //length =   5자리
		    // index =   0,1,2,3,4
		int[] numbers = {1,2,3,4,5};
		
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum += numbers[i];
			
		}
		System.out.println("배열 요소의 합 : " + sum);
		
		
		

	}

}

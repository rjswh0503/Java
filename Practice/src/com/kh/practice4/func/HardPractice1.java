package com.kh.practice4.func;

import java.util.Scanner;

public class HardPractice1 {
	
	public static void main(String[] args) {
		/*
		  	//1 .사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		  	 
			//2.단(= 만약에), 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
			
			//3. 
		 	 	‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
					ex) 2, 3, 5, 7, 11 …
		  			ex) 숫자 : 5 숫자 : 9 숫자 : 0	
		  	//4. 소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다. 		
		  	 * 	
		 */
		
		Scanner sc = new Scanner(System.in); // 입력받기 위해 불러오는 메소드
		System.out.print("숫자를 입력해주세요. : "); // 출력 메소드 
		int num = sc.nextInt(); // 
		
		int count = 0; //count 
					
		
		if(num < 2) { // 만약에 입력한 수가 2보다 작은 경우
			System.out.println("잘못 입력하셨습니다.");
		}else { // 만약에 입력한 수가 2보다 클 경우 
			
			//소수인지 아닌지 판별하는 boolean
			
			boolean checkNum = true; // 소수 여부를 판단하기 위한 boolean 변수 checkNum을 초기화  처음에는 소수 가정
			for(int i = 2; i <= num; i++) { //2부터 입력받은 숫자 num까지의 반복문 소수를 찾는 역할
				//for문을 활용해서 나타낸 출력
				for(int a = 2; a * a <= i; i++) { //입력받은 숫자가 아닌 현재 숫자 i가 소수인지 판단하기 위한 반복문
					
					/*
					 
					  i - 1 해야할 경우 a * a 대신 넣어라
					 
					 숫자 i가 소수인지 확인하려면 2부터 i - 1까지 모든 숫자로 i를 나누는 방법을 사용할 수 있음 
					 a 사용하는 원리 : 
					 만약 i가 어떤 숫자 a로 나누어 떨어진다면 i가 a의 배수라면 i / a 역시 i의 약수 중 하나 
					 이때 i를 a보다 큰 숫자로 나눠 봤을 때는 이미 a로 떨어지지 않기 때문에 
					 a가 i의 약수라면 i/a 역시 i의 약수이고, a는 i/a는 서로 다른 숫자
					 i가 소수인지 판별하기 위해 2부터 i-1 까지 모든 숫자 대신2부터 i까지 숫자로만 나눠봐도 소수 
					 
					  a * a 를 사용하는 것은 소수 판별 알고리즘을 최적화 하기 위해 사용되는 방법
					  sqrt(i) : i의 제곱근을 나타내는 함수
					  sqrt(16) : 결과가 4가 된 16의 제곱근이 4라는 뜻
					  
					  */
					  
					  
					  
				
					//만약에 소수가 아닐경우
					if(i % a == 0){ // 2%2 = 0 2/3
						//만약에 소수가 아닐경우
						checkNum = false;
						count++;
						break;

					}
					if(checkNum) {
						//소수 일 때 값을 출력
						System.out.println(i); //출력 메소드 작성
					}
					checkNum = true;
					
					
					
				}
				System.out.println("소수의 총 갯수 : " +(num - count)); //모든 숫자 검사가 끝난 후 소수가 아닌 수의 개수를 빼서 소수의 총 갯수를 출력
				
				
			}
			
		}
			
		
	/*	
		for(for문 1번) { ~~ 
		
			for(for문 2번) { ~~~
			
			
			
			
			*/
		}
		
	}
	
	
	


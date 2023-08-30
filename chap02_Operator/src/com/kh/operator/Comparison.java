package com.kh.operator;

public class Comparison {

	public static void main(String[] args) {
		//4. 비교연산자 : 값을 비교할 때 사용
		/*
		 크기 비교, 등호 비교 등을 사용할 수 있음
		 두개의 항 중 어느것이 더 큰지, 더 작은지. 다른지의 여부를 판단함
		 비교 연산자의 결과 값은 참(true) 또는 거짓(false)으로 반환
		 > 왼쪽 항이 크면 참, 아니면 거짓으로 반환 미만 초과 ex) num>5
		 < 왼쪽 항이 작으면 참, 아니면 거짓을 반환 미만 초과 ex) num<5
		 >= 왼쪽 항이 오른쪽 항보다 크거나 같으면 참, 아니면 거짓을 반환 ex) num>=5
		 <= 왼쪽 항이 오른쪽 항보다 작거나 같으면 참, 아니면 거짓을 반환 ex) num<=5
		 == 두 항의 값이 같으면 참, 아니면 거짓을 반환 ex) num==5
		 != 두 항의 값이 다르면 참, 아니면 거짓을 반환 ex) num!=5
		 */
		
		
		int p = 5;
		int q = 10;
		System.out.println("boolean을 넣지 않음 : " + (p == q)); //값이 다르기 때문에 false
		boolean isEqual = p == q;
		System.out.println(isEqual);
		
		int r = 5;
		System.out.println("p == r : " + (p == r));//값이 5로 동일하기 때문에 true
		
		boolean isEqual1 = p != q; //p와 q의 값이 다르기 때문에 true
		System.out.println("p != q : " + isEqual1);
		
		
		boolean isEqual2 = p != r ; //p와 r의 값이 같게 나오기 떄문에 false
		System.out.println("p != r : " + isEqual2);
		
		
		
		

	}

}

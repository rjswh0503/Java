package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack 의 값 추가는 push() 사용
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack 값 삭제는 pop() 사용
		stack.pop();
		
		
		// stack 전체 값 제거 (초기화)
		stack.clear();
		
		
		//stack 가장 상단의 값( 가장 마지막에 넣은 값) 출력
		stack.peek();
		
		//stack의 크기 출력
		stack.size();
		
		
		//stack empty : 비어 있는지 check
		//비어 있다면 true
		// 하나라도 들어있다면 false
		stack.empty();
		
		//stack 1이 있는지 check 1이 존재한다면 True 
		stack.contains(1);
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
		
		
		/*
		  |		| 
		  |	 3	|
		  |	 2	|
		  |__1__|
		  
		 * */
		
		
	}

}

package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack �� �� �߰��� push() ���
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack �� ������ pop() ���
		stack.pop();
		
		
		// stack ��ü �� ���� (�ʱ�ȭ)
		stack.clear();
		
		
		//stack ���� ����� ��( ���� �������� ���� ��) ���
		stack.peek();
		
		//stack�� ũ�� ���
		stack.size();
		
		
		//stack empty : ��� �ִ��� check
		//��� �ִٸ� true
		// �ϳ��� ����ִٸ� false
		stack.empty();
		
		//stack 1�� �ִ��� check 1�� �����Ѵٸ� True 
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

package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		/*
		  
		      ����                           �� 
		       |                            |
	 	       v                            V                
	      	[First] < - > [second] < - > [third]      
	     	   	                                 
     ^                                                 ^
  	 |												   |
  [     ]                                           [      ]
	   
		 * */

		//ArrayDequeue ����ؼ� Dequeue ���
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("First");
		deque.addLast("Last");
		
		
		
		//�� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		//�� �հ� �ǵ� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		//��� �ִ��� Ȯ��
		System.out.println();
		

	}

}

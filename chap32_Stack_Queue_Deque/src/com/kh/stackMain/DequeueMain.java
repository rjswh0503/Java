package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		/*
		  
		      시작                           끝 
		       |                            |
	 	       v                            V                
	      	[First] < - > [second] < - > [third]      
	     	   	                                 
     ^                                                 ^
  	 |												   |
  [     ]                                           [      ]
	   
		 * */

		//ArrayDequeue 사용해서 Dequeue 사용
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("First");
		deque.addLast("Last");
		
		
		
		//맨 앞과 맨 뒤 요소 확인
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		//맨 앞과 맨뒤 요소 제거
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		//비어 있는지 확인
		System.out.println();
		

	}

}

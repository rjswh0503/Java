package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		//큐 Queue 생성
		
		Queue<String> queue = new LinkedList<>();
		/*
		 * 
		 *Front                Rear(tail)
	 		|                      |
		  	v                      v
		 * +---+  	 +---+       +---+
		 * | 1 | < - | 2 |  < -  | 3 |
		 * +---+     +---+       +---+
		 
		 * 
		 * */
		//큐에 요소 추가 
		
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
	
		//큐에서 요소 추출 및 출력 (FIFO 순서대로 출력)
		String removedElement = queue.poll();// queue에서 Apple 제거 하고 반환
		System.out.println(removedElement);
		
		
		removedElement = queue.poll(); // banana 제거하고 반환
		
		//큐에서 Front 요소 확인
		String fontElement = queue.peek(); // 큐의 front 요소 Cherry 반환
		
		//큐의 크기 확인
		int size = queue.size(); // 값이 1이 될 것임
		System.out.println("size : " + size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		

	}

}

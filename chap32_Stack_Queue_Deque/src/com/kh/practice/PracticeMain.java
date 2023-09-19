package com.kh.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		//stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		
		
		PracticeMain pm = new PracticeMain();
		pm.PracticeStack();
		pm.PracticeQueue();
	
	}
	public void PracticeStack() { 
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(70);
		stack.push(100);
		
		
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		stack.clear(); // 전체 값 삭제
		System.out.println(stack.empty()); //비어 있으면 True 하나라도 있으면 false
		
		System.out.println("Contains : " + stack.contains(70)); // 70이 있다면 True 없다면 false stack.clear()로 전체 값 삭제 했기 떄문에 false
		
		System.out.println("===============");
		System.out.println();
	}
	

	public void PracticeQueue() {
		Queue<String> qe = new LinkedList<>();
		
		
		
		qe.offer("Banana");
		qe.offer("Kiwi");
		qe.offer("WaterMelon");
		qe.offer("Mango");
		
		//큐에서 요소 추출 및 출력 (FIFO 순서)
		String removedElement = qe.poll(); // Banana 제거하고 반환
		System.out.println("제거 : " + removedElement);
		
		removedElement = qe.poll(); // Kiwi 제거하고 반환
		System.out.println("제거 : " + removedElement); 
		
		//큐에서 Front 요소 확인
		String fontElement = qe.peek(); // Banana와 Kiwi가 제거 되었으므로 요소 WaterMelon과 Mango 가 출력
		
		//큐의 크기 확인
		
		int size = qe.size();
		System.out.println("Size : " + size);
		
		while(!qe.isEmpty()) {
			String element = qe.poll();
			System.out.println(element);
		}
		
	}

}

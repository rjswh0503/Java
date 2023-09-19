package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		//ť Queue ����
		
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
		//ť�� ��� �߰� 
		
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
	
		//ť���� ��� ���� �� ��� (FIFO ������� ���)
		String removedElement = queue.poll();// queue���� Apple ���� �ϰ� ��ȯ
		System.out.println(removedElement);
		
		
		removedElement = queue.poll(); // banana �����ϰ� ��ȯ
		
		//ť���� Front ��� Ȯ��
		String fontElement = queue.peek(); // ť�� front ��� Cherry ��ȯ
		
		//ť�� ũ�� Ȯ��
		int size = queue.size(); // ���� 1�� �� ����
		System.out.println("size : " + size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		

	}

}

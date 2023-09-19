package com.kh.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		//stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		
		
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
		stack.clear(); // ��ü �� ����
		System.out.println(stack.empty()); //��� ������ True �ϳ��� ������ false
		
		System.out.println("Contains : " + stack.contains(70)); // 70�� �ִٸ� True ���ٸ� false stack.clear()�� ��ü �� ���� �߱� ������ false
		
		System.out.println("===============");
		System.out.println();
	}
	

	public void PracticeQueue() {
		Queue<String> qe = new LinkedList<>();
		
		
		
		qe.offer("Banana");
		qe.offer("Kiwi");
		qe.offer("WaterMelon");
		qe.offer("Mango");
		
		//ť���� ��� ���� �� ��� (FIFO ����)
		String removedElement = qe.poll(); // Banana �����ϰ� ��ȯ
		System.out.println("���� : " + removedElement);
		
		removedElement = qe.poll(); // Kiwi �����ϰ� ��ȯ
		System.out.println("���� : " + removedElement); 
		
		//ť���� Front ��� Ȯ��
		String fontElement = qe.peek(); // Banana�� Kiwi�� ���� �Ǿ����Ƿ� ��� WaterMelon�� Mango �� ���
		
		//ť�� ũ�� Ȯ��
		
		int size = qe.size();
		System.out.println("Size : " + size);
		
		while(!qe.isEmpty()) {
			String element = qe.poll();
			System.out.println(element);
		}
		
	}

}

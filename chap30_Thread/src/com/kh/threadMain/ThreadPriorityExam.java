package com.kh.threadMain;

public class ThreadPriorityExam {
	public static void main(String[] args) {
		StudentThread st1 = new StudentThread("�л� 1");
		StudentThread st2 = new StudentThread("�л� 2");
		
		
		
		
		// ������ �켱���� ����
		
		st1.setPriority(Thread.MAX_PRIORITY);// �켱������ �ִ�� ����
		st2.setPriority(Thread.MIN_PRIORITY);// �켱������ �ּҷ� ����
		
		
		//������ ����
		st1.start();
		st2.start();
	
		
		
		
		
		
		
	}
}

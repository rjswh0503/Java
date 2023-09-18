package com.kh.threadMain;

public class ThreadMain extends Thread {
	/*
	 Thread
	  	���μ��� ������ ����Ǵ� �������� ���� �帧
	  	��Ƽ�������� ���� ���� �۾��� ������ �� �ְ� ��
	 * */
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("������ ���� �� :" + i);
		}
		try {
			Thread.sleep(1000);
			System.out.println("������ �������ϴ�.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();
		
		// 
		
		thread1.start();
		thread2.start();
		
		//main �����忡�� �ٸ� �۾��� ������ �� ����
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��� ������ ����");
		

	}

}

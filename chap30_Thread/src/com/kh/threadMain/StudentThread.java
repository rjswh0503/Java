package com.kh.threadMain;

public class StudentThread extends Thread {
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
		
		
	}
	
	@Override // �� ����
	public void run() {
		System.out.println(studentName + "��(��) ���θ� �����մϴ�.");
		try {
			Thread.sleep(10000);// �����尡 2�� ���� ���ڱ� ���·� �ֵ��� �Ѵ�.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(studentName + "��(��) ���θ� ��Ĩ�ϴ�.");
	}
	

}

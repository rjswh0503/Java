package com.kh.threadMain;

public class StudentThread extends Thread {
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
		
		
	}
	
	@Override // 재 정의
	public void run() {
		System.out.println(studentName + "가(이) 공부를 시작합니다.");
		try {
			Thread.sleep(10000);// 스레드가 2초 동안 잠자기 상태로 있도록 한다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(studentName + "가(이) 공부를 마칩니다.");
	}
	

}

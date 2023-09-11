package com.kh.instance.tv;
//Tv 제작
public class Tv { //객체
	
	//Tv 속성(필드)
	String color; // 티비 색상  참조변수
	boolean power; //전원 상태	 인스턴스 변수
	int channel; // 채널      인스턴스 변수
	
	
	
	//Tv 기능(메서드)
	public void power() {
		power = !power; // 전원상태
		
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

}

package com.kh.instance.tv;

public class TvMain {
									
	public static void main(String[] args) {   // 인스턴스 
		
		Tv tv; //Tv인스턴스를 참조하기 위해서 변수 Tv를 선언
		tv = new Tv(); // tv인스턴스 생성 객체의 주소를 참조변수에 저장
		//Tv tv1 = new Tv(); 
		
		tv.channel = 7; // tv인ㄴ스턴스 맴버변수 channel의 값을 7로 출력
		tv.channelDown(); //tv 인스턴스의 메서드 channelDown 호출
		tv.power(); // 메서드 호출 
		System.out.println("channel : " + tv.channel);
	}

}

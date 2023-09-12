package com.kh.InterfaceSample;

public class InterFaceMain {

	public static void main(String[] args) {
		// MyInterFace 변수명 = new MyInterFace();
		// 							객체가 아니기 떄문에 생성할 수 없음
		MyInterFace myin = new MyClass();
		myin.doMyInterFace();

	}

}

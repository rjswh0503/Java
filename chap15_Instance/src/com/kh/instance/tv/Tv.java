package com.kh.instance.tv;
//Tv ����
public class Tv { //��ü
	
	//Tv �Ӽ�(�ʵ�)
	String color; // Ƽ�� ����  ��������
	boolean power; //���� ����	 �ν��Ͻ� ����
	int channel; // ä��      �ν��Ͻ� ����
	
	
	
	//Tv ���(�޼���)
	public void power() {
		power = !power; // ��������
		
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

}

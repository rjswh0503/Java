package com.kh.instance.tv;

public class TvMain {
									
	public static void main(String[] args) {   // �ν��Ͻ� 
		
		Tv tv; //Tv�ν��Ͻ��� �����ϱ� ���ؼ� ���� Tv�� ����
		tv = new Tv(); // tv�ν��Ͻ� ���� ��ü�� �ּҸ� ���������� ����
		//Tv tv1 = new Tv(); 
		
		tv.channel = 7; // tv�Τ����Ͻ� �ɹ����� channel�� ���� 7�� ���
		tv.channelDown(); //tv �ν��Ͻ��� �޼��� channelDown ȣ��
		tv.power(); // �޼��� ȣ�� 
		System.out.println("channel : " + tv.channel);
	}

}

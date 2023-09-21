package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//UDP ���� Ŭ����
public class UDPClient {
	//start() UDP ������ �����ϴ� �޼��� �׻� ����ó�� �ʿ�
	public void Start() throws Exception {
		//��Ĺ ����
		DatagramSocket datasocket = new DatagramSocket();
		//������ �����ϱ� ���� ������ ����
		//127.0.0.1 localhost Ŭ���̾�Ʈ�� ������ ���� ��ǻ�Ϳ��� ���� ���� ������ ����
		//��Ʈ��ȣ ������ server���� �����ϰ�, �������� ������ ��Ʈ�� �� 
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		//InetAddress serverAddress = InetAddress.getAllByName("127.0.0.1");
													//���⼭ all�� ������ Ȯ��
		
		//�����Ͱ� ����� ������ ������ ������ ũ��� byte �迭 ����
		byte[] msg = new byte[200];
		//������ �����͸� ������ ���� ����	
		DatagramPacket outPacket  = new DatagramPacket(msg,1,serverAddress,8080);
		//�����κ��� �����͸� �����ϱ� ���� ���� 
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		// ����Ÿ�׷� ��Ŷ �� ����
		datasocket.send(outPacket);
		// ����Ÿ�׷� ��Ŷ �� ���� 
		datasocket.receive(inPacket);
		// ���ŵ� �����͸� ���ڿ��� ��ȯ�ؼ� ������ ���� �ð��� ���
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		
		//Ŭ���̾�Ʈ�� ��Ĺ�� �ݾ� ������ ����
		datasocket.close();

	}
	
	public static void main(String[] args) {
		
		
		try {
			new UDPClient().Start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}

package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��Ʈ��ũ ����� ���� �߿��� Ŭ����
 UDP(User Datagram Protocol) ����ؼ� �����͸� �ۼ��� �ϴµ� ���
  DatagramSocket
  		UDP ����� ���� ��Ĺ Ŭ����
  		TCP ��Ĺ�� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ�
  		������ ��Ŷ�� �׳� ������ �޴� ����

  DatagramPacket
  		UDP Data ��Ŷ�� ��Ÿ���� Ŭ����
  		�������� ���� ����� �����͸� ���� ��� �Ǵ� 
  		������ ����� �ּ� ���� ����
  Packet �̶� ?
  		��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
  		�����͸� �ְ� ���� �� ���س��� ��Ģ
  		pack + bucket �ռ���

 * */

//UDP ������ ��Ÿ��
public class UDPServer {
	//start() UDP ������ �����ϴ� �޼��� ���ܸ� ���� �� �����Ƿ� ����ó���� �ʿ�
	public void  start() throws Exception {
		//8080 �� ��Ʈ�� ����ϴ� ���� ��Ĺ�� ���� UDP ����� �̷����
		
	DatagramSocket socket = new DatagramSocket(8080);
	//inPacket : Ŭ���̾�Ʈ�κ��� �����͸� ������ �� ���
	DatagramPacket inPacket, outPacket;
	//outPacket : Ŭ���̾�Ʈ���� �����͸� ���� �� ���
	byte[] inMsg = new byte[10];
	byte[] outMsg;
	
	//while ������ ����ؼ� ������ ����ؼ� ����
	//�� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ ��
	while(true) {
		//�����͸� �����ϱ� ���� ��Ŷ�� ����
		inPacket = new DatagramPacket(inMsg, inMsg.length);
		//��Ŷ��  ���� Ŭ���̾�Ʈ�κ���  �����͸� ����
		socket.receive(inPacket); 
		
		//������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port ���
		//inPacket�� ���ؼ� Ŭ���̾�Ʈ�� ip �ּҿ� port��ȣ �ޱ�
		InetAddress address = inPacket.getAddress();
		int port = inPacket.getPort();
		
		
		//������ ���� �ð��� �ú��� ���·� ��ȯ
		//���� ���� �ð��� hh:mm:ss ������ ���ڿ��� ��ȯ
		SimpleDateFormat simpleData = new SimpleDateFormat("[hh:mm:ss]");
		String time = simpleData.format(new Date());
		outMsg = time.getBytes(); //byte �迭�� ��ȯ 
		
		
		//��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
		outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);

		}	
	
		
	}
	
	
	//   main �޼��� : UDPServer Ŭ������ �ν��Ͻ��� �����ϰ�
	//   start() �޼��带 ȣ���Ͽ� UDP ���� ����
	//  ���� �߻��ϸ� ���� ó�� 
	public static void main(String[] args) {
		try {
			new UDPServer().start(); //Udp ���� ����
			//new UDPServe.start();
			//            error
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

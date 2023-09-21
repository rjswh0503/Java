package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException{
	int port = 3333;
	String  serverIP;
	serverIP = InetAddress.getLocalHost().getHostAddress();
	System.out.println(serverIP);
	try {
		Socket socket = new Socket("localhost",3333);
		System.out.println("server connect");
		
		//Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream out = socket.getOutputStream();
		
		//Ŭ���̾�Ʈ���� ������ �޼��� ����
		String msg = "Hi Client";
		out.write(msg.getBytes());
		out.flush();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("[ Server Connect! ]");
	
	
	

	
	}		

}

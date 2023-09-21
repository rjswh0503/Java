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
		
		//클라이언트와 통신을 위한 입 출력 스트림 설정
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream out = socket.getOutputStream();
		
		//클라이언트에서 서버로 메세지 전송
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

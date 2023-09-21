package com.kh.tcpMain;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		
			//���� �ּҿ� ��Ʈ ��ȣ�� ���� ���� 
			//���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ��  �����ؾ� �� 
			Socket socket = new Socket("localhost",8080);
			
			System.out.println("[ Server Connect! ]");
			
			//���� �� �ڵ�
			OutputStream outstream = socket.getOutputStream();
			PrintStream printstream = new PrintStream(outstream);
			printstream.print("Hi!!!! Server!!");
			printstream.flush(); 
			
			
			//�����κ��� �о��
			
			InputStream instream = socket.getInputStream();
			Scanner sc= new Scanner(instream);
			System.out.println("[Client] Server" + sc.nextLine());
			
			socket.close();
			System.out.println("Bye Server!");
			
	
	}

}

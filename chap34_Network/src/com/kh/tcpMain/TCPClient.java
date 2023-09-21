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
		
			//서버 주소와 포트 번호로 소켓 생성 
			//서버 주소와 포트번호는 내가 연결하고자 하는 포트와  동일해야 함 
			Socket socket = new Socket("localhost",8080);
			
			System.out.println("[ Server Connect! ]");
			
			//보낼 때 코드
			OutputStream outstream = socket.getOutputStream();
			PrintStream printstream = new PrintStream(outstream);
			printstream.print("Hi!!!! Server!!");
			printstream.flush(); 
			
			
			//서버로부터 읽어옴
			
			InputStream instream = socket.getInputStream();
			Scanner sc= new Scanner(instream);
			System.out.println("[Client] Server" + sc.nextLine());
			
			socket.close();
			System.out.println("Bye Server!");
			
	
	}

}

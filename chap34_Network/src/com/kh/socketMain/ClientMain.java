package com.kh.socketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[]args) throws UnknownHostException, IOException {
		//서버에 연결하기 위한 소켓 생성
		Socket socket = new Socket("localhost",8080);

		//서버로 데이터를 보내기 위한 출력 스트림 생성 
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		//서버로부터 데이터를 받기 위한 출력 시스템 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//키보드로부터 입력 받기 위한 생성
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		

		
	}
	
}

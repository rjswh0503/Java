package com.kh.socketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[]args) throws UnknownHostException, IOException {
		//������ �����ϱ� ���� ���� ����
		Socket socket = new Socket("localhost",8080);

		//������ �����͸� ������ ���� ��� ��Ʈ�� ���� 
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		//�����κ��� �����͸� �ޱ� ���� ��� �ý��� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Ű����κ��� �Է� �ޱ� ���� ����
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		

		
	}
	
}

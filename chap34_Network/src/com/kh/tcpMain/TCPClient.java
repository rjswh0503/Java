package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		try {
			//���� �ּҿ� ��Ʈ ��ȣ�� ���� ���� 
			//���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ��  �����ؾ� �� 
			Socket socket = new Socket("localhost",8080);
			
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
			//���� �Ǵ��� �׽�Ʈ �޼���
			out.print("�ȳ� ����");
			
			//�����κ��� �޼��� ���޵Ǵ��� Ȯ�� �׽�Ʈ
			String response = in.readLine();
			System.out.println("���� ���� : " + response);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

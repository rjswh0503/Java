package com.kh.finalSample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[]args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(3333);
		System.out.println("Server Waiting");	
	
	while(true) {
		Socket client = serverSocket.accept();
		System.out.println("Connect Client");
		
		
		OutputStream outStream = client.getOutputStream();
		PrintStream printstream = new PrintStream(outStream);
		printstream.print("Hi Client");
		printstream.flush();
		
		client.close();
		
		
		
		}

	
	
	
	}

}







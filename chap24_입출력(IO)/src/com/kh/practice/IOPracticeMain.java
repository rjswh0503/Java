package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPracticeMain {

	public static void main(String[] args) {
	IOPracticeMain op = new IOPracticeMain();
	//op.practice1();
	 op.practice2();
	}
	
	public void practice1() { //���ϰ�μ����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Documents//����0319.txt");
			w.write("���� ���� !!!!!!!!!!!!");
			w.close();
			FileReader reader = new FileReader("C:\\Users\\user1\\Documents//����0319.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferReader.readLine()) != null);
			System.out.println(line);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public void practice2() {
		
		final String folderPath = "C:\\Users\\user1\\Documents//folder3"; //���ϴ� ���� ��� 
		
		
		//���������

		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("���� ���� ����!");			
		}else {
			System.out.println("������ �̹� �ֽ��ϴ�.");
		}
		folder.exists();
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Documents//folder3//test1.jmg");
			w.write("test���� ����");
			w.write("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			w.close();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

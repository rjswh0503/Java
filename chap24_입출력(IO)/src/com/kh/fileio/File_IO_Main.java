package com.kh.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class File_IO_Main {
	
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); // ����
			//1.���Ͼ���
			writer.write("�ƴϾ� ��̾���");
			writer.close(); // ���� �ȿ� ������ �� ���� �ݱ�
			
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferdReader.readLine()) != null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
		
		
		
		
		
		
		
		




























		/*
		//���࿡ ��¥�� ���� ��¥�� ������ ������
		//������ �����
		String filePath = "���� ���� ��/�����IO.txt";
		System.out.println("����");
		
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("������ �����߽��ϴ�.");
			}else {
				System.out.println("�����ϴ� �����Դϴ�.");
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		
		String fileName = f.getName();
		
		//FileReader fReader = new FileReader(f,true);
		
		*/


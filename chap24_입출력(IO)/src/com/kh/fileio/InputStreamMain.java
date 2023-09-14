package com.kh.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamMain {
/*
 * FileInputStream
 * 	������ ���� �� ���Ǵ� Ŭ����
 * 	���Ϸκ��� �����͸� ����Ʈ ��Ʈ������ �о���� �� �����ϰ� ���
 * 	int read(): ���Ͽ��� ���� �����͸� �а� ��ȯ
 * 				�� �̻� ���� �����Ͱ� ������ -1�� ��ȯ
 * 	int read(byte[] b): ���Ͽ��� ����Ʈ �迭 'b'�� �����͸� �а� 
 * 						�����Τ� ���� ����Ʈ ���� ��ȯ 
 * 
 * 	int read(byte[] b, int off, int len):���Ͽ��� ����Ʈ �迭 'b'�� �������� ��ġ���� �ִ� len ����Ʈ ��ŭ �о
 * 										 ������ ���� ����Ʈ ���� ��ȯ
 * 
 * void close(): ���� �ݱ�	
 * 
 * 
 * */
	public static void main(String[] args) {
		FileInputStream fis = null;
		// ��δ� ���� �ۼ��ϰ� �ִ� ��Ŭ���� / ���� �̸� ����
		String fileName = "exam.txt";
		try {
			FileWriter w = new FileWriter(fileName);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fis = new FileInputStream(fileName);
			int data; //���Ͽ��� �����͸� �о�鿩�� ���
			System.out.println("���� ����� ��ü���� ����");
			try {
				data = fis.read();
				System.out.println("���� �б� ����!");
			} catch (IOException e) {
				System.out.println("���� �б� ����!");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}

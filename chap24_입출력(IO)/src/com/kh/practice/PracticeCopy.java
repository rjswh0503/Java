package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�̹������� jpg�Ǵ� png ������ ����ȭ�鿡 ������ �� 
		//����ȭ�鿡�ٰ� ������ ���� 
		//���� �ȿ� ������ �̹��� �����ϱ�
		
		String inputFile = "C:\\Users\\user1\\Desktop\\images.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\img\\Realimage.jpg";
		
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
	
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("������ ���� �Ǿ����ϴ�.");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		File dir = new File(newFolder);
		boolean success = dir.mkdir();
		if(success) {
			System.out.println("���� ���� ����!");
		}else {
			System.out.println("���� ���� ����");
		}
		

		
		
	}

}

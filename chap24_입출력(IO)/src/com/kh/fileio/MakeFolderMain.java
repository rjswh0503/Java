package com.kh.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MakeFolderMain {
	public static void main(String[] args){
		//���� ���� �� ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop//image";//���ϴ� ��� ����
		
		//���������
	
		File folder = new File(folderPath);
		//exists �̹� �����ϴ��� Ȯ��
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop//image\\user1.txt");
			w.write("User ������ ��� ���Դϴ�.");
			w.write("kh �л�");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}

package com.kh.fileio;

import java.io.File;

public class MakeFoldersMain {
	/*
	 mkdirs
	 ����ȭ�� / kh / image 
	 �θ� ���丮�� �������� �ʴ� ��쿡 �߰� ��� ���丮 ���� 
	  */

	public static void main(String[] args) {
		
		String dirPath = "C:\\Users\\user1\\Desktop//parent//child//file";
		
		
		//file ��ü ����
		File dir = new File(dirPath);
		
		//mkdrs �޼��带 ����Ͽ� ���丮 ���� �õ�
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("���� ���� ����!");
			
		}else {
			System.out.println("���� ���� ����!!");
		}
		

	}

}

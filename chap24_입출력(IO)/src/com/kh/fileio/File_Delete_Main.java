package com.kh.fileio;

import java.io.File;

public class File_Delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath+"asdasdasd.txt";
		
		
		
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}
		

	}

}

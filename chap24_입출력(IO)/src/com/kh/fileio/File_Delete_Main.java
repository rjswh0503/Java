package com.kh.fileio;

import java.io.File;

public class File_Delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\img2";
		String originFile = mainPath+"Realdd.jpg";
		
		
		
		
		//���� ��ü ����
		File fileDelete = new File(originFile);
		
		boolean deleted = fileDelete.delete();
		if(deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}
		

	}

}

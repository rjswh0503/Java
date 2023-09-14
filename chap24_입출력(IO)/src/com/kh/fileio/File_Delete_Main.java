package com.kh.fileio;

import java.io.File;

public class File_Delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath+"asdasdasd.txt";
		
		
		
		
		//파일 객체 생성
		File fileToDelete = new File(originFile);
		
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("파일이 성공적으로 삭제되었습니다.");
		}else {
			System.out.println("파일이 삭제되지 않았습니다.");
		}
		

	}

}

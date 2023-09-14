package com.kh.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String newFolder = "C:\\Users\\user1\\Desktop\\img2";
		File dir = new File(newFolder);
		boolean success = dir.mkdir();
		if(success) {
			System.out.println("폴더 생성 성공!");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		String inputFile = "C:\\Users\\user1\\Desktop\\dd.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\img2\\Realdd.jpg";
		
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
	
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일이 복사 되었습니다.");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

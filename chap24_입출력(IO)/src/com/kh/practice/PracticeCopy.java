package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이미지파일 jpg또는 png 파일을 바탕화면에 저장한 후 
		//바탕화면에다가 폴더를 만들어서 
		//폴더 안에 복사한 이미지 저장하기
		
		String inputFile = "C:\\Users\\user1\\Desktop\\images.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\img\\Realimage.jpg";
		
		
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
			
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		File dir = new File(newFolder);
		boolean success = dir.mkdir();
		if(success) {
			System.out.println("폴더 생성 성공!");
		}else {
			System.out.println("폴더 생성 실패");
		}
		

		
		
	}

}

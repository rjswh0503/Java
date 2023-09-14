package com.kh.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
		String inputFile = "C:\\Users\\user1\\Desktop\\images.png";
		String outputFile = "c:\\Users\\user1\\Desktop\\0Realimages.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024]; //1024 바이트 크기의 버퍼 사용
			int byteRead;
			//int byteRead; fis.read(buffer)
			//메서드를 호출하여 버퍼로 읽어들인
			//바이트 수를 저장하는 변수 선언 
			
			//파일을 읽고 복사하는 동안 사용됨
			//fis.read(buffer) 파일에서 데이터를 읽어들이고 
			//fos.write(buffer,0,byteRead) 읽어들인 데이터를 출력함
			//파일의 끝에 도달하면 -1 반환하면서 while문 종료!
			while ((byteRead =fis.read(buffer))!= -1) {
				fos.write(buffer,0,byteRead);
			}
			
			System.out.println("파일이 복사 되었습니다.");
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

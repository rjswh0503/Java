package com.kh.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MakeFolderMain {
	public static void main(String[] args){
		//폴더 생성 할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop//image";//원하는 경로 설정
		
		//폴더만들기
	
		File folder = new File(folderPath);
		//exists 이미 존재하는지 확인
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 생성 되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop//image\\user1.txt");
			w.write("User 정보를 담는 곳입니다.");
			w.write("kh 학생");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}

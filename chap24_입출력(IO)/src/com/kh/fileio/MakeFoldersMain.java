package com.kh.fileio;

import java.io.File;

public class MakeFoldersMain {
	/*
	 mkdirs
	 바탕화면 / kh / image 
	 부모 디렉토리가 존재하지 않는 경우에 중간 모든 디렉토리 생성 
	  */

	public static void main(String[] args) {
		
		String dirPath = "C:\\Users\\user1\\Desktop//parent//child//file";
		
		
		//file 객체 생성
		File dir = new File(dirPath);
		
		//mkdrs 메서드를 사용하여 디렉토리 생성 시도
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("폴더 생성 성공!");
			
		}else {
			System.out.println("폴더 생성 실패!!");
		}
		

	}

}

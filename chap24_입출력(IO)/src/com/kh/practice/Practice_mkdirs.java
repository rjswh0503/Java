package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pmk = new Practice_mkdirs();
		pmk.Practice1();

	}
	public void Practice1() {
		String dirPath = "C:\\Users\\user1\\Desktop//name1//name2";
		
		
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공!");
		}else {
			System.out.println("폴더 생성 실패!");
		}
		
		String dirPath1 = "C:\\Users\\user1\\Java_Workspace//chap25_";
		
		File dir1 = new File(dirPath1); 
		boolean success1 = dir1.mkdir();
		
		if(success1) {
			System.out.println("폴더 생성 성공");
			
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		String dirPath2 = "C:\\Users\\user1\\Desktop//MyMusic//korean//kPop//Group";
			
		File dir2 = new File(dirPath2); 
		boolean success2 = dir2.mkdirs();
		
		if(success2) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		
		
		
		
	}

}

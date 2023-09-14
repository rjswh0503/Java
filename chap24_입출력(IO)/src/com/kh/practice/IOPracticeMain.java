package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPracticeMain {

	public static void main(String[] args) {
	IOPracticeMain op = new IOPracticeMain();
	//op.practice1();
	 op.practice2();
	}
	
	public void practice1() { //파일경로설정해서 파일 만들기
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Documents//파일0319.txt");
			w.write("파일 쓰기 !!!!!!!!!!!!");
			w.close();
			FileReader reader = new FileReader("C:\\Users\\user1\\Documents//파일0319.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferReader.readLine()) != null);
			System.out.println(line);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public void practice2() {
		
		final String folderPath = "C:\\Users\\user1\\Documents//folder3"; //원하는 폴더 경로 
		
		
		//폴더만들기

		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더 생성 성공!");			
		}else {
			System.out.println("폴더가 이미 있습니다.");
		}
		folder.exists();
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Documents//folder3//test1.jmg");
			w.write("test파일 생성");
			w.write("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			w.close();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.kh.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class File_IO_Main {
	
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); // 생성
			//1.파일쓰기
			writer.write("아니야 재미없어");
			writer.close(); // 파일 안에 내용을 다 쓰면 닫기
			
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferdReader.readLine()) != null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
		
		
		
		
		
		
		
		




























		/*
		//만약에 날짜가 오늘 날짜인 폴더가 없을때
		//폴더를 만들고
		String filePath = "설명 적는 란/입출력IO.txt";
		System.out.println("생성");
		
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("파일을 생성했습니다.");
			}else {
				System.out.println("존재하는 파일입니다.");
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		
		String fileName = f.getName();
		
		//FileReader fReader = new FileReader(f,true);
		
		*/


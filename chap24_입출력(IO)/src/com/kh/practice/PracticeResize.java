package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		
		String folderPath = "C:\\Users\\user1\\Desktop\\new\\";
		
		File folder = new File(folderPath);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더 생성 완료");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		folder.exists();
		
		
		
		String path = "C:\\Users\\user1\\Desktop\\img\\";
		String inputImg = path + "Realimage.jpg";
		String outputImg = path +"reSizeimg.jpg ";
		
		int width = 500;
		int height = 500;
		
		try {
			
			BufferedImage  bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			
			BufferedImage bufResizeImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
			bufResizeImg.getGraphics().drawImage(bufResizeImg,0,0, null);
			
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료!");
			
			
		}catch(Exception e) {
			
			System.out.println("이미지 리 사이즈 중 오류 발생 :" + e.getMessage());
		}
		
		
	
		
		
		
		
		// 이미지 하나 불러오기
		//바탕화면에 새로운 폴더 만들기 mkdir
		// 새로 리사이즈 한 이미지를 바탕화면에 새로 만든 폴더안에 저장하기

	}

}

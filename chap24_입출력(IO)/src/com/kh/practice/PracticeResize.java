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
			System.out.println("���� ���� �Ϸ�");
		}else {
			System.out.println("���� ���� ����");
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
			
			System.out.println("�̹��� �������� �Ϸ�!");
			
			
		}catch(Exception e) {
			
			System.out.println("�̹��� �� ������ �� ���� �߻� :" + e.getMessage());
		}
		
		
	
		
		
		
		
		// �̹��� �ϳ� �ҷ�����
		//����ȭ�鿡 ���ο� ���� ����� mkdir
		// ���� �������� �� �̹����� ����ȭ�鿡 ���� ���� �����ȿ� �����ϱ�

	}

}

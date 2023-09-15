package com.kh.fileio;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		//���� �̹��� ���� ��� �����ϰ� �̹��� ���������� ���� ��� ����
		String path = "C:\\Users\\user1\\Desktop\\img2\\";
		String inputImg = path+"Realdd.jpg";
		String ouputImg = path+"reSizeCute.jpg";
		
		// ���������� �̹��� ũ�� ����
		int width = 500; //���� ����
		int height = 500; //���� ����
		
		try {
			//���� �̹����� �о����
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			//���ο� ũ��� �̹��� ��������
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			//BufferedImage ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(bufResizeImg,0,0, null);
			
			//��������� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(bufResizeImg, "jpg", new File(ouputImg));
			
			System.out.println("�̹��� �������� �Ϸ�!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� �� ������ �� ���� �߻� :" + e.getMessage());
		}

	}

}
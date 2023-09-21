package com.kh.finalSample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMain {
	public void fileSave(String fileName, Food food) {
		try {
			FileOutputStream fOStream = new FileOutputStream(fileName);
			
			
			ObjectOutputStream objStream = new ObjectOutputStream(fOStream);
			//���Ͽ� food��ü�� ���
			objStream.writeObject(food);
			
			objStream.close();
			fOStream.close();
			
			
			System.out.println("Food ��ü�� ���Ͽ� �����߽��ϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		FileMain fm = new FileMain();
		Food foodSample = new Food("���",20);
		fm.fileSave("food.txt", foodSample);
	}

}
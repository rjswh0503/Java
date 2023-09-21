package com.kh.finalSample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMain {
	public void fileSave(String fileName, Food food) {
		try {
			FileOutputStream fOStream = new FileOutputStream(fileName);
			
			
			ObjectOutputStream objStream = new ObjectOutputStream(fOStream);
			//파일에 food객체를 기록
			objStream.writeObject(food);
			
			objStream.close();
			fOStream.close();
			
			
			System.out.println("Food 객체를 파일에 저장했습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		FileMain fm = new FileMain();
		Food foodSample = new Food("사과",20);
		fm.fileSave("food.txt", foodSample);
	}

}
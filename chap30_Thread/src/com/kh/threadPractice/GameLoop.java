package com.kh.threadPractice;

import java.util.Random;

 public class GameLoop  implements Runnable {
	  private static boolean isGameOver = false;
	  
	  public static void setGameOver(boolean isGameOver) {
		  GameLoop.isGameOver = isGameOver;
	  }
	 @Override
	
	 public void run() {
		 while(!isGameOver) {
			 int randomValue = new Random().nextInt(10);
			 System.out.println("임의의 숫자 :" + randomValue);
			 
			 
			 try {
				 
				 Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		 }
		 System.out.println("게임종료");
	 }
}

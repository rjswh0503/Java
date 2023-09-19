package com.kh.threadPractice;

import java.io.IOException;
import java.util.Random;

import com.kh.threadMain.SimpleGame;
import com.kh.threadMain.SimpleGame.Gm;

public class GameMain  {
	  static boolean isGameOver = false;
	
	
	public static void main(String[] args) {
		//외부 클래스의 인스턴스를 생성
		GameMain gm = new GameMain();
		
		// 게임 루프 스레드 시작
		Thread GameLoop = new Thread(new GameLoop());
		GameLoop.start();
		
		
		System.out.println("게임을 종료 하려면 Enter를 누르세요.");
		// 게임 종료 조건 : 플레이어가 Enter 키를 누르면 게임 종료
		try {
			
			//사용자가 키보드로 입력한 바이트를 읽음
			//사용자가 Enter키를 누를 때 까지 프로그램 일시 중지
			System.in.read();
			
			isGameOver = true;
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

		
	}

}

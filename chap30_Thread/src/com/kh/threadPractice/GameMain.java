package com.kh.threadPractice;

import java.io.IOException;
import java.util.Random;

import com.kh.threadMain.SimpleGame;
import com.kh.threadMain.SimpleGame.Gm;

public class GameMain  {
	  static boolean isGameOver = false;
	
	
	public static void main(String[] args) {
		//�ܺ� Ŭ������ �ν��Ͻ��� ����
		GameMain gm = new GameMain();
		
		// ���� ���� ������ ����
		Thread GameLoop = new Thread(new GameLoop());
		GameLoop.start();
		
		
		System.out.println("������ ���� �Ϸ��� Enter�� ��������.");
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			
			//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read();
			
			isGameOver = true;
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

		
	}

}

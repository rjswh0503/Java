package com.kh.gettersetter.goodEaxm;

import com.kh.gettersetter.PlayerCharacter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		
		
		player1.setName("KH");
		player1.ValidName();
		player1.setHealth(-10);// -10체력을 저장해주고
		player1.ValidHealth(); // -10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		
		
	
		player1.display();
		
		//GameRun 에서 player2에다가 valid를 적용하기
		
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName("");
		player2.ValidName();
		player2.setHealth(-20);
		player2.ValidHealth();
		player2.setAttackPower(-50);
		player2.ValidAttackPower();

		
		
		player2.display();
		
		/*
		System.out.println("attack!!! 후");
		player1.attack(player2);
		// player2.attack(player1);
		 * 
		 */
		
		
		

	}

}

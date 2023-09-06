package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		
		
		
		player1.setName("KH");
		player1.setHealth(100);
		player1.setAttackPower(80);
		
		
	
		player1.displayInfo();
		
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("ㅎㅎㅎ");
		player2.setHealth(100);
		player2.setAttackPower(70);
		
		
		player2.displayInfo();
		
		System.out.println("attack!!! 후");
		player1.attack(player2);
		// player2.attack(player1);

		
		

	}

}

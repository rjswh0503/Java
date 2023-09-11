package com.kh.goodEaxm.game;

public class GameModel {
	private int secretNumber;
	private int attempts;
	
	
	
	
	public GameModel() {
		secretNumber = (int) (Math.random()* 10)+1;
		attempts = 0;
	}
	
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts++;
	}
	public boolean inCorrectGuess(int guess) {
		incrementApttempts();
		return guess == secretNumber;
	}

	
	

}

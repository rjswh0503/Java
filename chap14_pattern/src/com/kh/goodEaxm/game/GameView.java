package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = ("");
	private String Game = ("1에서 100 사이의 숫자를 맞춰보세요");
	private String Intput = ("추측한 숫자를 입력하세요 : ");
	private String Number = ("숫자를 맞췄습니다.");
	private String Again = ("틀렸습니다. 다시 시도하세요.");
	private String Time = ("시도횟수 : ");
	private String Over = ("게임종료!");
	
	
	public void displayMessage() {
		 
		System.out.println(StartMsg);
		System.out.println(Game);
		
		
	}
	//숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임종료
	
	//1.숫자 추측하는 값 입력하기
	
	public void displayGuessPromt() {
		System.out.print(Intput);
	}
	
	public void displayCorrectGuess() {
		System.out.println(Number);
	}
	public void displayInCorrectGuess() {
		System.out.println(Again);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println( Time + attempts);
		
	}
	public void displayGameOver() {
		System.out.println(Over);
	}

}

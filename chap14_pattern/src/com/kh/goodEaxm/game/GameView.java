package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = ("");
	private String Game = ("1���� 100 ������ ���ڸ� ���纸����");
	private String Intput = ("������ ���ڸ� �Է��ϼ��� : ");
	private String Number = ("���ڸ� ������ϴ�.");
	private String Again = ("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
	private String Time = ("�õ�Ƚ�� : ");
	private String Over = ("��������!");
	
	
	public void displayMessage() {
		 
		System.out.println(StartMsg);
		System.out.println(Game);
		
		
	}
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ��������
	
	//1.���� �����ϴ� �� �Է��ϱ�
	
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

package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	//		String  
	// private int a; = 인스턴스 변수 
	// static int a; = controller가 아닌 main에서 사용할 수 있는 녀석으로 바뀜 
	private GameModel model; // 참조변수
	private GameView   view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
		
		
		
	}
	
	public void runGame() {
		//최종 메세지 보여주는 
		view.displayMessage();
		//스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);
		
		//숫자 추측하는 값을 입력하자
		view.displayGuessPromt();;
		int guess = sc.nextInt();
		
		//만약에 컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
		while(true) { //false가 될 때 까지 반복
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				break;
				
			}else {
				//컴퓨터가 생각한 숫자와 내가 입력한 숫자가 틀렸을 때 view
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAttempts());	
			}
			
		}
		view.displayAttempts(guess);
		
		
		
		
		
				
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		
		c.runGame();
		
		
	}
	

}








/*
				//	stack
//public static void main(String[] args){
		GameModel sss = new GameModel();======// heap
		
		
public static void main(String[] args){
	GameModel = new GameModel(); 객체 생성
	
	객체가 인스터스 보다 좀 더 우위
	
	객체가 인스터스 인스터스는 객체의 하위항목 중 하나 
	
	객체 안에 인스턴스가 있음 
	누군가가 만들어 놓은 

	객체의 분신은 인스턴스 1,2,3
	
	
	내 컴퓨터 안에
		설치된 프로그램(메모장,저장한 사진)  stack
		항상 준비되어 있음
		
		
		
		롤,배그,오버워치, 포토샵 ,인스타그램, 
		카카오톡,텔레그램,그림판  			//  heap
		
		
		String url = "https://"
				System.out.println(url);
		
				url += "naver.com"
				
		 			 
		 		 
		 			 
		
	
		


}
		


}


*/











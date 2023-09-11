package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	//		String  
	// private int a; = �ν��Ͻ� ���� 
	// static int a; = controller�� �ƴ� main���� ����� �� �ִ� �༮���� �ٲ� 
	private GameModel model; // ��������
	private GameView   view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
		
		
		
	}
	
	public void runGame() {
		//���� �޼��� �����ִ� 
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		//���� �����ϴ� ���� �Է�����
		view.displayGuessPromt();;
		int guess = sc.nextInt();
		
		//���࿡ ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		while(true) { //false�� �� �� ���� �ݺ�
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				break;
				
			}else {
				//��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view
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
	GameModel = new GameModel(); ��ü ����
	
	��ü�� �ν��ͽ� ���� �� �� ����
	
	��ü�� �ν��ͽ� �ν��ͽ��� ��ü�� �����׸� �� �ϳ� 
	
	��ü �ȿ� �ν��Ͻ��� ���� 
	�������� ����� ���� 

	��ü�� �н��� �ν��Ͻ� 1,2,3
	
	
	�� ��ǻ�� �ȿ�
		��ġ�� ���α׷�(�޸���,������ ����)  stack
		�׻� �غ�Ǿ� ����
		
		
		
		��,���,������ġ, ���伥 ,�ν�Ÿ�׷�, 
		īī����,�ڷ��׷�,�׸���  			//  heap
		
		
		String url = "https://"
				System.out.println(url);
		
				url += "naver.com"
				
		 			 
		 		 
		 			 
		
	
		


}
		


}


*/











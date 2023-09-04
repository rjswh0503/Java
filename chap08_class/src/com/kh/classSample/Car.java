package com.kh.classSample;

public class Car {
	//1. 상태 필드 맴버변수
	String brand;        //브랜드    
	String model;    	 // 모델           // 맴버 변수 
	int speed;    	     // 속도
	boolean engineOn;    // 엔진 상태
	
	
// =======================================================================
//  맴버변수 밑에는 모두 메서드로 정의
	
	
	
	
	//2. 생성자는 메서드의 한가지 일종
	public Car(String brand, String model) { // 차를 볼 때 필수로 넣을 파라미터는 브랜드와 모델 
		
		
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
		System.out.println("Car 정의");
	}
	
	
	
	
	
	

	


	//엔진 시작 메서드
	public void startEngine() { //
		//만약에 엔진이 true면 엔진 시동
		
		if(engineOn) {
			System.out.println("엔진을 시동합니다."); //출력 메소드 작성
			
		}else {// 만약에 엔진이 false면 이미 엔진 켜져있다.
			System.out.println("이미 엔진이 켜져 있습니다.");
		}
		
		
	}
	
	//가속 메서드
		public void acclerate(int amount) {
			if(engineOn) {
				//엔진이 true면 지금 속도가 얼마다.	
				System.out.println("속도 얼마입니다.");
			}else {
				System.out.println("속도를 알 수 없음.");
				// 엔진이 false면 엔진이 꺼져 있어 속도를 낼 수 없다		
				
			}
		}

}

package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Random  : 난수를 생성하기 위해 사용되는 클래스
    난수 : 무작위로 만들어진 수
 * */

public class RandomMain {

	public static void main(String[] args) {
		RandomMain rdm = new RandomMain();
		//rdm.RandomExam();
		rdm.Lotto();
	

	}
	public void Lotto() {
	Random rd = new Random(); // 랜덤 객체 생성
	// ArrayList 사용해서 장바구니로 담기
	
	
	List<Integer> lottoNum = new ArrayList<>();
	//중복을 피하기 위해 set을 사용할 수 있음
	//6개의 숫자만 들어갈 것 
	int six = 6; // 로또 번호 몇 개 뽑을 것 인지 설정 
	while(lottoNum.size() < six) { //0,1,2,3,4,5
		// 1~ 45 범위를 지정해서 난수를 생성
		int ranNumber = rd.nextInt(45)+1;
		
		// 0 ~ 44 자리의 랜덤으로 번호 하나
		
		//존재하는지 여부 중복x
		//중복된 값이 list에 저장될 수 있음
		if(!lottoNum.contains(ranNumber)) {//!가 사라지면 값이 존재할 때만 되는 것이기 떄문에 무한루프
			lottoNum.add(ranNumber);
		}
		
		
		
	}
	System.out.println("로또 번호 : " +lottoNum);
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	public void RandomExam() {
			//로또번호 생성기
		Random rd = new Random(); // 랜덤 객체 생성
		
			//1. 정수 범위 내에서 랜덤인 난수를 만들어야 됨
			int ranInt = rd.nextInt(100); //0 ~ 99 사이에서 1개 
			System.out.println(ranInt);
		
		
			//2. 실수 범위 내에서 랜덤인 난수를 만듬
			float ranf = rd.nextFloat(); //0.0 ~ 1.0  
			System.out.println(ranf);
		
		
			//3. 불리언 값 랜덤으로 생성
			
			boolean ranB = rd.nextBoolean();
			System.out.println(ranB);
	}

}

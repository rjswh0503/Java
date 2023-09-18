package com.kh.lteratorpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain prm = new PracticeMain();
		//prm.practice1();
		prm.practice2();
		
		
	}	
		
		public void practice1() {
			//ArrayList 생성 및 요소 추가 
			ArrayList<Integer> score = new ArrayList<>();
			score.add(30);
			score.add(70);
			score.add(100);
			score.add(54);
			score.add(44);
			
			//Iterator 생성 
			
			
			Iterator<Integer> iter = score.iterator();
			
			//Iterator 를 사용하여 요소 반복 
			while(iter.hasNext()) {
				Integer scr = iter.next();
				System.out.println("Score : " + scr);
			}
			
		}
		
		public void practice2() {
			
			Set<String> fruit = new HashSet<>();
			
			fruit.add("사과");
			fruit.add("바나나");
			fruit.add("딸기");
			
			Iterator<String> iter = fruit.iterator();
			
			while(iter.hasNext()) {
				String fruit1 = iter.next();
				System.out.println("과일 :" + fruit1);
			}
			
			iter = fruit.iterator(); // 다시 Iterator 초기화
			
			while(iter.hasNext()) {
				String fruit1 = iter.next(); 
				//만약에 바나나가 돌아오면 삭제
				if(fruit1.equals("바나나")) {
					iter.remove();
				}
				System.out.println("과일 : " +  fruit1);
			}
			
			//삭제후 다시 ArrayList로 출력 
			//향상된 for문 사용
			System.out.println("삭제 후 출력 : ");
			for(String f:fruit) {
				System.out.println(f);
			}
			
	   }	
		
}



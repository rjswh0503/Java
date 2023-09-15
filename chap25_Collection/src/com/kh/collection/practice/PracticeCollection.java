package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		//pc.practice1();
		//pc.pracitce2();
		pc.practice3();
	}
	
	
	public void practice1() {
		
		List<String> myList = new ArrayList<>();
		
		
		System.out.println("음식 리스트 : ");
		myList.add("피자");
		myList.add("치킨");
		myList.add("삼겹살");	
		myList.add("라면");
		myList.add("라면");
		
		for(String food:myList) {
			System.out.println(food);
		}
		
		System.out.println("================================");
	}
	

	public void pracitce2() {
		
		Set<String> mySet = new HashSet<>(); // 순서를 보장하지 않는 집합 데이터 구조 제공
		
		
		System.out.println("동물 리스트 : ");
		mySet.add("고양이");
		mySet.add("강아지");
		mySet.add("사자");
		mySet.add("도마뱀");
		mySet.add("도마뱀");
		
		for(String animal : mySet) {
			System.out.println(animal);
		}
		
		
	}
	
	//Map 예제
	
	public void practice3() {
		
		//키와 값을 이용해서 map put 한다음 향상된 포문으로 출력해보기 
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("숫자1", 47);
		myMap.put("숫자2", 50);
		myMap.put("숫자3", 45);
		myMap.put("숫자4", 75);
		myMap.put("숫자5", 46);
		myMap.put("숫자6", 999);
		myMap.put("숫자5", 46);
		
		for(String numbers : myMap.keySet()) {
			int code = myMap.get(numbers);
			System.out.println(numbers + " : "  + code);
		}
		
				
		
	}
	
			
	
	
		
		

	

}

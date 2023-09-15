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
		
		
		System.out.println("���� ����Ʈ : ");
		myList.add("����");
		myList.add("ġŲ");
		myList.add("����");	
		myList.add("���");
		myList.add("���");
		
		for(String food:myList) {
			System.out.println(food);
		}
		
		System.out.println("================================");
	}
	

	public void pracitce2() {
		
		Set<String> mySet = new HashSet<>(); // ������ �������� �ʴ� ���� ������ ���� ����
		
		
		System.out.println("���� ����Ʈ : ");
		mySet.add("�����");
		mySet.add("������");
		mySet.add("����");
		mySet.add("������");
		mySet.add("������");
		
		for(String animal : mySet) {
			System.out.println(animal);
		}
		
		
	}
	
	//Map ����
	
	public void practice3() {
		
		//Ű�� ���� �̿��ؼ� map put �Ѵ��� ���� �������� ����غ��� 
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("����1", 47);
		myMap.put("����2", 50);
		myMap.put("����3", 45);
		myMap.put("����4", 75);
		myMap.put("����5", 46);
		myMap.put("����6", 999);
		myMap.put("����5", 46);
		
		for(String numbers : myMap.keySet()) {
			int code = myMap.get(numbers);
			System.out.println(numbers + " : "  + code);
		}
		
				
		
	}
	
			
	
	
		
		

	

}

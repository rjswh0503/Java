package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {
	public static void main(String[] args) {
		
		//List
		List<String> myList = new ArrayList<>();
		myList.add("���");
		myList.add("�ٳ���");
		myList.add("����");
		
		System.out.println("List: " );
		//���� for�� Ȱ���ؼ� ���
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		
		
		
		//Set ����
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(2); // �ߺ��� ��Ҵ� ������� ����
		
		
		for(Integer number : mySet) {
			System.out.println(number);
		}
		
		
		
		
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("�ѱ�", 1);
		myMap.put("�̱�", 2);
		myMap.put("������", 45);
		myMap.put("�߱�", 245);
		myMap.put("�Ϻ�", 23);
		myMap.put("����", 24);
		myMap.put("������", 42);
		
		
		
		for(String country : myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
		}
		
		
		
		
		
	
	}

}

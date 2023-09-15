package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		//������ �����͸� �����ϴ� ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//���ڿ� �����͸� �����ϴ� ArrayList
		
		ArrayList<String> StrList = new ArrayList<>();
		StrList.add("Hello");
		StrList.add("World");
		
		//���ʸ� �޼��带 ����ؼ� ��� ���
		
		
		printList(intList);
		printList(StrList);
		
		
		
		

	}

	
	
	public static <T> void printList(ArrayList<T> list) {
		for(T item : list) {
			System.out.println(item);
		}
	}
}

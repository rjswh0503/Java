package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain ptMain = new PracticeMain();
		//ptMain.practice1();
		ptMain.practice2();
		
		//Stirng integer T ����Ͽ� ���
		

	}
	
	public void practice1() {
		
		ArrayList<Integer> intList  = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("����1");
		strList.add("����2");
		strList.add("����3");
		
		printList(intList);
		printList(strList);
		
	}
	
	public static <T> void printList(ArrayList <T> list) {
		for(T item:list) {
			System.out.println(item);
		}
	}

	
	
	
	public void practice2() {
		Box<Integer> intbox = new Box<>();
		intbox.put(44);
		intbox.put(17);
		intbox.put(999);
		int intvalue = intbox.get();
		
		
		
		Box<String> Strbox = new Box<>();
		Strbox.put("Java");
		Strbox.put("JavaScript");
		Strbox.put("Database");
		Strbox.put("python");
		
		String strvalue = Strbox.get();
		
		
		System.out.println("Int value : " + intvalue);
		System.out.println("String value : " + strvalue);
		
		
		
		
		
		
		
		
		
		
		
		//box ��ü�� com.kh.genericspractice; �ؿ� ����
		//������ �����͸� �����ϴ� box �ν��Ͻ� ����
		//���ڿ� �����͸� �����ϴ� box �ν��Ͻ� ����
		//�� �� ���
		//���� for��  �̿��ؼ� �� ��� ���
		
	}
	
	
}

		

package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEaxm {

	public static void main(String[] args) {
		//List 인터페이스 LinkedList 객체 활용해서 값넣고 출력
		//String 값 넣고 수정 삭제 출력 
		
		//LinkedList 객체 new LinkedList 객체
		//int 값 넣고 수정 삭제 출력
		
		
		List<String> linkedlist = new LinkedList<>();
		
		linkedlist.add("치킨");
		linkedlist.add("피자");
		linkedlist.add("햄버거");
		System.out.println("linkedlist : " + linkedlist);
		linkedlist.set(1, "삼겹살");
		System.out.println("수 정 후 : " + linkedlist);
		linkedlist.remove(2);
		System.out.println("삭제 후 : " + linkedlist);
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		
		List<Integer> linkedlist1 = new LinkedList<>();
		
		linkedlist1.add(1);
		linkedlist1.add(2);
		linkedlist1.add(3);
		System.out.println("linkedlist1 : " + linkedlist1);
		linkedlist1.set(0,4);
		System.out.println("수정 후 : " + linkedlist1);
		linkedlist1.remove(1);
		System.out.println("삭제 후 : " + linkedlist1);
		
		
		
		
		
		
		
		
		

	}

}

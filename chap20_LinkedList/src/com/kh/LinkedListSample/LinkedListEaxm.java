package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEaxm {

	public static void main(String[] args) {
		//List �������̽� LinkedList ��ü Ȱ���ؼ� ���ְ� ���
		//String �� �ְ� ���� ���� ��� 
		
		//LinkedList ��ü new LinkedList ��ü
		//int �� �ְ� ���� ���� ���
		
		
		List<String> linkedlist = new LinkedList<>();
		
		linkedlist.add("ġŲ");
		linkedlist.add("����");
		linkedlist.add("�ܹ���");
		System.out.println("linkedlist : " + linkedlist);
		linkedlist.set(1, "����");
		System.out.println("�� �� �� : " + linkedlist);
		linkedlist.remove(2);
		System.out.println("���� �� : " + linkedlist);
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		
		List<Integer> linkedlist1 = new LinkedList<>();
		
		linkedlist1.add(1);
		linkedlist1.add(2);
		linkedlist1.add(3);
		System.out.println("linkedlist1 : " + linkedlist1);
		linkedlist1.set(0,4);
		System.out.println("���� �� : " + linkedlist1);
		linkedlist1.remove(1);
		System.out.println("���� �� : " + linkedlist1);
		
		
		
		
		
		
		
		
		

	}

}

package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		
		ArrayList<String> toDo = new ArrayList();
		
		
		
		
		toDo.add("���� �ϱ�");
		System.out.println("����1�� �߰� : " + toDo);
		toDo.add("���� �ϱ�");
		System.out.println("����2 �߰� : " + toDo);
		toDo.add("�� �Ա�");
		System.out.println("����3 �߰� : " + toDo);
		
		int size = toDo.size();
		System.out.println("���� ���� :" + size);
		
		
		toDo.set(1, "�ڵ� �����ϱ�");
		System.out.println("����üũ : " + toDo);
		toDo.set(2, "���ڱ�");
		System.out.println("����üũ : " + toDo);
		
		
		
		
		toDo.remove(0);
		System.out.println("�����ϱ� ���� Ȯ�� : " + toDo);
		
		
		
		for(String adadada:toDo) {
			System.out.println("���� ��� : " + adadada);
		}
		
		
		//�ߺ��� ���� ����
	
		//ArrayList ���� 
		
		toDo.clear();
		System.out.println("��� ���� ���� : " + toDo);
		
		
		
	}

}

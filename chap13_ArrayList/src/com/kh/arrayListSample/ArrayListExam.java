package com.kh.arrayListSample;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		//�� ArrayList ����
		
		ArrayList<String> fruits = new ArrayList();
		
		
		//��� �߰�
		
		fruits.add("���");
		System.out.println("��� �߰� : " + fruits);
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰�: " + fruits);
		fruits.add("����");
		System.out.println("���� �߰� : " + fruits);
		
		
		//��� ���� Ȯ��
		
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		
		//�ε����� ����Ͽ� ��ҿ� ����
		System.out.println("��� ���� ���");
		
	//  for(����ǵ�����Ÿ�� �츮�� ���� ������ : ����� ����ִ� ������
		for(String             fruit :		 fruits) {
			System.out.println(fruit);
		}
		
		
		
		String firstFruits = fruits.get(0);
		System.out.println("ù ��° ���� : " + firstFruits);
		String firstFruits2 = fruits.get(2);
		System.out.println("�� ��° ���� : " + firstFruits2);
		
		//��� ����
		
		fruits.set(2, "ü��");
		System.out.println("����üũ : " + fruits);
		
		
		//��� ����
		
		fruits.remove(1);
		System.out.println("�ٳ��� ����Ȯ�� : " + fruits);
		
		
		//ArrayList ��ȸ�ؼ� ������
		
		
		
		//ArrayList ����
		
		fruits.clear();
		System.out.println("��� ������ ���� : " + fruits);
		
		
	}

}

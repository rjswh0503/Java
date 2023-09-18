package com.kh.lteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
	
	/*
	 Iterator 
	 �÷��� (������ �׷�)�� �ݺ�(Iterator)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
	 �پ��� �÷��� ����(ArrayList, HashSet)� ����� �� ����
	 �÷����� ��Ҹ� �а� �����ϴµ� ���
	 �÷����� ũ�⳪ ���� ������ ������� ��ҿ� ������ �� ���� 
	 * */

	public static void main(String[] args) {
		
		//ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�˼�");
		music.add("�߶��");
		music.add("����");
		
		//Iterator ����
		
		Iterator<String> iter = music.iterator();
		
		
		//Iterator �� ����Ͽ� ��� �ݺ�
		
			while(iter.hasNext()) {
				String msc = iter.next();              // msc ���� ����
				System.out.println(msc);
			}
			
			//Iterator ����
			iter = music.iterator(); // �ٽ� Iterator�� �ʱ�ȭ 
			
			while (iter.hasNext()) {
				String msc = iter.next();
				//���࿡ ������ ���ƿ��� �����ϱ� ����
				if(msc.equals("����")){
					iter.remove(); // ���� ��� ����
				}
				System.out.println(msc);
				
			}
			//���� �� ArrayList ���
			System.out.println("���� �� ��� : " );
			for(String a : music) {
				System.out.println(a);
			}

	}

}

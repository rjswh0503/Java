package com.kh.lteratorpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain prm = new PracticeMain();
		//prm.practice1();
		prm.practice2();
		
		
	}	
		
		public void practice1() {
			//ArrayList ���� �� ��� �߰� 
			ArrayList<Integer> score = new ArrayList<>();
			score.add(30);
			score.add(70);
			score.add(100);
			score.add(54);
			score.add(44);
			
			//Iterator ���� 
			
			
			Iterator<Integer> iter = score.iterator();
			
			//Iterator �� ����Ͽ� ��� �ݺ� 
			while(iter.hasNext()) {
				Integer scr = iter.next();
				System.out.println("Score : " + scr);
			}
			
		}
		
		public void practice2() {
			
			Set<String> fruit = new HashSet<>();
			
			fruit.add("���");
			fruit.add("�ٳ���");
			fruit.add("����");
			
			Iterator<String> iter = fruit.iterator();
			
			while(iter.hasNext()) {
				String fruit1 = iter.next();
				System.out.println("���� :" + fruit1);
			}
			
			iter = fruit.iterator(); // �ٽ� Iterator �ʱ�ȭ
			
			while(iter.hasNext()) {
				String fruit1 = iter.next(); 
				//���࿡ �ٳ����� ���ƿ��� ����
				if(fruit1.equals("�ٳ���")) {
					iter.remove();
				}
				System.out.println("���� : " +  fruit1);
			}
			
			//������ �ٽ� ArrayList�� ��� 
			//���� for�� ���
			System.out.println("���� �� ��� : ");
			for(String f:fruit) {
				System.out.println(f);
			}
			
	   }	
		
}



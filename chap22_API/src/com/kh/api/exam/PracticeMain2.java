package com.kh.api.exam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		pm.practice1();
		pm.practice2();
		pm.practice3();
		pm.practice4();
		pm.practice5();
		
	}
	
	public void practice1() {
		//���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("����");//������ ������
		sb.append("������");
		sb.append("������");
		System.out.println(sb.toString());
		System.out.println("==============");
	}
	public void practice2() {
		//���ڿ� ������ ���� ������ ������ reverse 
		String str = "���� ������ �� ����";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println("==============");
	}
	public void practice3() {
		//���ڿ� ���� 
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(10 , "����");
		sb.insert(8, "!!!!!!!!");
		System.out.println(sb.toString());
		System.out.println("==============");
		
	}
	public void practice4() {
		//���ڿ� ��ü replace(,,)
				String str = "���� ������ ������";
				StringBuffer sb = new StringBuffer(str);
				sb.replace(2, 4, "good");
				System.out.println(sb.toString());
				System.out.println("==============");
				
	
		
		
	}
	public void practice5() {
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.delete(2, 4);
		System.out.println(sb.toString());
		
	}
	

}

package com.kh.api.Exam1;

public class ObjectMain {

	public static void main(String[] args) {
		// Object Ŭ������ ����
		
		//��ü ����
		Object obj = new Object();
		Object obj2 = new Object();
		
		//equals() �޼ҵ带 ����ؼ� �� ��ü ��
		boolean isEquals = obj.equals(obj2);
		System.out.println("obj�� obj2�� ������? :" + isEquals);
		System.out.println("=======================");
		System.out.println();
		//hashCode()�޼��带 ����Ͽ� ��ü�� �ؽ� �ڵ� ���
		int hashCode1 = obj.hashCode();
		int hashCode2 = obj2.hashCode();
		System.out.println("obj�� �ؽ��ڵ� : " + hashCode1);
		System.out.println("obj2�� �ؽ��ڵ� : " + hashCode2);
		
		System.out.println("=======================");
		System.out.println();
		//toString() �޼��带 ����Ͽ� ��ü�� ���ڿ��� ǥ��
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj�� ���ڿ� : " + objString);
		System.out.println("obj2�� ���ڿ� : " + obj2String);
		
		System.out.println("=======================");
		System.out.println();
		//getClass() �޼ҵ带 ����Ͽ� ��ü�� Ŭ���� ���� ���
		Class<?> classOfobj = obj.getClass();
		Class<?> classOfobj2 = obj2.getClass();
		System.out.println("obj Ŭ���� " + classOfobj.getName());
		System.out.println("obj2 Ŭ���� " + classOfobj2.getName());
		System.out.println("=======================");
		System.out.println();
		
		

	}

}

package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		//������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intbook = new Book<>();
		intbook.put(42);
		intbook.put(15);
		int intvalue = intbook.get(); //�� ��ȯ �ʿ� ����
		
		
		
		//���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("python");
		strBook.put("c++");
		strBook.put("javaScript");
		
		String strValue = strBook.get();// �� ��ȯ �ʿ� ���� 
		
		
		System.out.println("Int value : "  + intvalue);
		System.out.println("String value : " + strValue);
	}
	
	
	
	

}

package com.kh.api.exam;

public class ReplaceMain {

	
	public static void main(String[] args) {
		ReplaceMain replace = new ReplaceMain();
		//replace.replace1();
		//replace.replace2();
		replace.replace3();
		replace.replace4();
		replace.replace5();
		replace.replaceAll();

	}
	
	public void replace1() {
		
		String input = "Hello,world!";
		String reInput = input.replace(" " , " - ");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 :  " + input2);
		
	}
	
	public void replace2() {
		String input = "Hello world!";
		String reInput = input.replace("world", "java");
		System.out.println(reInput);
		
	}
	public void replace3() {
		String originName = "Hello world";
		//1.o�� �����ִ� ���ڿ��� x�� �����ϱ�
		String reoriginName = originName.replace("o", "x");
		System.out.println(reoriginName);
	}
	public void replace4() {
		String originString = "The quick brown fox jups over the lazy dog";
		String reoriginString = originString.replace("fox", "cat");
		System.out.println(reoriginString);
		
		//fox - > cat
	}
	public void replace5() {
		String originString1 = "The quick brown fox jups over the lazy dog";
		//��� ���� �����ϱ�
		String reoriginString1 = originString1.replace(" ","");
		System.out.println(reoriginString1);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace ��� replaceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ���
		String reAllstr = originString.replaceAll("(?i)world", "");
		System.out.println(reAllstr);
	}

}

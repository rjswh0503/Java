package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionB();
		//exmain.ExceptionC();
		exmain.ExceptionExam();
		
	
	}
	
	
		public void ExceptionA() {
		try {
			int result  = 10 / 0; //0���� ������ �õ�
			System.out.println("Result : " + result);
			
		}catch(ArithmeticException e) {
			/*
			 ArithmeticException : �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e : e �� �츮�� ������ ������ 
			 e�� ������ ������ �޼����� getMessge()�� ���� �޴´�. 
			 * */
			System.out.println("��� �������� ���� �߻��� ����!!" + e.getMessage());
		}
	}
		public void ExceptionB() {

	try {
		String txt = null;
		int lenght = txt.length();
		//������ ���µ� text�� ���� ���ڿ��� ���̸� ���
		System.out.println("���ڿ� ���� : " + lenght);
		
		
	}catch(NullPointerException abc){
		System.out.println("�� ����!!!" + abc.getMessage());
		
	}
	
	
	
	
	
	
	
	}
		public void ExceptionC() {
					//850904
			try {
			String juminNumber = "�ȿ���904";
			int number = Integer.parseInt(juminNumber); // ���ڿ��� ������ ��ȯ �õ�
			System.out.println("���� : " + number);	//�ȿ� String�� ����ֱ� ������ ������ ���� ����
			}catch(NumberFormatException gogo) {
				System.out.println("���ڸ� �־��ּ���.");
				System.out.println("NumberFormatException �߻� : " + gogo.getMessage());
				}
	
		}	
		public void ExceptionExam() {
			try {
				int[] numbers = {1,2,3,4,5};
				int index = 7; //��ȿ���� ���� index �ҹ�
				int result = numbers[index]; //�迭 ��ҿ� ����
				System.out.println("Result : " + result );
			}catch(ArrayIndexOutOfBoundsException e) { //���� ����
				//�迭 �ε��� ������ ����� �� �߻��ϴ� ���� ó��
				System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻� !!");
		} catch(Exception e) {
			//�ٸ� ���ܸ� ó���� �� �ִ� ����ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
		} finally {
			//finally�� �׻� ����Ǵ� ���
			System.out.println("finally ����!");
		}
			System.out.println("���η��� ����Ǿ����ϴ�.");
	}
}




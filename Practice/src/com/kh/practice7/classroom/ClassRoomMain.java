package com.kh.practice7.classroom;

public class ClassRoomMain {

	public static void main(String[] args) {
		
		//���ڿ� �迭�� ���� �� �ʱ�ȭ
		
		//1. �л� �̸��� �����ϴ� ���ڿ� �迭 �����ϰ� �ʱ�ȭ
		String[] student = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","����ǥ","ȫ����"};
		//2. �� �д��� ��� ���� ������ ���� row�� ���� cols�� �� ����
		int rows = 3;
		int cols = 2;
		
		//3. �� ���� ������ ���ڿ� �迭 classRoom1 classRoom2 ���� �� �ʱ�ȭ
		//�� �д��� �ڸ� ��ġ�� ��Ÿ�� 
		String[][] classRoom1 = new String[rows][cols];
		String[][] classRoom2 = new String[rows][cols];
		
		//4. �л� �迭�� �ݺ�ó���ϱ� ���� �ݺ���
		// i ������ �л� �ε��� 
		for(int i = 0; i <student.length;i++) {
			int row = i % rows;  //row �� �ε���
			int col = i / rows; // col �� �ε��� 
			if(col % 2 == 0) { // ���� ���� ¦�� ������ Ȯ��
							   // ¦�� ���� ù ��° �дܿ� �ش� 
				classRoom1[row][col/2] = student[i]; // col/2 �� �ε����� ������ ������ ��ġ 
				
		}else { // ���� ���� Ȧ�� ���� ��� �� ��° �дܿ� �ش� 
			classRoom2[row][col/2] = student[i];
		}
	}	
		System.out.println("1�д�");
		printClassRoom(classRoom1);
		System.out.println("2�д�");
		printClassRoom(classRoom2);

	}
	//classRoom ��� �޼ҵ� �д� �ڸ� ��ġ�� ����ϴ� ����
	public static void printClassRoom(String[][] classRoom) {
		//���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ� 
		for(int row = 0; row < classRoom.length;row++) {
			//���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ� 
			for(int col = 0; col < classRoom[0].length; col++) {
				//���� ��ġ�� �ִ� �л��� �̸��� ���
				System.out.print(classRoom[row][col] + " ");
			}
			//���๮�� ��� ��
			System.out.println();
			
		}
	}

}

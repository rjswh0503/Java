package com.kh.class_Array;

public class StudentMain {

	public static void main(String[] args) {
		//Student ��ü�� �����ϴ� �迭 ����
		Student[] student = new Student[3];
		
		//�迭�� student��ü�� �߰�
		//[0] �ε��� 0��° �л����� �ε��� [2] �л����� �߰� �����ϱ�
		student[0] = new Student("ȫ�浿", 17);
		student[1] = new Student("�踶��", 18);
		student[2] = new Student("�����", 19);
		//�� ���̸� ���ϰ� ������ lenght 
		//ù ��° �л��� �̸� student[0].name 
		//ù ���� �л��� ���� student[0].age
		
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("ù ��° �л��� �̸� :" +student[0].name);
		System.out.println("ù ���� �л��� ���� : " +student[0].age);
		
		//�ι�° �л��� �̸��� ���� ���
		//������ �л��� �̸��� ���� ���
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("�� ���� �л��� �̸�: " + student[1].name);
		System.out.println("�� ��° �л��� ����: " + student[1].age);
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("�� ��° �л��� �̸� : " + student[2].name);
		System.out.println("�� ��° �л��� �̸� : " + student[2].age);
		
		
		
		//for���� �̿��ؼ� 1��° �л� ~3��° �л����� ����ϱ�
		
		for(int i = 0; i < student.length;i++) {
			System.out.println(" �л� �̸� : " + student[i].name + "�л� ����: " +student[i].age);
			
		}
		
		
		
	}

}

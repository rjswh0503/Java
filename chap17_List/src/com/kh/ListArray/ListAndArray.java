package com.kh.ListArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
		ListAndArray aa = new ListAndArray();
		aa.ListArray1();
		ListArray2();
	}
		public void ListArray1() { 
			//Array ����    
			
			int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����
			intArray[0]=1;
			intArray[1]=2;
			
			//intArray ���
			System.out.println("Array ��� : " );
			for(int a = 0; a < intArray.length;a++) {
				System.out.print(intArray[a] + " ");
			}
			
			
			System.out.println();//���๮�� ���Ե��־� enter�� ���� ������ ��
			
			//List ����					// �� �迭 ����Ʈ ����
			List<Integer> intList = new ArrayList<>();
										//Integer ��ü�� �����ϴ� ArrayList ���� 
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			
			//List ���
			System.out.println("List ��� : " );
			for(int num : intList) {
				System.out.println(num + " ");
				
				
			}
			
			
		}
		public static  void ListArray2() {
			
			//String���� ���� �� Array�� List ����غ���
			
			 // Array �� �迭 �߰��� ���� �Ұ��� 
			String[] strArray = new String[2]; // ���ڿ� ����2 �迭 ����
			strArray[0] = "������"; //index 0
			strArray[1] = "�����"; //index 1
			
			System.out.println("Array ��� : ");
			for(int i = 0; i <strArray.length;i++) {
				System.out.println(strArray[i] + " ");
				
			}
			System.out.println();
			
			List<String> StringList = new ArrayList<>(); // List�� �迭 �߰��� ���� ���� 
			StringList.add("������");
			StringList.add("�����");
			StringList.add("����");
			StringList.add("ȣ����");
			StringList.add("����");
			
			System.out.println("List ��� : ");
			for(String str : StringList) {
				System.out.println(str +" ");
			}
			
			System.out.println();
					
			
				}
	
		
			}		
		
		
	 
	
	
		
	
	
	


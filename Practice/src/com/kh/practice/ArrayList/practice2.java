package com.kh.practice.ArrayList;

import java.util.ArrayList;

public class practice2 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList();
        //  �� ArrayList ����



        // add()�� ���� �� ��� �߰�


        color.add("��");
        
        color.add("��");
        
        color.add("��");
        
        color.add("��");
        
        color.add("��");
      
        color.add("��");

        color.add("��");
        System.out.println("��� ���� : " + color);
       

        System.out.println("===============================================================");
        int size = color.size(); // size()�� ��� ������ ��
        System.out.println("��� ������ �� :" +size);
        System.out.println("===============================================================");


        //��� ����
        // ��Ȳ�� - ��
        // �ʷϻ� - ����
        // ���� - �׸�

        color.set(1,"��");
        color.set(3,"���� ");
        color.set(5,"�׸�");
        System.out.println("���� üũ : " + color);


        //remove�� ����Ͽ� ���� �ش��ϴ� �ε��� ����

        color.remove(1);
        color.remove(2);
        color.remove(3);
        color.remove(1);        // ������ �� �𸣰���







        // ���� �� �� ��� : ��, ��, ��

        for(String asdasdw:color){
            System.out.println("���� ���� : " + asdasdw);

        }


    }

	



		 
		 
		 
		 
		 	
	            

		
		
		
		
		
		
			
		
		

	}



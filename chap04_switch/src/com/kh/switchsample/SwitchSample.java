package com.kh.switchsample;
    
public class SwitchSample {

	public static void main(String[] args) {
		// Switch��
		/*
		 Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 switch ���� �Ϸ��� case ���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش��ϴ� �ڵ� ����� ����
		 �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		 
		 switch (���� �Ǵ� ǥ���� {
		   case ��1 :
		        //��1�� �ش��ϴ� �ڵ�
		          break; // �ش� ����� ������ �ߴ��ϴ� ����
		   case ��2 :
		    	//��2�� �ش��ϴ� �ڵ�
		    	  break;
		   default :
		    	//�� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		    	
		  }
		  
		  
		  */
		
		int day = 30;
		switch (day) {//day == 30
			case 1://case�� 30�̸� ������ ��� false
				System.out.println("������"); //��µ��� ����
				break;             
			case 2:
				System.out.println("ȭ����");
				break;
			case 30:
				System.out.println("������");
				break;
			default :
				System.out.println("�ָ�");
		}
		
		int choice = 1;
	    switch(choice) {
	    //1���� �����ϸ� �Ƹ޸�ī��
	    case 1:
	    	System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
	    	break;
	    	//2���� �����ϸ� ī�� ��
	    case 2:
	    	System.out.println("ī�� �󶧸� �ֹ��ϼ̽��ϴ�.");
	    	break;
	    	//3���� �����ϸ� ���ν����
	    case 3:
	    	System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�.");
	    	break;
	    	//4���� �����ϸ� ��� ����Ƽ
	    case 4:
	    	System.out.println("��� ����Ƽ�� �ֹ��ϼ̽��ϴ�.");
	    	break;
	    default :
	    	System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
	    	
	    }
		
		
		

	}

}

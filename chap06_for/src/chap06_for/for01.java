package chap06_for;

public class for01 {

	public static void main(String[] args) {
		/*
		 for���� ���α׷��ֿ��� �ݺ� �۾��� �����ϱ� ���� ���Ǵ� �����
		 Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
		 ��κ��� ���α׷��� ���� for���� ���� ����
		 for(�ʱ�ȭ; ���ǽ�; ������){
		 	//������ ���� ��� �ݺ������� ������ �ڵ�
		 }
		 �ʱ�ȭ : �ݺ����� ���۵� �� �� ���� ����Ǵ� �κ�����, �ݺ� ������ �ʱ�ȭ �ϴ� ������ �Ѵ�.
		 
		 ���ǽ� : �ݺ����� ���� �� ������ �˻��ϴ� �κ����� ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ���� 
		 
		 ������ : �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����, �ݺ� �ڵ� ��� ���� �� ���� 
		 
		 */
	    //(���� 1ȸ�� ���)(������ ���� �� ����)  (�� ���ϰų� ����)
		//    �ʱ� i ��;       ���ǽ�;     ������(������ ���Ҹ� �ִ� ��)
		/*for (int i = 1; i <= 5; i++) {
			System.out.println(i);  //���� i<=5 ���� ��쿡 ����Ǵ� ����
			
		}
		
		
		for (int i = 0; i <=5; i++) {
			System.out.println("i�� �� :"+ i );
		}
		
		for (int i = 2; i <=7; i++) {
			System.out.println("i : " + i);
		}
		
		
		for (int i = 10; i >= 5; i--) {
			System.out.println("i - �� : " + i );
		}
		
		*/
		
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			//��
			sum += i;
			System.out.println("1���� 10���� �� : " + sum);
			
			
			
		}
		
		// sum �� ���� 1~5���� ������ ����ϱ�
		sum = 0;
		for(int i = 1; i <=5; i++) {
			sum += i;
			System.out.println("1���� 5������ �� : " + sum);
		}
		
		System.out.println("---------------");
		
		int sum2 = 10;         //10 - 1
		for(int i = 5; i >= 2; i--) {
			sum2 -= i;
			System.out.println("sum2 - : " + sum2);
		}
		
		System.out.println("---------------");
		
		int mul = 1;
		for(int i = 1; i <= 9; i++) {
			mul = 9 * i;
			System.out.println("������ : " + mul);
			
			
		}
		
		
		

	}

}

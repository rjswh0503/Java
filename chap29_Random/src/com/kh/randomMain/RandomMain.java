package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Random  : ������ �����ϱ� ���� ���Ǵ� Ŭ����
    ���� : �������� ������� ��
 * */

public class RandomMain {

	public static void main(String[] args) {
		RandomMain rdm = new RandomMain();
		//rdm.RandomExam();
		rdm.Lotto();
	

	}
	public void Lotto() {
	Random rd = new Random(); // ���� ��ü ����
	// ArrayList ����ؼ� ��ٱ��Ϸ� ���
	
	
	List<Integer> lottoNum = new ArrayList<>();
	//�ߺ��� ���ϱ� ���� set�� ����� �� ����
	//6���� ���ڸ� �� �� 
	int six = 6; // �ζ� ��ȣ �� �� ���� �� ���� ���� 
	while(lottoNum.size() < six) { //0,1,2,3,4,5
		// 1~ 45 ������ �����ؼ� ������ ����
		int ranNumber = rd.nextInt(45)+1;
		
		// 0 ~ 44 �ڸ��� �������� ��ȣ �ϳ�
		
		//�����ϴ��� ���� �ߺ�x
		//�ߺ��� ���� list�� ����� �� ����
		if(!lottoNum.contains(ranNumber)) {//!�� ������� ���� ������ ���� �Ǵ� ���̱� ������ ���ѷ���
			lottoNum.add(ranNumber);
		}
		
		
		
	}
	System.out.println("�ζ� ��ȣ : " +lottoNum);
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	public void RandomExam() {
			//�ζǹ�ȣ ������
		Random rd = new Random(); // ���� ��ü ����
		
			//1. ���� ���� ������ ������ ������ ������ ��
			int ranInt = rd.nextInt(100); //0 ~ 99 ���̿��� 1�� 
			System.out.println(ranInt);
		
		
			//2. �Ǽ� ���� ������ ������ ������ ����
			float ranf = rd.nextFloat(); //0.0 ~ 1.0  
			System.out.println(ranf);
		
		
			//3. �Ҹ��� �� �������� ����
			
			boolean ranB = rd.nextBoolean();
			System.out.println(ranB);
	}

}

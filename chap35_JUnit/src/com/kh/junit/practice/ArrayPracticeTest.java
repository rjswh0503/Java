package com.kh.junit.practice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class ArrayPracticeTest {
	
	private ArrayPracticeTest ap;
	
	@Before
	public void setUP() {
		ap = new ArrayPracticeTest();
		System.out.println("�׽�Ʈ ����");
	}

	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual =   {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expected,actual);
		
	}
	
	@Test
	public void testPractice2() {
		String[] expected = {"���","������"};
		String[] actual = {"���","������"};
		assertArrayEquals(expected,actual);
		
	}
	
	@Test
	public void testpractice3() {
		double expected = 0.1 + 0.2;
		double actual = 0.31;
		assertNotEquals(expected,actual,0.001);
		
	}
	@Test
	public void testpractice4() {
		String[] arr = new String[5];
		

		
	}
	@Test
	public void testpractice5() {
		
		int num = 0;
		String[] arr = {"��","ȭ","��","��","��","��","��"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 ~ 6 ���� ���� �Է� :");
		num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			
			
		
		}
		
		
	}
	

		
}
	
	
	
	
	



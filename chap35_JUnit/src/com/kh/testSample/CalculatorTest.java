package com.kh.testSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(4, 3);
		assertEquals(7,result);//���󰪰� ���� ����� ��
		
		
		
	}
	@Test
	public void testSubtraction() {
		Calculator cal = new Calculator();
		int result = cal.subtract(7, 2);
		assertEquals(5,result);
		
	}
}

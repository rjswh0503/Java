package com.kh.testSample.BF;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.testSample.Calculator;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setUp() {
		//각 테스트 메서드 실행 전에 수행할 작업 정의
		cal = new Calculator();
		System.out.println("테스트 시작!");
		
	}
	@After
	public void tearDown() {
		//각 테스트 메서드 실행 후 수행할 작업을 정의
		
		System.out.println("테스트 종료");
	}
	
	@Test
	public void testAddition() {
		int result = cal.add(3, 4);
		assertEquals(7,result);
	}
	
	@Test
	public void testSub() {
		int result = cal.subtract(10, 5);
		assertEquals(5,result);
	}
	
	

}

package com.kh.OverloadingEx;

public class OverSample {
	
	
	public int sum(int z, int s ) {
		return z+s;
			
	}
	
	
	public int sum(int z, int s,int q) {
		return z+s+q;
		
	}
	
	
	public int sum(int z, int s, int q, int f) {
		return z+s+q+f;
	}
	
	
	
	
	public double sum(double z,double s) {
		return z+s;
		
	}
	
	
	public double sum(double z, double s, double q) {
		return z+s+q;
	}
	

	 

	

	public static void main(String[] args) {
		OverSample obj = new OverSample();
		
		System.out.println("�� ������ �� : " + obj.sum(10, 5));
		System.out.println("�� ������ �� : " + obj.sum(10, 7, 5));
		System.out.println("�� ������ �� : " + obj.sum(4, 7, 5, 4));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5, 10.5));
		
		
		

	}

}

package com.kh.classSample;

public class Computer {
	String Cpu;
	String MainBoad;
	String Ram;
	String Ssd;
	String Graphics;
	String Cooler;
	int Price;

	
	
											//. 파라미터
	public Computer() {
		this.Cpu = Cpu;
		this.MainBoad = MainBoad;
		this.Ram = Ram;
		this.Ssd = Ssd;
		this.Graphics = Graphics;
		this.Cooler = Cooler;
		this.Price = Price;
				
		
	}
		
	
	public void computerInfo() {
		System.out.println("컴퓨터 부품 합계 ");
		System.out.println("Cpu : " + Cpu);
		System.out.println("MainBoad : " + MainBoad);
		System.out.println("Ram : " + Ram);
		System.out.println("Ssd : " + Ssd);
		System.out.println("Graphics : " + Graphics);
		System.out.println("Cooler : " + Cooler);
		System.out.println("Price : " + Price);
		
		
		
	}
	
	
	
	
}







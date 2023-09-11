package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe("아메리카노",1,true);
		cafe.Coffe();
		Cafe cafe1 = new Cafe("아이스티",1,false);
		cafe1.Coffe();
		Cafe cafe2 = new Cafe("얼그레이",3,true);
		cafe2.Coffe();
			
			
		

	}

}

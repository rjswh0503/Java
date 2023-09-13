package com.kh.api.exam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		pm.practice1();
		pm.practice2();
		pm.practice3();
		pm.practice4();
		pm.practice5();
		
	}
	
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã");//Àú³áÀº ¹¹¸ÔÁö
		sb.append("Àú³áÀº");
		sb.append("¹¹¸ÔÁö");
		System.out.println(sb.toString());
		System.out.println("==============");
	}
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â ¿À´Ã Àú³áÀº ¹¹¸ÔÁö reverse 
		String str = "¿À´Ã Àú³áÀº ¹¹ ¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println("==============");
	}
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ 
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(10 , "¤¾¤¾");
		sb.insert(8, "!!!!!!!!");
		System.out.println(sb.toString());
		System.out.println("==============");
		
	}
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,)
				String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
				StringBuffer sb = new StringBuffer(str);
				sb.replace(2, 4, "good");
				System.out.println(sb.toString());
				System.out.println("==============");
				
	
		
		
	}
	public void practice5() {
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.delete(2, 4);
		System.out.println(sb.toString());
		
	}
	

}

package com.kh.staticvar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar st = new StaticVar();
		st.setStudentName("kh�л�1");
		System.out.println(st.serialNum);
		st.serialNum++;
		//�츮 ���� ����å 10�� ĭ
		//�츮 ���� ����å 2��° 11�� ĭ
		
		StaticVar kh = new StaticVar();
		st.setStudentName("����å 1");
		System.out.print("KH st : ");
		System.out.println(st.serialNum);
		
		kh.setStudentName("����å 2 : ");
		System.out.println(kh.serialNum);
		

		
		
		
	}

}

package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		//학생의 객체 생성
		
		
		//학생 정보를 출력
		
		// public Student(String name, int age, String grade)
		
		Student student1 = new Student("신재헌",  30 ,"1학년"  );
		Student student2 = new Student("신재헌1", 29 ,"2학년"  );
		Student student3 = new Student("신재헌2", 28 ,"3학년"  );
		
		//학생 정보 출력
		
		
		
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		
		
		
		

	}

}

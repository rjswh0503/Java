package com.kh.finalSample;

public class PersonMain {
	private String name;
	
	
	public void Person(String name) {
		this.name = name;
		
	
	}
	
	public  String getName() {
		return name;
		
	}

	public static void main(String[] args) {
		
		PersonMain[] pArray = new PersonMain[0];
		
		pArray[0] = new Person("kh");
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].getName());
			
		}
		
			
			
	}

}



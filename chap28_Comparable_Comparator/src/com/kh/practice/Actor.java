package com.kh.practice;


//ComparExam > User Student Actor rename

//

public class Actor implements Comparable<Actor> {
	private String name;
	private int age;
	
	
	public Actor(String name, int age) {
		this.name = name;
		this.age = age;
		
		
		
	}
	
	@Override
	public int compareTo(Actor othersActor) {
		return this.age = othersActor.age;
		
	}
	
	@Override
	public String toString() {
		return "¹è¿ì {Name = " + name + ", Age = "+ age + "}";
	}

	
	
	

}

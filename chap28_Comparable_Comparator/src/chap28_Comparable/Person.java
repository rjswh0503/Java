package chap28_Comparable;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		
	}
	
	@Override
	public int compareTo(Person otherPerson) {
		//나이를 기준으로 비교
		return this.age = otherPerson.age;
		
	}
	@Override
	public String toString() {
		return "Person{name=" + name+ ", age = " + age +"}";
	}
	
	

	

}

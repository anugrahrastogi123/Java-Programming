package oops;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		System.out.println("I am the default constructor");
	}
	
	public Person(int age) {
		System.out.println("I am a parameterized constructor with one parameter");
		this.age = age;
	}
	
	public Person(String name, int age) {
		System.out.println("I am a parameterized constructor with two parameter");
		this.name = name;
		this.age = age;
	}
}

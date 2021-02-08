package oops;

public class PersonClient {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(22);
		Person p4 = new Person("B", 24);
		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p2.name = "A";
		p2.age = 10;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		System.out.println(p3.age);
		
		System.out.println(p4.name);
		System.out.println(p4.age);
	}

}

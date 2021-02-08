package oops;

public class Student1Client {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Student1 s1 = new Student1();
		
		try {
			s1.setAge(-10);
		}
		catch(Exception e) {
			System.out.println("in catch block");
		}
		
		System.out.println("Bye");
		
		System.out.println(s1.getAge());

	}

}

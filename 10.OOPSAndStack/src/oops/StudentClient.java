package oops;

public class StudentClient {

	public static void main(String[] args) throws Exception {
		
		// array of objects
		Student[] students = new Student[1000];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(i + "th");
			System.out.println(Student.GetNumofStudents());
		}
		
		// final variable cannot be changed
		// Student.MAX_STUDENTS = 2000;
		
		System.out.println(students[250].rollNo);
		
		System.out.println(students[250].getName());
		students[250].setName("ABC");
		System.out.println(students[250].getName());
		
		students[250].ANonStaticFunction();
		students[250].AStaticFunction(); // not the correct way of calling a static method
		Student.AStaticFunction();

	}

}
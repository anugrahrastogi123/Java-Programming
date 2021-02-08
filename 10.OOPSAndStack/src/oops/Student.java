package oops;

public class Student {
	
	// private is for data hiding
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) throws Exception{
		// business rules checked
		if(name.equals("") || name == null) {
			throw new Exception("Name can't be null or empty");
		}
		
		this.name = name;
	}
	
	public final int rollNo;
	
	// static means it belong to class
	private static int NumofStudents = 0;
	
	public static int GetNumofStudents() {
		return Student.NumofStudents;
	}
	
	private static String UniformColour = "White";
	
	public static String getUniformColour() {
		return Student.UniformColour;
	}
	
	public static void setUniformColour(String uniformColour) {
		Student.UniformColour = uniformColour;
	}
	
	public static final int MAX_STUDENTS = 1000;
	
	public Student(String name) throws Exception{
		if(Student.NumofStudents == Student.MAX_STUDENTS) {
			throw new Exception("Max limit reached");
		}
		
		this.setName(name);
		
		Student.NumofStudents++;
		this.rollNo = Student.NumofStudents;
	}
	
	public static void AStaticFunction() {
		System.out.println(Student.NumofStudents + " out of possible " + Student.MAX_STUDENTS);
	}
	
	public void ANonStaticFunction() {
		System.out.println(this.name + " say hello to " + Student.NumofStudents + "students");
	}

}

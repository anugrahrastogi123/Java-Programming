// 6
import java.util.Scanner;

public class ElseIf {
	// Demo for else if

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		
		if(age <= 11) {
			System.out.println("Child");
		}
		else if(age >= 12 && age <= 17) {
			System.out.println("Teenager");
		}
		else if(age >= 18 && age <= 60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Old");
		}

	}

}

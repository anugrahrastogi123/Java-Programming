import java.util.Scanner;

// 3
public class UpperOrLowerCase {
	
	// Find whether the character is in Upper or Lower case

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		System.out.println(ch);
		
		if(ch >= 97 && ch <= 122) {
			System.out.println("Lower Case");
		}
		else if(ch >= 65 && ch <= 90) {
			System.out.println("Upper Case");
		}
		else {
			System.out.println("Invalid Character");
		}

	}

}

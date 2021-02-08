import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char c = s.next().charAt(0);
		
		if(c >= 97 && c <= 122)
			System.out.println("lowercase");
		else if(c >= 65 && c <= 90)
			System.out.println("UPPERCASE");
		else
			System.out.println("Invalid");

	}

}

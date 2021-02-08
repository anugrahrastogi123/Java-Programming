import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char ch = s.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z')
			System.out.println("L");
		else if(ch >= 'A' && ch <= 'Z')
			System.out.println("U");
		else
			System.out.println("I");

	}

}

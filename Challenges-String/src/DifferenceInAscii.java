import java.util.Scanner;

public class DifferenceInAscii {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		for(int i = 0; i < str.length()-1; i++) {
			
			int diff = (int)str.charAt(i+1) - (int)str.charAt(i);
			
			System.out.print("" + str.charAt(i) + diff);
		}
		
		System.out.println(str.charAt(str.length()-1));
		
		s.close();

	}

}

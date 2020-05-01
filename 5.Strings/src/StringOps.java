import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		printChars(str);
		printSS(str);

	}
	
	public static void printChars(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
		}
	}
	
	// Print Substring
	public static void printSS(String str) {
		
		for(int si = 0; si < str.length(); si++) {
			
			for(int ei = si+1; ei <= str.length(); ei++) {
				
				System.out.println(str.substring(si, ei));
			}
		}
	}
	
	
}

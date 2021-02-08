import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		for(int i = 0; i < str.length()-1; i++) {
			if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') && (str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z')){
				System.out.print(str.charAt(i));
			}
			else if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') && (str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'Z')) {
				System.out.println(str.charAt(i));
			}
			else if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && (str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'Z')) {
				System.out.println(str.charAt(i));
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				System.out.print(str.charAt(i));
			}
		}
		
		System.out.println(str.charAt(str.length()-1));
		
		anotherWay(str);
		
		s.close();

	}
	
	public static void anotherWay(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
			if(i != 0 && (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				System.out.println();
			}
			
			System.out.print(str.charAt(i));
		}
	}

}

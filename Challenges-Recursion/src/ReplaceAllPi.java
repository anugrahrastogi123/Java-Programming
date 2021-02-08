import java.util.Scanner;

public class ReplaceAllPi {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			String str = s.next();
			String ans = replace(str);
			System.out.println(ans);
		}

	}
	
	public static String replace(String str) {
		
		if(str.length() <= 1)
			return str;
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			return "3.14" + replace(str.substring(2));
		}
		
		return str.charAt(0) + replace(str.substring(1));
	}

}

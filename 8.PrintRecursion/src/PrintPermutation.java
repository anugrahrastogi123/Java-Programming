
public class PrintPermutation {

	public static void main(String[] args) {
		
		printP("abc", "");

	}
	
	public static void printP(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			char cc = str.charAt(i);
			printP(str.substring(0, i) + str.substring(i+1), ans + cc);
		}
	}

}

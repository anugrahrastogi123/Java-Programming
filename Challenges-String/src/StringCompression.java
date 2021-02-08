import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
//		int[] freq = new int[26];
//		
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			freq[ch - 'a']++;
//		}
//		
//		for(int i = 0; i < 26; i++) {
//			if(freq[i] == 1) {
//				System.out.print((char)(i + 'a'));
//			}
//			else if(freq[i] != 0) {
//				System.out.print((char)(i + 'a'));
//				System.out.print(freq[i]);
//			}
//		}
		
		char ch = str.charAt(0);
		int count = 0;
		
		for(int i = 0; i <= str.length(); i++) {
			if(i < str.length() && ch == str.charAt(i)) {
				count++;
			}
			else {
				System.out.print(ch);
				if(count != 1) {
					System.out.print(count);
				}
				if(i < str.length()) {
					ch = str.charAt(i);
					count = 1;
				}
			}
		}
		
		s.close();

	}

}

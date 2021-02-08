import java.util.Scanner;

public class StringsMaxFrequency {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		int[] freq = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			freq[ch - 'a']++;
		}
		
		int idx = -1, max = Integer.MIN_VALUE;
		
		for(int i = 0; i < 26; i++) {
			if(freq[i] > max) {
				idx = i;
				max = freq[i];
			}
		}
		
		System.out.println((char)(idx + 'a'));
		
		s.close();

	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllSubsequences {

	public static void main(String[] args) {
		// Print all the subsequences of a string in lexicographical order
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			String str = s.next();
			ArrayList<String> ans = Subsequences(str);
			Collections.sort(ans);
			for(String item : ans) {
				System.out.println(item);
			}
		}

	}
	
	public static ArrayList<String> Subsequences(String str){
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		char curr = str.charAt(0);
		ArrayList<String> recurResult = Subsequences(str.substring(1));
		ArrayList<String> myResult = new ArrayList<String>();
		for(String item : recurResult) {
			myResult.add(item);
			myResult.add(curr + item);
		}
		return myResult;
	}

}

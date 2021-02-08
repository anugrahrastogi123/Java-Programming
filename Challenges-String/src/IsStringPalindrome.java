import java.util.Scanner;

public class IsStringPalindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char[] arr = s.next().toCharArray();
		
		boolean ans = isPalindrome(arr);
		
		System.out.println(ans);

	}
	
	public static boolean isPalindrome(char[] arr) {
		
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			
			if(arr[start] == arr[end]) {
				start++;
				end--;
			}
			else
				return false;
		}
		
		return true;
	}

}

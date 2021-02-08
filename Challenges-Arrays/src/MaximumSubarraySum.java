import java.util.Scanner;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
			
			int n = s.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			
			int sum = 0;
			int ans = Integer.MIN_VALUE;
			
			for(int i = 0; i < n; i++) {
				
				sum = Math.max(arr[i], sum+arr[i]);
				ans = Math.max(sum, ans);
			}
			
			System.out.println(ans);
		}
		

	}

}

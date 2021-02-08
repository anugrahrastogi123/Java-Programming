import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
			
			int n = s.nextInt();
			int[] arr = new int[n];
			
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				sum += arr[i];
			}
			
			int k = kadane(arr);
			
			// inverting the signs of the elements of the array
			for(int i = 0; i < n; i++) {
				arr[i] = -arr[i];
			}
			
			int circularSum = kadane(arr);
			
			circularSum += sum;
			
			if(circularSum > k && circularSum != 0)
				System.out.println(circularSum);
			else
				System.out.println(k);
		}
		
	}
	
	public static int kadane(int[] arr) {
		
		int ans = Integer.MIN_VALUE, sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = Math.max(arr[i], sum+arr[i]);
			ans = Math.max(ans, sum);
		}
		
		return ans;
	}

}

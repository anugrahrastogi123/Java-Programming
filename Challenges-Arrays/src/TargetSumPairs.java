import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		int target = s.nextInt();
		
		// 1. Brute force Approach O(n^2)
//		for(int i = 0; i < n-1; i++) {
//			for(int j = i+1; j < n; j++) {
//				if(arr[i]+arr[j] == target) {
//					if(arr[i] < arr[j])
//						System.out.println(arr[i]+" and  "+arr[j]);
//					else
//						System.out.println(arr[j]+" and  "+arr[i]);
//				}
//			}
//		}
		
		// 2. Efficient Approach 
		int left = 0, right = arr.length - 1;
		
		while(left < right) {
			
			if(arr[left] + arr[right] == target) {
				System.out.println(arr[left]+" and "+arr[right]);
				left++;
				right--;
			}
			else if(arr[left] + arr[right] > target) {
				right--;
			}
			else {
				left++;
			}
		}

	}

}

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumriplets {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		int target = s.nextInt();
		
		for(int i = 0; i <= n - 3; i++) {
			
			int sum = target - arr[i];
			
			int left = i+1, right = n-1;
			while(left < right) {
				
				if(arr[left] + arr[right] == sum) {
					System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
					left++;
					right--;
				}
				else if(arr[left] + arr[right] > sum) {
					right--;
				}
				else {
					left++;
				}
			}
		}
		

	}

}

import java.util.Scanner;

public class PaintersPartitionProblem {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int k = s.nextInt(); // no. of painters
		int n = s.nextInt(); // no. of boards
		
		int[] arr = new int[n]; // length of each board
		
		int sum = 0;
		
		for(int i = 0; i < n ; i++) {
			arr[i] = s.nextInt();
			sum += arr[i];
		}
		
		int low = 0; // painter paints 0 board
		int high = sum; // 1 painter is allocated all the boards
		int ans = 0;
		
		while(low <= high) {
			
			int mid = (low + high)/2;
			
			if(isItPossible(arr, mid, k)) {
				ans = mid;
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		System.out.println(ans);
		
	}
	
	public static boolean isItPossible(int[] arr, int min_time, int nop) {
		
		int k = 1; // no. of painters required
		int total = 0;
		
		for(int i = 0; i < arr.length; ) {
			
			if(total + arr[i] <= min_time) {
				
				total += arr[i];
				i++;
			}
			else {
				
				total = 0; 
				k++;
			}
			if(k > nop)
				return false;
		}
		
		return true;
	}

}
































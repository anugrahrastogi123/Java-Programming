import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // no. of stalls
		int c = s.nextInt(); // no. of cows
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		int low = 0; // all cows are placed in one stall
		int high = arr[n-1] - arr[0]; // two cows are placed at 1st and last stall
		int dist = 0;
		
		while(low <= high) {
			
			int mid = (low+high)/2;
			
			int cow = c;
			cow--; // cow placed at 0th index
			int i = 0, j = i+1;
			
			while(j < n && cow > 0) {
				
				if(arr[j] - arr[i] >= mid) {
					cow--;
					i = j;
					j = i+1;
				}
				else {
					j++;
				}
			}
			
			if(cow == 0) {
				dist = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			
		}
		
		System.out.println(dist);
		
	}

}
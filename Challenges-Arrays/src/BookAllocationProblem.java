import java.util.Scanner;

public class BookAllocationProblem {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
			
			int n = s.nextInt(); // no. of books
			int m = s.nextInt(); // no. of students
			
			int[] arr = new int[n]; // no. of pages in each book
			
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				sum += arr[i];
			}
			
			int low = arr[n-1];
			int high = sum;
			int ans = 0;
			
			while(low <= high) {
				
				int mid = (low + high)/2;
				
				if(isItPossible(arr, n, m, mid)) {
					
					ans = mid;
					high = mid-1;
				}
				else {
					low = mid+1;
				}
			}
			
			System.out.println(ans);
		}

	}
	
	public static boolean isItPossible(int[] arr, int n, int nos, int max_pages) {
		
		int m = 1;
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			
			total += arr[i];
			
			if(total > max_pages) {
				
				total = arr[i];
				m++;
			}
		}
		
		if(m > nos)
			return false;
		
		return true;
	}

}

import java.util.Scanner;

public class FindUpperAndLowerBound {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int q = s.nextInt();
		
		while(q-- > 0) {
			int num = s.nextInt();
			
			int low = lowerBound(arr, n, num);
			int high = upperBound(arr, n, num);
			
			System.out.println(low + " " + high);
		}
		

	}
	
	public static int lowerBound(int[] arr, int n, int num) {
		
		int l = 0, h = n-1;
		int ans = -1;
		
		while(l <= h) {
			
			int mid = (l+h)/2;
			
			if(arr[mid] == num) {
				ans = mid;
				h = mid-1;
			}
			else if(arr[mid] > num) {
				h = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		
		return ans;
	}
	
	public static int upperBound(int[] arr, int n, int num) {
		
		int l = 0, h = n-1;
		int ans = -1;
		
		while(l <= h) {
			
			int mid = (l+h)/2;
			
			if(arr[mid] == num) {
				ans = mid;
				l = mid+1;
			}
			else if(arr[mid] > num) {
				h = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		
		return ans;
	}

}



























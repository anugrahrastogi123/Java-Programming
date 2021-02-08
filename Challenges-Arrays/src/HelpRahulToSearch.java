import java.util.Scanner;

public class HelpRahulToSearch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int key = s.nextInt();
		
		int idx = search(arr, 0, n-1, key);
		
		System.out.println(idx);
		

	}
	
	public static int search(int arr[], int l, int r, int key) {
		
		if(l > r)
			return -1;
		
		int mid = (l+r)/2;
		
		if(arr[mid] == key)
			return mid;
		
		if(arr[l] <= arr[mid]) {
			
			if(key >= arr[l] && key <= arr[mid]) {
				return search(arr, l, mid-1, key);
			}
			return search(arr, mid+1, r, key);
		}
		
		if(key >= arr[mid+1] && key <= arr[r]) {
			return search(arr, mid+1, r, key);
		}
		return search(arr, l, mid-1, key);
	}

}


























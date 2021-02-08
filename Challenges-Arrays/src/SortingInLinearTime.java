import java.util.Scanner;

public class SortingInLinearTime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int count[] = new int[3]; // stores the frequency of each element
		int output[] = new int[n];
		
		// storing the frequency of each element
		for(int i = 0; i < n; i++) {
			++count[arr[i]];
		}
		
		// modifying the count array
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
		
		// placing the data at its correct position
		for(int i = n-1; i >= 0; i--) {
			output[--count[arr[i]]] = arr[i];
		}
		
		// copying the output array to original array
		for(int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
		
		// display
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		

	}

}

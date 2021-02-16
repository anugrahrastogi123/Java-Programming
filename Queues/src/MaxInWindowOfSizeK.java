import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxInWindowOfSizeK {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = s.nextInt();
		}
		
		int k = s.nextInt();
		
		printMax(arr, k);
		
		s.close();

	}
	
	public static void printMax(int[] arr, int k) {
		
		Deque<Integer> q = new LinkedList<>();
		
		// Process first k (or first window) elements of array
		int i;
		for(i = 0; i < k; i++) {
			
			// For every element, the previous smaller elements are useless so 
			// remove them from q
			while(!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}
			
			q.addLast(i);
		}
		
		// Process rest of the elements, i.e., from arr[k] to arr[n-1]
		for(; i < arr.length; i++) {
			
			// The element at the front of the deque is the largest element of 
			// previous window, so print it
			System.out.print(arr[q.getFirst()] + " ");
			
			// Remove the elements which are out of this window
			while(!q.isEmpty() && q.getFirst() <= i-k) {
				q.removeFirst();
			}
			
			// Remove all elements smaller than the currently 
			// being added element (remove useless elements)
			while(!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}
			
			// Add current element at the rear of q
			q.addLast(i);
		}
		
		// Print the maximum element of last window 
		System.out.print(arr[q.getFirst()]);
	}

}

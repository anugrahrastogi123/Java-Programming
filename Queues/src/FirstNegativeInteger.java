import java.util.LinkedList;

// Find the first negative integer in every window of size k.
public class FirstNegativeInteger {

	public static void main(String[] args) {

		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		
		int k = 3;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int i;
		for(i = 0; i < k; i++) {
			if(arr[i] < 0) {
				queue.addLast(i);
			}
		}
		
		for(; i < arr.length; i++) {
			if(!queue.isEmpty()) {
				System.out.print(arr[queue.peek()] + ", ");
			}
			else {
				System.out.print("0, ");
			}
			
			while(!queue.isEmpty() && queue.peek() <= i-k) {
				queue.removeFirst();
			}
			
			if(arr[i] < 0) {
				queue.add(i);
			}
		}
		
		if(!queue.isEmpty()) {
			System.out.print(arr[queue.peek()]);
		}
		else {
			System.out.print("0");
		}

	}

}

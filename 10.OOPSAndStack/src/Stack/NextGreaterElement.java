package Stack;

import java.util.Stack;

// Find the next greater element for each element present in the array.

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 3, 8, 6, 7, 5};
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			while(!stack.isEmpty() && arr[i] > stack.peek()) {
				
				int item = stack.pop();
				System.out.println(item + ", " + arr[i]);
			}
			
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			
			int item = stack.pop();
			System.out.println(item + ", " + -1);
		}
		
	}

}

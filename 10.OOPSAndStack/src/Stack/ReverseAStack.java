package Stack;

public class ReverseAStack {

	public static void main(String[] args) throws Exception {
		
		StackUsingArray stack = new StackUsingArray(5);
		StackUsingArray helper = new StackUsingArray(5);
		
		for(int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		
		stack.display();
		reverseStack(stack, helper, 5);
		stack.display();
		
	}

	private static void reverseStack(StackUsingArray stack, StackUsingArray helper, int n) throws Exception {
		
		if(stack.size() == 0) {
			return;
		}
		
		int item = stack.pop();
		reverseStack(stack, helper, n);
		
		helper.push(item);
		
		if(helper.size() == n) {
			while(!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
		
	}
	
	

}

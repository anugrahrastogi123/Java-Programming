package Stack;

public class ReverseStack {

	public static void main(String[] args) throws Exception {
		
		StackUsingArray stack = new StackUsingArray(5);
		
		for(int i = 1; i <= 5; i++) {
			stack.push(i*10);
		}
		
		stack.display();
		
		StackUsingArray helper = new StackUsingArray(5);
		
		reverseStack(stack, helper, 0);
		
		stack.display();

	}

	private static void reverseStack(StackUsingArray stack, StackUsingArray helper, int index) throws Exception {
		
		if(stack.isEmpty()) {
			return;
		}
		
		int item = stack.pop();
		reverseStack(stack, helper, index+1);
		helper.push(item);
		
		if(index == 0) {
			while(!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
		
	}

}

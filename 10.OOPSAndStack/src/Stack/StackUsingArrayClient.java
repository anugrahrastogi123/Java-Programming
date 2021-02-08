package Stack;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		
		StackUsingArray stack = new StackUsingArray(5);
		
		for(int i = 1; i <= 5; i++) {
			stack.push(i*10);
		}
		
		stack.display();
		
		//stack.push(60);
		
		System.out.println(stack.top());

	}

}

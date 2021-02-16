package Stack;

// Queue using stack -> Enqueue Efficient approach
public class QUSEnqueueEfficient {
	
	private DynamicStack primary;
	private DynamicStack secondary;
	
	public QUSEnqueueEfficient() throws Exception {
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}
	
	public int size() {
		return this.primary.size();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	public void enqueue(int data) throws Exception {
		this.primary.push(data);
	}
	
	public int dequeue() throws Exception {
		
		while(this.primary.size() != 1) {
			this.secondary.push(this.primary.pop());
		}
		
		int item = this.primary.pop();
		
		while(!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
		
		return item;
	}
	
	public int front() throws Exception {
		while(this.primary.size() != 1) {
			this.secondary.push(this.primary.pop());
		}
		
		int item = this.primary.top();
		
		while(!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
		
		return item;
	}
	
	public void display() throws Exception {
		reverseStack(this.primary, this.secondary, 0);
		this.primary.display();
		reverseStack(this.primary, this.secondary, 0);
	}

	private void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception {
		
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

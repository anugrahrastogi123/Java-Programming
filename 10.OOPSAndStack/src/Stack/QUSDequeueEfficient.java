package Stack;

// Queue using stack -> Dequeue Efficient Approach
public class QUSDequeueEfficient {
	
	private DynamicStack primary;
	private DynamicStack secondary;
	
	public QUSDequeueEfficient() throws Exception {
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
		
		while(!this.primary.isEmpty()) {
			this.secondary.push(this.primary.pop());
		}
		
		this.primary.push(data);
		
		while(!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
	}
	
	public int dequeue() throws Exception {
		return this.primary.pop();
	}
	
	public int front() throws Exception {
		return this.primary.top();
	}
	
	public void display() {
		this.primary.display();
	}

}

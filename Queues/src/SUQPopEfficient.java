// Stack using two queues -> Pop efficient approach
public class SUQPopEfficient {
	
	private DynamicQueue primary;
	private DynamicQueue secondary;
	
	public SUQPopEfficient() {
		this.primary = new DynamicQueue();
		this.secondary = new DynamicQueue();
	}
	
	public int size() {
		return this.primary.size();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	public void push(int data) {
		while(!this.primary.isEmpty()) {
			this.secondary.enqueue(this.primary.dequeue());
		}
		
		this.primary.enqueue(data);
		
		while(!this.secondary.isEmpty()) {
			this.primary.enqueue(this.secondary.dequeue());
		}
	}
	
	public int pop() {
		return this.primary.dequeue();
	}
	
	public int top() {
		return this.primary.getFront();
	}
	
	public void display() {
		this.primary.display();
	}
	
	

}

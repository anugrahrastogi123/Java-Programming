
// Stack using queues -> Push Efficient

public class SUQPushEfficient {
	
	DynamicQueue primary;
	DynamicQueue secondary;
	
	public SUQPushEfficient() {
		this.primary = new DynamicQueue();
		this.secondary = new DynamicQueue();
	}
	
	public int size() {
		return primary.size();
	}
	
	public boolean isEmpty() {
		return primary.isEmpty();
	}
	
	public void push(int data) {
		primary.enqueue(data);
	}
	
	public int pop() {
		
		while(primary.size() != 1) {
			secondary.enqueue(primary.dequeue());
		}
		
		int val = primary.dequeue(); // element popped from stack
		
		while(!secondary.isEmpty()) {
			primary.enqueue(secondary.dequeue());
		}
		
		return val;
	}
	
	public int top() {
		while(primary.size() != 1) {
			secondary.enqueue(primary.dequeue());
		}
		
		int val = primary.dequeue(); // element popped from stack
		secondary.enqueue(val);
		
		while(!secondary.isEmpty()) {
			primary.enqueue(secondary.dequeue());
		}
		
		return val;
	}
	
	public void display() {
		reverseQueue(primary);
		primary.display();
		reverseQueue(primary);
	}

	private void reverseQueue(DynamicQueue queue) {
		
		if(queue.isEmpty()) {
			return;
		}
		
		int element = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

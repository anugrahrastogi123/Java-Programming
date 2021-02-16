
public class LL_As_Queue {
	
	private LinkedList queue;
	
	public LL_As_Queue() {
		this.queue = new LinkedList();
	}
	
	public int size() {
		return this.queue.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void enqueue(int data) {
		this.queue.addLast(data);
	}
	
	public int dequeue() throws Exception {
		return this.queue.removeFirst();
	}
	
	public int front() {
		return this.queue.getFirst();
	}
	
	public void display() {
		this.queue.display();
	}

}

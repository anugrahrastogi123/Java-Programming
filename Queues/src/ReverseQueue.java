
public class ReverseQueue {

	public static void main(String[] args) {
		
		DynamicQueue queue = new DynamicQueue();
		
		for(int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
		}
		
		queue.display();
		
		reverseQueue(queue);
		
		queue.display();

	}

	private static void reverseQueue(DynamicQueue queue) {
		
		if(queue.isEmpty()) {
			return;
		}
		
		int item = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(item);
		
	}

}

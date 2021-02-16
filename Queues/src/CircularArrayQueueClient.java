
public class CircularArrayQueueClient {

	public static void main(String[] args) {
		
		CircularArrayQueue queue = new CircularArrayQueue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();
		
		//queue.enqueue(60);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.display();
		
		queue.enqueue(60);
		queue.enqueue(70);
		
		queue.display();

	}

}

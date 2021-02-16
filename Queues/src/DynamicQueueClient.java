
public class DynamicQueueClient {

	public static void main(String[] args) {
		
		DynamicQueue q = new DynamicQueue(5);
		
		for(int i = 1; i <= 5; i++) {
			q.enqueue(i*10);
		}
		
		q.display();
		
		q.enqueue(60);
		q.enqueue(70);
		
		for(int i = 1; i <= 10; i++) {
			q.enqueue(i*10);
		}
		
		q.display();
	}

}

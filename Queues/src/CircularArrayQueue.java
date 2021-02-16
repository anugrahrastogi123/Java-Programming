
public class CircularArrayQueue {
	
	int[] arr;
	int cs; // current size of the queue
	int front;
	int rear;
	
	public static int DEFAULT_CAPACITY = 10;
	
	public CircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	public CircularArrayQueue(int capacity) {
		this.arr = new int[capacity];
		
		this.cs = 0;
		this.front = 0;
		this.rear = capacity - 1;
	}
	
	public int size() {
		return this.cs;
	}
	
	public boolean isFull() {
		return this.cs == this.arr.length;
	}
	
	public boolean isEmpty() {
		return this.cs == 0;
	}
	
	public void enqueue(int value) {
		
		if(this.isFull()) {
			System.out.println("Queue is full");
			return;
		}
		
		this.rear = (this.rear + 1) % this.arr.length;
		this.arr[this.rear] = value;
		this.cs = this.cs + 1;
		
	}
	
	public int dequeue() {
		
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		
		int val = this.arr[this.front];
		
		this.front = (this.front + 1) % this.arr.length;
		this.cs = this.cs - 1;
		
		return val;
		
	}
	
	public int getFront() {
		return this.arr[this.front];
	}

	public void display() {
		
		if(this.rear >= this.front) {
			
			for(int i = this.front; i <= this.rear; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println("END");
		}
		else {
			
			for(int i = this.front; i < this.arr.length; i++) {
				System.out.print(arr[i] + ", ");
			}
			for(int i = 0; i <= this.rear; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println("END");
		}
	}

//	public static void main(String[] args) {
//		
//		CircularArrayQueue queue = new CircularArrayQueue();
//		
//		for(int i = 1; i <= 6; i++) {
//			queue.enqueue(i);
//		}
//		
//		queue.dequeue();
//		queue.dequeue();
//		queue.enqueue(8);
//		
//		while(!queue.isEmpty()) {
//			
//			System.out.println(queue.getFront());
//			queue.dequeue();
//		}
//		
//	}

}

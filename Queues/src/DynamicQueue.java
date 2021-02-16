
public class DynamicQueue extends CircularArrayQueue{
	
	public DynamicQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicQueue(int capacity) {
		super(capacity);
	}
	
	@Override
	public void enqueue(int value) {
		
		if(this.cs == this.arr.length) {
			
			int[] data = new int[2*this.arr.length];
			
			int j = -1;
			if(this.rear >= this.front) {
				
				for(int i = this.front; i <= this.rear; i++) {
					data[++j] = this.arr[i];
				}
			}
			else {
				
				for(int i = this.front; i < this.arr.length; i++) {
					data[++j] = this.arr[i];
				}
				for(int i = 0; i <= this.rear; i++) {
					data[++j] = this.arr[i];
				}
			}
			
			this.arr = data;
			
			this.front = 0;
			this.rear = j;
		}
		
		super.enqueue(value);
	}

}

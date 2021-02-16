
public class LinkedList {
	
	private class Node {
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void display() {
		
		System.out.println("--------------");
		
		Node temp = this.head;
		
		while(temp != null) {
			
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
		
		System.out.println();
		System.out.println("--------------");
		
	}
	
	public void addLast(int item) {
		
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		// attach
		if(this.size >= 1) {
			this.tail.next = nn;
		}
		
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			this.tail = nn;
			this.size++;
		}
		
	}
	
	public void addFirst(int item) {
		
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		// attach
		if(this.size >= 1) {
			nn.next = head;
		}
		
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			this.head = nn;
			this.size++;
		}
		
	}
	
	public int getFirst() {
		
		if(this.size == 0) {
			System.out.println("Linked list is empty");
			return -1;
		}
		
		return this.head.data;
	}
	
	public int getLast() {
		
		if(this.size == 0) {
			System.out.println("Linked list is empty");
			return -1;
		}
		
		return this.tail.data;
	}
	
	public int getAt(int idx) throws Exception  {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		if(idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}
		
		Node temp = this.head;
		
		for(int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		
		return temp.data;
		
	}
	
	private Node getNodeAt(int idx) throws Exception  {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		if(idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}
		
		Node temp = this.head;
		
		for(int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		
		return temp;
		
	}
	
	public void addAt(int item, int idx) throws Exception {
		
		if(idx < 0 || idx > size) {
			throw new Exception("Invalid index");
		}
		
		if(idx == 0) {
			addFirst(item);
		}
		else if(idx == this.size) {
			addLast(item);
		}
		else {
			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			
			// attach
			Node nm1 = getNodeAt(idx-1); // node at current index - 1
			Node np1 = nm1.next; // node at index + 1
			
			nm1.next = nn;
			nn.next = np1;
			
			this.size++;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

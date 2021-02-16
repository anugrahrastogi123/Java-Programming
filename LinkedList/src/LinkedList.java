
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
	
	public int removeFirst() throws Exception {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		int rv = this.head.data; // item to be removed
		
		if(this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		else {
			this.head = this.head.next;
			this.size--;
		}
		
		return rv;
		
	}
	
	public int removeLast() throws Exception {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		int rv = this.tail.data; // data to be removed
		
		if(this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		else {
			Node lm2 = getNodeAt(this.size-2); // second last node
			this.tail = lm2;
			this.tail = null;
			this.size--;
		}
		
		return rv;
		
	}
	
	public int removeAt(int idx) throws Exception {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		if(idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}
		
		if(idx == 0) {
			return removeFirst();
		}
		else if(idx == this.size-1) {
			return removeLast();
		}
		else {
			Node nm1 = getNodeAt(idx-1); // node at idx - 1
			Node n = nm1.next; // node at idx
			Node np1 = n.next; // node at idx + 1
			
			nm1.next = np1;
			
			this.size--;
			
			return n.data;
		}
		
	}
	
	public void reverseData() throws Exception {
		
		int left = 0;
		int right = this.size-1;
		
		while(left < right) {
			
			Node ln = getNodeAt(left); // left node
			Node rn = getNodeAt(right); // right node
			
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			
			left++;
			right--;
			
		}
		
	}
	
	public void reversePointers() {
		
		Node prev = this.head;
		Node curr = prev.next;
		
		while(curr != null) {
			
			Node ahead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
			
		}
		
		// swap head and tail
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		
		this.tail.next = null;
		
	}
	
	public int mid() {
		
		Node slow = this.head;
		Node fast = this.head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
		
	}
	
	public int size() {
		return this.size;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

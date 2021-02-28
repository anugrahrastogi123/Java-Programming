package hashMap;

public class HashTable <K, V> {
	
	private class HTPair{
		K key;
		V value;
		
		public HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		// override the equals method of Object class in order to compare the keys
		public boolean equals(Object other) {
			HTPair op = (HTPair) other; // op : other pair
			return this.key.equals(op.key);
		}
		
		// override the toString method of Object class in order to print the HTPair
		public String toString() {
			return "{" + this.key + "-" + this.value + "}";
		}
	}
	
	public static final int DEFAULT_CAPACITY = 10;
	
	// array of Linked List
	LinkedListGenerics<HTPair>[] bucketArray;
	
	// size of hash table
	private int size; 
	
	public HashTable() {
		this(DEFAULT_CAPACITY);
	}
	
	public HashTable(int capacity) {
		this.bucketArray = (LinkedListGenerics<HTPair>[]) new LinkedListGenerics[capacity];
		this.size = 0;
	}
	
	public void put(K key, V value) throws Exception {
		
		int bi = hashFunction(key); // best index
		LinkedListGenerics<HTPair> bucket = this.bucketArray[bi];
		HTPair pta = new HTPair(key, value); // pta : pair to add
		// if array at bi index is null i.e no linked list is attached to it
		if(bucket == null) {
			bucket = new LinkedListGenerics<>();
			bucket.addLast(pta);
			this.bucketArray[bi] = bucket;
			this.size++;
		}
		else {
			// find the pair to be added
			int findAt = bucket.find(pta);
			// if the pair is not present then add it
			if(findAt == -1) {
				bucket.addLast(pta);
				this.size++;
			}
			// else update the value
			else {
				HTPair pair = bucket.getAt(findAt);
				pair.value = value;
			}
		}
		
		// using the concept of load factor to make our time complexity O(1)
		double lambda = (this.size * 1.0) / this.bucketArray.length;
		
		if(lambda > 0.75) {
			this.rehash();
		}
		
	}
	
	// to get the value of the key provided
	public V get(K key) throws Exception {
		
		int bi = hashFunction(key); // best index
		LinkedListGenerics<HTPair> bucket = this.bucketArray[bi];
		
		HTPair ptf = new HTPair(key, null); // ptf : pair to find
		
		if(bucket == null) {
			return null;
		}
		else {
			// find the key in the bucket
			int findAt = bucket.find(ptf);
			// if the key is not present then return null
			if(findAt == -1) {
				return null;
			}
			// else return the value
			else {
				HTPair pair = bucket.getAt(findAt);
				return pair.value;
			}
		}
		
	}
	
	// to remove the key
	public V remove(K key) throws Exception {
		
		int bi = hashFunction(key); // best index
		LinkedListGenerics<HTPair> bucket = this.bucketArray[bi];
		
		HTPair ptf = new HTPair(key, null); // ptf : pair to find
		
		if(bucket == null) {
			return null;
		}
		else {
			// find the key in the bucket
			int findAt = bucket.find(ptf);
			// if the key is not present then return null
			if(findAt == -1) {
				return null;
			}
			// else remove the key and value
			else {
				HTPair pair = bucket.getAt(findAt);
				bucket.removeAt(findAt);
				this.size--;
				return pair.value;
			}
		}
		
	}
	
	// to rehash the hash table
	private void rehash() throws Exception {
		
		LinkedListGenerics<HTPair>[] oba = this.bucketArray; // oba : old bucket array
		
		// create a new bucket array double the size of previous one
		this.bucketArray = (LinkedListGenerics<HTPair>[]) new LinkedListGenerics[2*oba.length];
		this.size = 0;
		
		for(LinkedListGenerics<HTPair> ob : oba) { // ob : old bucket
			
			while(ob != null && ob.size() != 0) {
				// remove the first item from the linked list
				HTPair pair = ob.removeFirst();
				// again put the removed item in the new bucket array
				this.put(pair.key, pair.value);
			}
			
		}
		
	}
	
	// function to generate hash code for the given key
	private int hashFunction(K key) {
		
		int hc = key.hashCode(); // hash code
		hc = Math.abs(hc);
		int bi = hc % this.bucketArray.length;
		
		return bi;
		
	}
	
	public void display() {
		for(LinkedListGenerics<HTPair> bucket : this.bucketArray) {
			if(bucket != null && bucket.size() != 0) {
				bucket.display();
			}
			else {
				System.out.println("null");
			}
		}
	}

}

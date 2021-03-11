package graph;

import java.util.ArrayList;
import java.util.HashMap;

// we are applying a bound on T by extending Comparable
// so that generic heap will only accept only those T which has implemented Comparable 
// so T class should implement Comparable
// this means that if T has implemented Comparable then it would have also implemented compareTo method
public class HeapGeneric<T extends Comparable<T>> {
	
	ArrayList<T> data = new ArrayList<>();
	
	// this hash map stores the index of each element present in heap
	HashMap<T, Integer> map = new HashMap<>();
	
	public void add(T item) {
		
		data.add(item);
		// store the index of the element added
		map.put(item, this.data.size()-1);
		upheapify(data.size()-1);
		
	}
	
	public T remove() {
		
		swap(0, this.data.size()-1);
		T rv = this.data.remove(this.data.size()-1); // remove the last item
		
		downheapify(0);
		
		map.remove(rv);
		
		return rv;
		
	}
	
	public T get() {
		return this.data.get(0);
	}

	private void downheapify(int pi) { // pi : parent index
		
		int lci = 2*pi + 1; // left child index
		int rci = 2*pi + 2; // right child index
		
		int mini = pi; // index of min. of pi, lci and rci
		
		if(lci < this.data.size() && isLarger(data.get(lci), data.get(mini)) < 0) {
			mini = lci;
		}
		
		if(rci < this.data.size() && isLarger(data.get(rci), data.get(mini)) < 0) {
			mini = rci;
		}
		
		if(mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
		
	}

	private void upheapify(int ci) { // ci : child index

		int pi = (ci-1)/2; // parent idx
		
		if(isLarger(data.get(ci), data.get(pi)) < 0) {
			swap(pi, ci);
			upheapify(pi);
		}
		
	}
	
	private void swap(int i, int j) {
		
		T ith = data.get(i);
		T jth = data.get(j);
		
		data.set(i, jth);
		data.set(j, ith);
		
		map.put(ith, j);
		map.put(jth, i);
		
	}
	
	public void display() {
		System.out.println(data);
	}
	
	public int size() {
		return data.size();
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	// if t is having higher priority then return +ve value
	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}
	
	// this function is used in prims algo
	public void updatePriority(T pair) {
		
		// get the index of the prims pair
		int index = map.get(pair);
		
		upheapify(index);
		
	}

}

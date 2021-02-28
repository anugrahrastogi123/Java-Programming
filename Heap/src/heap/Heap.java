package heap;

import java.util.ArrayList;

public class Heap {
	
	ArrayList<Integer> data = new ArrayList<Integer>();
	
	public void add(int item) {
		
		data.add(item);
		
		upheapify(data.size()-1);
		
	}
	
	public int remove() {
		
		swap(0, this.data.size()-1);
		int rv = this.data.remove(this.data.size()-1); // remove the last item
		
		downheapify(0);
		
		return rv;
		
	}
	
	public int get() {
		return this.data.get(0);
	}

	private void downheapify(int pi) { // pi : parent index
		
		int lci = 2*pi + 1; // left child index
		int rci = 2*pi + 2; // right child index
		
		int mini = pi; // index of min. of pi, lci and rci
		
		if(lci < this.data.size() && data.get(lci) < data.get(mini)) {
			mini = lci;
		}
		
		if(rci < this.data.size() && data.get(rci) < data.get(mini)) {
			mini = rci;
		}
		
		if(mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
		
	}

	private void upheapify(int ci) { // ci : child index

		int pi = (ci-1)/2; // parent idx
		
		if(data.get(ci) < data.get(pi)) {
			swap(pi, ci);
			upheapify(pi);
		}
		
	}
	
	private void swap(int i, int j) {
		
		int ith = data.get(i);
		int jth = data.get(j);
		
		data.set(i, jth);
		data.set(j, ith);
		
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

}

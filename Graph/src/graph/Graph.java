package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<String, Integer>(); // neighbours
	}

	HashMap<String, Vertex> vtces; // vertices

	public Graph() {
		vtces = new HashMap<>();
	}

	// find number of vertex in the graph
	public int numVertex() {
		return this.vtces.size();
	}

	// check whether the given vertex is present or not
	public boolean containsVertex(String vname) { // vertex name
		return this.vtces.containsKey(vname);
	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vtces.put(vname, vtx);
	}

	public void removeVertex(String vname) {

		Vertex vtx = vtces.get(vname);

		ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());

		for (String key : keys) {
			Vertex nbrVtx = vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}

		vtces.remove(vname);
	}

	// find number of edges present in graph
	public int numEdges() {

		int count = 0;

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String key : keys) {
			Vertex vtx = vtces.get(key);
			count += vtx.nbrs.size();
		}

		// each edge is counted twice, so we get 2 times the actual no. of edges
		// so dividing by 2
		return count / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		// if vertex1 or vertex2 is not present or vertex1 and vertex2 are not connected
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;
	}

	// add edge between vtx1 and vtx2 with given cost
	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		// if vertex1 or vertex2 is not present or vertex1 and vertex2 are connected
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		// if vertex1 or vertex2 is not present or vertex1 and vertex2 are not connected
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void display() {

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());

		for (String key : keys) {

			Vertex vtx = vtces.get(key);
			System.out.println(key + " : " + vtx.nbrs);
		}
	}

	public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed) {

		// mark the visited vertex as processed
		processed.put(vname1, true);

		// direct edge
		if (containsEdge(vname1, vname2)) {
			return true;
		}

		Vertex vtx = vtces.get(vname1);

		ArrayList<String> nbrs = new ArrayList<String>(vtx.nbrs.keySet());

		for (String nbr : nbrs) {
			if (!processed.containsKey(nbr) && hasPath(nbr, vname2, processed)) {
				return true;
			}
		}

		return false;
	}

	private class Pair {
		String vname; // vertex name
		String psf; // path so far
	}

	public boolean bfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> queue = new LinkedList<>();

		// create a new pair
		Pair sp = new Pair(); // starting pair
		sp.vname = src;
		sp.psf = src;

		// put the new pair in queue
		queue.addLast(sp);

		// while the queue is not empty keep on doing the work
		while (!queue.isEmpty()) {

			// remove a pair from queue
			Pair rp = queue.removeFirst(); // rp : remove pair

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// processed put
			processed.put(rp.vname, true);

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// nbrs of removed pair
			Vertex rpvtx = vtces.get(rp.vname);
			ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

			// loop on nbrs
			for (String nbr : nbrs) {
				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {
					// make a new pair of nbr and put in queue
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}
			}
		}

		return false;

	}

	public boolean dfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> stack = new LinkedList<>();

		// create a new pair
		Pair sp = new Pair(); // starting pair
		sp.vname = src;
		sp.psf = src;

		// put the new pair in stack
		stack.addFirst(sp);

		// while the stack is not empty keep on doing the work
		while (!stack.isEmpty()) {

			// remove a pair from stack
			Pair rp = stack.removeFirst(); // rp : remove pair

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// processed put
			processed.put(rp.vname, true);

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// nbrs of removed pair
			Vertex rpvtx = vtces.get(rp.vname);
			ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

			// loop on nbrs
			for (String nbr : nbrs) {
				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {
					// make a new pair of nbr and put in stack
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					stack.addFirst(np);
				}
			}
		}

		return false;

	}

	// breadth first traversal
	public void bft() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<String>(vtces.keySet());

		// for every node repeat the process
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// create a new pair
			Pair sp = new Pair(); // starting pair
			sp.vname = key;
			sp.psf = key;

			// put the new pair in queue
			queue.addLast(sp);

			// while the queue is not empty keep on doing the work
			while (!queue.isEmpty()) {

				// remove a pair from queue
				Pair rp = queue.removeFirst(); // rp : remove pair

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs of removed pair
				Vertex rpvtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

				// loop on nbrs
				for (String nbr : nbrs) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						// make a new pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}

		}

	}

	// depth first traversal
	public void dft() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> stack = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<String>(vtces.keySet());

		// for every node repeat the process
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// create a new pair
			Pair sp = new Pair(); // starting pair
			sp.vname = key;
			sp.psf = key;

			// put the new pair in queue
			stack.addFirst(sp);

			// while the stack is not empty keep on doing the work
			while (!stack.isEmpty()) {

				// remove a pair from stack
				Pair rp = stack.removeFirst(); // rp : remove pair

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs of removed pair
				Vertex rpvtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

				// loop on nbrs
				for (String nbr : nbrs) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						// make a new pair of nbr and put in stack
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						stack.addFirst(np);
					}
				}
			}

		}

	}

	public boolean isCyclic() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<String>(vtces.keySet());

		// for every node repeat the process
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// create a new pair
			Pair sp = new Pair(); // starting pair
			sp.vname = key;
			sp.psf = key;

			// put the new pair in queue
			queue.addLast(sp);

			// while the queue is not empty keep on doing the work
			while (!queue.isEmpty()) {

				// remove a pair from queue
				Pair rp = queue.removeFirst(); // rp : remove pair

				if (processed.containsKey(rp.vname)) {
					return true;
				}

				// processed put
				processed.put(rp.vname, true);

				// nbrs of removed pair
				Vertex rpvtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

				// loop on nbrs
				for (String nbr : nbrs) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						// make a new pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}

		}

		return false;

	}

	public boolean isConnected() {

		int flag = 0;

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<String>(vtces.keySet());

		// for every node repeat the process
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// if we are coming in this region for the 2nd time then this means that the
			// graph
			// is not connected
			// and the value of value will denote the number of components in the graph
			flag++;

			// create a new pair
			Pair sp = new Pair(); // starting pair
			sp.vname = key;
			sp.psf = key;

			// put the new pair in queue
			queue.addLast(sp);

			// while the queue is not empty keep on doing the work
			while (!queue.isEmpty()) {

				// remove a pair from queue
				Pair rp = queue.removeFirst(); // rp : remove pair

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				// nbrs of removed pair
				Vertex rpvtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

				// loop on nbrs
				for (String nbr : nbrs) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						// make a new pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}

		}

		if (flag >= 2) {
			return false;
		} else {
			return true;
		}

	}

	public boolean isTree() {
		return !isCyclic() && isConnected();
	}

	public ArrayList<ArrayList<String>> getConnectedComponents() {

		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();

		LinkedList<Pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<String>(vtces.keySet());

		// for every node repeat the process
		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// for a new component create a new array list
			ArrayList<String> subans = new ArrayList<String>();

			// create a new pair
			Pair sp = new Pair(); // starting pair
			sp.vname = key;
			sp.psf = key;

			// put the new pair in queue
			queue.addLast(sp);

			// while the queue is not empty keep on doing the work
			while (!queue.isEmpty()) {

				// remove a pair from queue
				Pair rp = queue.removeFirst(); // rp : remove pair

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				// add in subans array list
				subans.add(rp.vname);

				// nbrs of removed pair
				Vertex rpvtx = vtces.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());

				// loop on nbrs
				for (String nbr : nbrs) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						// make a new pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}

			// put subans in final ans
			ans.add(subans);

		}

		return ans;

	}

	// Kruskal's Algorithm

	public class DisjointSet {

		HashMap<String, Node> map = new HashMap<>();

		private class Node {
			String data;
			Node parent;
			int rank;
		}

		// create a set for the given value
		public void create(String value) {

			Node nn = new Node();
			nn.data = value;
			nn.parent = nn;
			nn.rank = 0;

			map.put(value, nn);

		}

		// union the sets in which value1 and value2 are present
		// union by rank
		public void union(String value1, String value2) {

			Node n1 = map.get(value1);
			Node n2 = map.get(value2);

			Node re1 = find(n1); // representative element of n1 i.e value1
			Node re2 = find(n2); // representative element of n2 i.e value2

			// if value1 and value2 belong to the same set then ignore
			if (re1.data.equals(re2.data)) {
				return;
			} else {
				if (re1.rank == re2.rank) {
					re2.parent = re1;
					re1.rank = re1.rank + 1;
				} else if (re1.rank > re2.rank) {
					re2.parent = re1;
				} else {
					re1.parent = re2;
				}
			}

		}

		// find the representative element of the set which contains the given value
		// this find is used in Union by Rank
		public String find(String value) {

			return find(map.get(value)).data;

		}

		// this find is used in Union by Rank
		private Node find(Node node) {

			// root node
			if (node == node.parent) {
				return node;
			}

			// moving upward towards the root node
			Node rr = find(node.parent); // recursion result
			return rr;

		}

		// union by Path Compression
		public void unionPC(String value1, String value2) {

			Node n1 = map.get(value1);
			Node n2 = map.get(value2);

			Node re1 = findPC(n1); // representative element of n1 i.e value1
			Node re2 = findPC(n2); // representative element of n2 i.e value2

			// if value1 and value2 belong to the same set then ignore
			if (re1.data.equals(re2.data)) {
				return;
			} else {
				if (re1.rank == re2.rank) {
					re2.parent = re1;
					re1.rank = re1.rank + 1;
				} else if (re1.rank > re2.rank) {
					re2.parent = re1;
				} else {
					re1.parent = re2;
				}
			}

		}

		// this find does Path Compression
		public String findPC(String value) {

			return findPC(map.get(value)).data;

		}

		// this find does Path Compression
		private Node findPC(Node node) {

			// root node
			if (node == node.parent) {
				return node;
			}

			// moving upward towards the root node
			Node rr = findPC(node.parent); // recursion result
			node.parent = rr; // this part does the path compression
			return rr;

		}

	}

	private class EdgePair implements Comparable<EdgePair> {
		String v1; // vertex 1
		String v2; // vertex 2
		int cost; // cost between vertex 1 and vertex 2

		@Override
		public int compareTo(EdgePair o) {
			return this.cost - o.cost;
		}

		public String toString() {
			return v1 + "-" + v2 + " : " + cost;
		}
	}

	public ArrayList<EdgePair> getAllEdges() {

		ArrayList<EdgePair> edges = new ArrayList<>();

		for (String vname : vtces.keySet()) {

			Vertex vtx = vtces.get(vname);

			for (String nbr : vtx.nbrs.keySet()) {

				EdgePair ep = new EdgePair();
				ep.v1 = vname;
				ep.v2 = nbr;
				ep.cost = vtx.nbrs.get(nbr);

				edges.add(ep);
			}
		}

		return edges;

	}

	public void kruskal() {

		// sort all the edges in increasing order of cost
		ArrayList<EdgePair> edges = getAllEdges();
		Collections.sort(edges);

		DisjointSet set = new DisjointSet();

		// create set for each vertex
		for (String vname : vtces.keySet()) {

			set.create(vname);
		}

		// traverse over the edges
		for (EdgePair edge : edges) {

			String re1 = set.find(edge.v1);
			String re2 = set.find(edge.v2);

			if (re1.equals(re2)) {
				continue;
			} else {
				System.out.println(edge);
				set.union(edge.v1, edge.v2);
			}
		}

	}

	// Prims Algorithm
	private class PrimsPair implements Comparable<PrimsPair> {
		String vname; // vertex name
		String acqvname; // through which vertex we acquired vname i.e the parent of vname
		int cost; // cost between vname and acqvname

		@Override
		public int compareTo(PrimsPair o) {
			return this.cost - o.cost;
		}
	}

	public Graph prims() {

		Graph mst = new Graph(); // minimum spanning tree
		// hash map contains each vertex with address to its prims pair in heap
		HashMap<String, PrimsPair> map = new HashMap<>();

		// min heap
		HeapGeneric<PrimsPair> heap = new HeapGeneric<>();

		// add each vertex to the heap and hash map with acqvname(or its parent) as null
		// and cost as infinity
		for (String key : vtces.keySet()) {

			PrimsPair np = new PrimsPair(); // new pair
			np.vname = key;
			np.acqvname = null;
			np.cost = Integer.MAX_VALUE;

			heap.add(np);
			map.put(key, np);
		}

		// till the heap is not empty keep on removing the pairs
		while (!heap.isEmpty()) {

			// remove a pair
			PrimsPair rp = heap.remove(); // removed pair
			// remove it from the map as well; basically it is used to mark the vertex as
			// visited
			map.remove(rp.vname);

			// add the removed vertex to mst
			if (rp.acqvname == null) {
				// if its parent is null, then just add the vertex
				mst.addVertex(rp.vname);
			} else {
				// add the removed vertex
				// and then add the edge between the removed vertex and its parent(acqvname)
				mst.addVertex(rp.vname);
				mst.addEdge(rp.vname, rp.acqvname, rp.cost);
			}

			// update the nbrs of the removed vertex
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// if the nbr is present in the heap, only then update it
				// if the nbr is present in heap then it is present in hash map as well
				if (map.containsKey(nbr)) {

					int oc = map.get(nbr).cost; // old cost of nbr
					int nc = vtces.get(rp.vname).nbrs.get(nbr); // new cost

					// if the new cost is less than old cost
					// then update its parent and cost
					if (nc < oc) {

						PrimsPair gp = map.get(nbr); // get pair

						gp.acqvname = rp.vname;
						gp.cost = nc;

						heap.updatePriority(gp);
					}
				}
			}
		}

		return mst;

	}

	// Dijkstra Algorithm
	// single source shortest path algorithm
	private class DijkstraPair implements Comparable<DijkstraPair> {
		String vname; // vertex name
		String psf; // path so far
		int cost; // minimum cost from source to vertex

		@Override
		public int compareTo(DijkstraPair o) {
			return this.cost - o.cost;
		}
	}

	public HashMap<String, Integer> dijkstra(String src) {

		// hash map contains each vertex and its minimum cost from source vertex to that particular vertex
		HashMap<String, Integer> ans = new HashMap<>();
		// hash map contains each vertex with address to its dijkstra pair in heap
		HashMap<String, DijkstraPair> map = new HashMap<>();

		// min heap
		HeapGeneric<DijkstraPair> heap = new HeapGeneric<>();

		// add each vertex to the heap and hash map
		for (String key : vtces.keySet()) {

			DijkstraPair np = new DijkstraPair(); // new pair
			np.vname = key;
			np.psf = "";
			np.cost = Integer.MAX_VALUE;

			if(key.equals(src)) {
				np.psf = key;
				np.cost = 0;
			}
			
			heap.add(np);
			map.put(key, np);
		}

		// till the heap is not empty keep on removing the pairs
		while (!heap.isEmpty()) {

			// remove a pair
			DijkstraPair rp = heap.remove(); // removed pair
			// remove it from the map as well; basically it is used to mark the vertex as
			// visited
			map.remove(rp.vname);

			// add to ans
			ans.put(rp.vname, rp.cost);

			// update the nbrs of the removed vertex
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// if the nbr is present in the heap, only then update it
				// if the nbr is present in heap then it is present in hash map as well
				if (map.containsKey(nbr)) {

					int oc = map.get(nbr).cost; // old cost of nbr
					int nc = rp.cost + vtces.get(rp.vname).nbrs.get(nbr); // new cost

					// if the new cost is less than old cost
					// then update its path so far and cost
					if (nc < oc) {

						DijkstraPair gp = map.get(nbr); // get pair

						gp.psf = rp.psf + nbr;
						gp.cost = nc;

						heap.updatePriority(gp);
					}
				}
			}
		}

		return ans;

	}
	
	public HashMap<String, Integer> bellmanFord(String src){
		
		ArrayList<EdgePair> edges = getAllEdges();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String vname : vtces.keySet()) {
			
			map.put(vname, 100000);
			
			if(src.equals(vname)) {
				map.put(vname, 0);
			}
		}
		
		int V = vtces.size(); // number of vertices
		
		// relax every edge v-1 times
		for(int i = 1; i <= V; i++) {
			
			// loop on edges
			for(EdgePair edge : edges) {
				
				int oc = map.get(edge.v2); // old cost of vertex v2
				int nc = map.get(edge.v1) + edge.cost; // new cost
				
				if(oc > nc) {
					if(i <= V-1)
						map.put(edge.v2, nc);
					else
						System.out.println("negative weight cycle present");
				}
			}
		}
		
		return map;
		
	}

}





























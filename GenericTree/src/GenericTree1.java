import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree1 {
	
	Scanner s = new Scanner(System.in);
	
	private class Node {
		
		int data;
		ArrayList<Node> children = new ArrayList<>();
		
	}
	
	private Node root;
	
	
	public GenericTree1() {
		root = construct(null, -1);
	}
	
	// create ith child of the given parent
	private Node construct(Node parent, int ith) { 
		
		// prompt
		if(parent == null) {
			System.out.println("Enter the data for root node ");
		}
		else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data);
		}
		
		// take input of data
		int item = s.nextInt();
		
		// create a new node nn
		Node nn = new Node();
		
		// update the data
		nn.data = item;
		
		// prompt
		System.out.println("Enter the number of children for " + nn.data);
		
		// take input for children
		int noc = s.nextInt(); // number of children
		
		// loop
		for(int j = 0; j < noc; j++) {
			
			Node child = construct(nn, j);
			nn.children.add(child);
			
		}
		
		return nn;
		
	}
	
	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		
		// self work
		String str = node.data + " --> ";
		
		for(Node child : node.children) {
			str += child.data + " ";
		}
		
		str += ".";
		System.out.println(str);
		
		// smaller problem
		for(Node child : node.children) {
			display(child);
		}
		
	}
	
	// return the size of the generic tree
	public int size() {
		return size(root);
	}
	
	private int size(Node node) {
		
		int sum = 0;
		
		for(Node child : node.children) {
			sum += size(child);
		}
		
		return sum + 1;
		
	}
	
	// find maximum in the tree
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		
		int tm = node.data; // total max
		
		for(Node child : node.children) {
			int cm = max(child); // child max
			
			if(cm > tm) {
				tm = cm;
			}
		}
		
		return tm;
		
	}
	
	// find the particular item in the tree
	public boolean find(int item) {
		return find(item, root);
	}
	
	private boolean find(int item, Node node) {
		
		if(node.data == item) {
			return true;
		}
		
		// boolean tf = false; // total find
		
		for(Node child : node.children) {
			boolean cf = find(item, child); // child find
			// tf = tf || cf;
			if(cf) {
				return true;
			}
		}
		
		//return tf;
		return false;
		
	}
	
	// find the height of the tree
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		
		int th = -1; // total height
		
		for(Node child : node.children) {
			int ch = height(child); // child height
			
			if(ch > th) {
				th = ch;
			}
		}
		
		return th + 1;
		
	}
	
}

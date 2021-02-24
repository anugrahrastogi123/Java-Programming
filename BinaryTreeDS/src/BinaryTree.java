import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	
	Scanner s = new Scanner(System.in);
	
	private class Node {
		
		int data;
		Node left;
		Node right;
		
	}
	
	private Node root;
	
	public BinaryTree() {
		root = takeInput(null, false);
	}
	
	// ilc -> is left child
	// true -> create left child
	// false -> create right child
	private Node takeInput(Node parent, boolean ilc) {
		
		// prompt
		if(parent == null) {
			System.out.println("Enter the data for root node");
		}
		else {
			if(ilc) {
				System.out.println("Enter the data for the left child of " + parent.data);
			}
			else {
				System.out.println("Enter the data for the right child of " + parent.data);
			}
		}
		
		// take input of data from user
		int item = s.nextInt();
		
		Node nn = new Node(); // new node
		nn.data = item;
		
		// ask the user the node has left child
		System.out.println(nn.data + " has left child ?");
		// take input either true or false
		boolean hlc = s.nextBoolean(); // has left child
		
		// if left child exists, then create it
		if(hlc) {
			nn.left = takeInput(nn, true);
		}
		
		// ask the user the node has right child
		System.out.println(nn.data + " has right child ?");
		// take input either true or false
		boolean hrc = s.nextBoolean(); // has right child
		
		// if right child exists, then create it
		if(hrc) {
			nn.right = takeInput(nn, false);
		}
		
		// node is ready, now return the node
		return nn;
		
	}
	
	// Preorder-Inorder construct tree
	public BinaryTree(int[] preorder, int[] inorder) {
		root = construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
	
	// plo -> preorder low index
	// phi -> preorder high index
	// ilo -> inorder low index
	// ihi -> inorder high index
	private Node construct(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
		
		if(ilo > ihi || plo > phi) {
			return null;
		}
		
		// create a new node with plo
		Node nn = new Node();
		nn.data = preorder[plo];
		
		// search for preorder[plo] in inorder
		int si = -1; // search index
		int nel = 0; // number of elements before preorder[plo]
		for(int i = ilo; i < ihi; i++) {
			if(preorder[plo] == inorder[i]) {
				si = i;
				break;
			}
			nel++;
		}
		
		// left and right call
		nn.left = construct(preorder, plo+1, plo+nel, inorder, ilo, si-1);
		nn.right = construct(preorder, plo+nel+1, phi, inorder, si+1, ihi);
		
		return nn;
		
	}

	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		
		// base case
		if(node == null)
			return;
		
		// self work
		String str = "";
		
		if(node.left == null)
			str += ".";
		else
			str += node.left.data;
		
		str += "->" + node.data + "<-";
		
		if(node.right == null)
			str += ".";
		else
			str += node.right.data;
		
		System.out.println(str);
		
		// smaller problems
		display(node.left);
		display(node.right);
		
	}
	
	public int size() {
		return size(root);
	}

	private int size(Node node) {
		
		if(node == null)
			return 0;
		
		int ls = size(node.left); // size of left subtree
		int rs = size(node.right); // size of right subtree
		
		return ls + rs + 1;
		
	}
	
	public int max() {
		return max(root);
	}

	private int max(Node node) {
		
		if(node == null)
			return Integer.MIN_VALUE;
		
		int lm = max(node.left); // max in left subtree
		int rm = max(node.right); // max in right subtree
		
		return Math.max(node.data, Math.max(lm, rm));
		
	}
	
	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		
		if(node == null)
			return false;
		
		if(node.data == item)
			return true;
		
		boolean lf = find(node.left, item); // find the item in left subtree
		boolean rf = find(node.right, item); // find the item in right subtree
		
		return lf || rf;
		
	}
	
	public int height() {
		return height(root);
	}

	private int height(Node node) {
		
		if(node == null)
			return -1;
		
		int hl = height(node.left); // height of left subtree
		int hr = height(node.right); // height of right subtree
		
		return Math.max(hl, hr) + 1;
		
	}
	
	// Approach 1 to find the diameter of a binary tree
	int diameterAns = Integer.MIN_VALUE;
	public int diameter1() {
		diameter1(root);
		
		return diameterAns;
	}

	private void diameter1(Node node) {
		
		if(node == null)
			return;
		
		int parentNodeRoot = height(node.left) + height(node.right) + 2;
		
		if(parentNodeRoot > diameterAns) {
			diameterAns = parentNodeRoot;
		}
		
		diameter1(node.left);
		diameter1(node.right);
		
	}
	
	// Approach 2 to find the diameter of a binary tree
	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {
		
		if(node == null) {
			return 0;
		}
		
		// max distance between 2 leaf nodes might lie in left subtree : left ka diameter
		int ld = diameter2(node.left);
		
		// max distance between 2 leaf nodes might lie in right subtree : right ka diameter
		int rd = diameter2(node.right);
		
		// self node might be the root node of the diameter
		int sd = height(node.left) + height(node.right) + 2;
		
		return Math.max(sd, Math.max(ld, rd));
		
	}
	
	private class Diapair {
		
		int dia = 0; // diameter
		int ht = -1; // height
		
	}
	
	public int diameter3() {
		return diameter3(root).dia;
	}
	
	private Diapair diameter3(Node node) {
		
		if(node == null) {
			return new Diapair();
		}
		
		Diapair ldp = diameter3(node.left); // left diapair
		
		Diapair rdp = diameter3(node.right); // right diapair
		
		Diapair sdp = new Diapair();
		
		int ld = ldp.dia; // left diameter
		int rd = rdp.dia; // right diameter
		int sd = ldp.ht + rdp.ht + 2; // self diameter
		
		sdp.dia = Math.max(sd, Math.max(ld, rd));
		
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
		
		return sdp;
		
	}
	
	// O(n^2)
	public boolean isBalanced1() {
		return isBalanced1(root);
	}

	private boolean isBalanced1(Node node) {
		
		if(node == null) {
			return true;
		}
		
		boolean lb = isBalanced1(node.left); // left balanced
		boolean rb = isBalanced1(node.right); // right balanced
		
		int bf = height(node.left) - height(node.right); // balancing factor
		
		if(lb && rb && bf >= -1 && bf <= 1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// another approach for isBalanced -> O(n)
	private class BalPair {
		
		boolean isBal = true; // is balanced
		int ht = -1; // height
		
	}
	
	public boolean isBalanced2() {
		return isBalanced2(root).isBal;
	}

	private BalPair isBalanced2(Node node) {
		
		if(node == null) {
			return new BalPair();
		}
		
		BalPair lbp = isBalanced2(node.left); // left balanced pair
		BalPair rbp = isBalanced2(node.right); // right balanced pair
		
		BalPair sbp = new BalPair(); // self balanced pair
		
		boolean lb = lbp.isBal; // left balanced
		boolean rb = rbp.isBal; // right balanced
		
		int bf = lbp.ht - rbp.ht; // balancing factor
		
		if(lb && rb && bf >= -1 && bf <= 1) {
			sbp.isBal = true;
		}
		else {
			sbp.isBal = false;
		}
		
		sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
		
		return sbp;
		
	}
	
	public boolean flipEquivalent(BinaryTree other) {
		return flipEquivalent(root, other.root);
	}

	private boolean flipEquivalent(Node node1, Node node2) {
		
		if(node1 == null && node2 == null) {
			return true;
		}
		
		if(node1 == null || node2 == null) {
			return false;
		}
		
		if(node1.data != node2.data) {
			return false;
		}
		
		boolean ll = flipEquivalent(node1.left, node2.left); // left subtree of node1 and node2 is same and are not flipped
		boolean rr = flipEquivalent(node1.right, node2.right); // right subtree of node1 and node2 is same and are not flipped
		boolean lr = flipEquivalent(node1.left, node2.right); // left subtree of node 1 is flip equivalent of right subtree of node2
		boolean rl = flipEquivalent(node1.right, node2.left); // right subtree of node 1 is flip equivalent of left subtree of node2
		
		return (ll && rr) || (lr && rl);
		
	}
	
	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {

		if(node == null) {
			return;
		}
		
		// node
		System.out.println(node.data);
		// left
		preorder(node.left);
		// right
		preorder(node.right);
		
	}
	
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {

		if(node == null) {
			return;
		}
		
		// left
		postorder(node.left);
		// right
		postorder(node.right);
		// node
		System.out.println(node.data);
		
	}
	
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {

		if(node == null) {
			return;
		}
		
		// left
		inorder(node.left);
		// node
		System.out.println(node.data);
		// right
		inorder(node.right);
		
	}
	
	// Preorder Iteratively
	private class Pair{
		Node node;
		boolean sd; // self done
		boolean ld; // left done
		boolean rd; // right done
	}
	
	public void preorderI() {
		
		// create a stack
		Stack<Pair> stack = new Stack<>();
		
		// create a starting pair
		Pair sp = new Pair();
		sp.node = root;
		// sd, ld and rd will be automatically initialized to false
		
		// push starting pair in stack
		stack.push(sp);
		
		// work till your stack is not empty
		while(!stack.isEmpty()) {
			
			// get top pair
			Pair tp = stack.peek();
			
			if(tp.sd == false) {
				System.out.println(tp.node.data);
				tp.sd = true;
			}
			else if(tp.ld == false) {
				
				// create a new pair
				Pair np = new Pair();
				np.node = tp.node.left;
				
				// push the new pair into stack
				if(np.node != null)
					stack.push(np);
				
				// make left done true
				tp.ld = true;
				
			}
			else if(tp.rd == false) {
				
				// create a new pair
				Pair np = new Pair();
				np.node = tp.node.right;
				
				// push the new pair into stack
				if(np.node != null)
					stack.push(np);
				
				// make left done true
				tp.rd = true;
				
			}
			else {
				// sd, ld and rd are true
				stack.pop();
			}
			
		}
		
	}
	
	public int sum() {
		return sum(root);
	}

	private int sum(Node node) {
		
		if(node == null) {
			return 0;
		}
		
		int ls = sum(node.left); // sum of left subtree
		int rs = sum(node.right); // sum of right subtree
		
		return ls + rs + node.data;
		
	}
	
	public void levelOrder() {
		
		LinkedList<Node> queue = new LinkedList<>();
		
		queue.add(this.root);
		
		while(!queue.isEmpty()) {
			
			Node rv = queue.removeFirst();
			
			System.out.print(rv.data + ", ");
			
			if(rv.left != null) {
				queue.addLast(rv.left);
			}
			if(rv.right != null) {
				queue.addLast(rv.right);
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	

}

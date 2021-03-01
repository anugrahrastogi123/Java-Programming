package segTree;

public class SegmentTree {
	
	private class Node{
		int data;
		int startInterval;
		int endInterval;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public SegmentTree(int[] arr) {
		root = construct(arr, 0, arr.length-1);
	}

	private Node construct(int[] arr, int si, int ei) {
		
		if(si == ei) {
			Node leafNode = new Node();
			leafNode.data = arr[si];
			leafNode.startInterval = si;
			leafNode.endInterval = ei;
			
			return leafNode;
		}
		
		Node nn = new Node();
		nn.startInterval = si;
		nn.endInterval = ei;
		
		int mid = (si+ei)/2;
		
		nn.left = construct(arr, si, mid);
		nn.right = construct(arr, mid+1, ei);
		
		nn.data = nn.left.data + nn.right.data;
		
		return nn;
		
	}
	
	public void display() {
		display(root);
	}

	private void display(Node node) {
		
		String str = "";
		
		if(node.left != null) {
			str += "Interval[" + node.left.startInterval + "," + node.left.endInterval + 
					"] Data = " + node.left.data + " => ";
		}
		else {
			str += "No left child => ";
		}
		
		str += "Interval[" + node.startInterval + "," + node.endInterval + 
				"] Data = " + node.data;
		
		if(node.right != null) {
			str += " <= Interval[" + node.right.startInterval + "," + node.right.endInterval + 
					"] Data = " + node.right.data;
		}
		else {
			str += " <= No right child";
		}
		
		System.out.println(str);
		
		if(node.left != null) {
			display(node.left);
		}
		
		if(node.right != null) {
			display(node.right);
		}
		
	}
	
	// qsi : query start index
	// qei : query end index
	// to find sum from index qsi to qei
	public int query(int qsi, int qei) {
		return query(root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		
		// node is completely lying inside query so will contribute to the answer
		if(node.startInterval >= qsi && node.endInterval <= qei) {
			return node.data;
		}
		// node is completely outside the range of query
		else if(node.startInterval > qei || node.endInterval < qsi) {
			// return default value of query
			return 0;
		}
		// overlapping case
		else {
			int leftAns = query(node.left, qsi, qei);
			int rightAns = query(node.right, qsi, qei);
			
			return leftAns + rightAns;
		}
		
	}
	
	// update at given index with a new value
	public void update(int index, int newVal) {
		root.data = update(root, index, newVal);
	}

	private int update(Node node, int index, int newVal) {

		if(index >= node.startInterval && index <= node.endInterval) {
			if(index == node.startInterval && index == node.endInterval) {
				node.data = newVal;
				
			}
			else {
				int leftVal = update(node.left, index, newVal);
				int rightVal = update(node.right, index, newVal);
				
				node.data = leftVal + rightVal;
			}
		}
		
		return node.data;
		
	}

}

























package segTree;

public class SegmentTreeClient {

	public static void main(String[] args) {
		
		int[] arr = {3, 8, 7, 6, -2, -8, 4, 9};
		
		SegmentTree st = new SegmentTree(arr);
		
		st.display();
		
		// find sum from index 2 to 6
		System.out.println(st.query(2, 6));
		
		// update 3rd index with value 14
		st.update(3, 14);
		
		// find new sum (after update) from index 2 to 6
		System.out.println(st.query(2, 6));

	}

}

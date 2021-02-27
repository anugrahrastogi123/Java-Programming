
public class BSTClient {

	public static void main(String[] args) {
		
		BST bst = new BST(new int[] {10, 20, 30, 40, 50, 60 ,70}); // inorder traversal
		
		bst.display();
		
		System.out.println(bst.find(40));
		
		System.out.println(bst.max());
		
		bst.add(55);
		
		bst.display();
		
		bst.remove(55);

		bst.display();
		
		bst.remove(40);
		
		bst.display();

	}

}

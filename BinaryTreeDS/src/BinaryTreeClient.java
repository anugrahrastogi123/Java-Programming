
public class BinaryTreeClient {

	public static void main(String[] args) {
		
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
		
		BinaryTree bt = new BinaryTree();
		
		bt.display();
		
		System.out.println(bt.size());
		
		System.out.println(bt.max());
		
		System.out.println(bt.find(30));
		
		System.out.println(bt.height());
		
		System.out.println(bt.diameter3());
		
		System.out.println(bt.isBalanced1());
		
		System.out.println(bt.isBalanced2());
		
		System.out.println("----------");
		bt.preorder();
		
		System.out.println("----------");
		bt.postorder();
		
		System.out.println("----------");
		bt.inorder();
		
		System.out.println("----------");
		bt.preorderI();
		
		System.out.println("----------");
		bt.levelOrder();
		System.out.println();
		System.out.println("----------");
		
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		BinaryTree bt2 = new BinaryTree(preorder, inorder);
		
		bt2.display();
		
		

	}

}

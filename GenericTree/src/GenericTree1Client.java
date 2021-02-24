
public class GenericTree1Client {

	public static void main(String[] args) {
		
		// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
		
		GenericTree1 tree = new GenericTree1();
		
		tree.display();
		
		System.out.println(tree.size());
		
		System.out.println(tree.max());
		
		System.out.println(tree.find(80));
		
		System.out.println(tree.height());

	}

}

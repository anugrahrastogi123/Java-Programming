package GenericClass;

public class Client {

	public static void main(String[] args) {

		Pair<String> pair = new Pair<>();
		pair.one = "abc";
		pair.two = "def";
		
		Pair<Integer> pair1 = new Pair<>();
		pair1.one = 10;
		pair1.two = 20;
		
		PairTwo<Integer, String> pair2 = new PairTwo<>();
		pair2.one = 10;
		pair2.two = "xyz";
		

	}

}

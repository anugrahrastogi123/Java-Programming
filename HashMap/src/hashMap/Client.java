package hashMap;

public class Client {

	public static void main(String[] args) throws Exception {
		
		HashTable<String, Integer> map = new HashTable<String, Integer>(5);
		
		map.put("USA", 200);
		map.put("India", 300);
		map.put("UK", 100);
		map.put("Nepal", 150);
		map.put("Russia", 400);
		
		map.display();
		
		System.out.println(map.get("India"));
		
		System.out.println(map.remove("UK"));
		map.display();

	}

}

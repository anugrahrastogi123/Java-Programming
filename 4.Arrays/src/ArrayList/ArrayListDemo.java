package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(20);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("******");
		
		System.out.println(list.get(3));
		
		list.remove(3);
		System.out.println(list);

	}

}

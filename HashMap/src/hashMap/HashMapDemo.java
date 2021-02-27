package hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("USA", 200);
		map.put("India", 300);
		map.put("UK", 100);
		map.put("Nepal", 150);
		map.put("Russia", 400);
		
		System.out.println(map);
		
		map.put("India", 325);
		System.out.println(map);
		
		System.out.println(map.get("India"));
		System.out.println(map.get("Sweden"));
		
		map.remove("USA");
		System.out.println(map);
		
		System.out.println(map.containsKey("India"));
		
		System.out.println("******Keys******");
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println("******Values******");
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		System.out.println("******EntrySet******");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
		
		System.out.println("******Max Freq Character******");
		String str = "aabbaaabcdda";
		System.out.println(getMaxFreq(str));
		
		System.out.println("******Intersection******");
		int[] arr1 = {5, 1, 3, 4, 7};
		int[] arr2 = {2, 4 , 3 , 5, 7, 10, 15};
		ArrayList<Integer> list = getIntersection(arr1, arr2);
		System.out.println(list);

	}

	private static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], false);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i])) {
				map.put(arr2[i], true);
			}
		}
		
		Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
		
		for(Map.Entry<Integer, Boolean> entry : entries) {
			if(entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		
		return list;
		
	}

	private static char getMaxFreq(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char cc = str.charAt(i); // current character
			
			if(map.containsKey(cc)) {
				int oldVal = map.get(cc);
				int newVal = oldVal + 1;
				map.put(cc, newVal);
			}
			else {
				map.put(cc, 1);
			}
			
		}
		
		char maxchar = '\0';
		int max = 0;
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}
		
		return maxchar;
		
	}

}

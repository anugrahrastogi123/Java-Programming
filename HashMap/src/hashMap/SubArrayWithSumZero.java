package hashMap;

import java.util.HashMap;

public class SubArrayWithSumZero {

	public static void main(String[] args) {
		
		int[] arr = {3, -5, -8, 9, -1};
		System.out.println(subArrayZero(arr));

	}

	public static boolean subArrayZero(int[] arr) {
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		int presum = 0; // prefix sum
		
		for(int i = 0; i < arr.length; i++) {
			presum += arr[i];
			
			if(presum == 0 || map.containsKey(presum)) {
				return true;
			}
			else {
				map.put(presum, true);
			}
		}
		
		return false;
		
	}

}

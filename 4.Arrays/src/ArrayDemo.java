
public class ArrayDemo {

	public static void main(String[] args) {
		
		// declare
		int[] arr = null;
		System.out.println(arr);
		
		// allocate space
		arr = new int[5];
		System.out.println(arr);
		// something like this will be printed -> [I@7d907bac
		// [ -> array, I -> integer, so it is an array of integers followed by the memory location
		
		// get
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		// enhanced for loop
		for(int val : arr) {
			System.out.println(val);
		}
		
		int i = 0, j = 2;
		
		// non working swap
		System.out.println(arr[i]+", "+arr[j]);
		swap(arr[i], arr[j]);
		System.out.println(arr[i]+", "+arr[j]);
		
		System.out.println("Working Swap");
		System.out.println(arr[i]+", "+arr[j]);
		// swap(arr, i ,j);
		System.out.println(arr[i]+", "+arr[j]);
		
		// non working swap
		int[] other = {100, 200, 300};
		System.out.println(arr[0]+", "+other[0]);
		swap(arr, other);
		System.out.println(arr[0]+", "+other[0]);

	}
	
	public static void swap(int[] one, int[] two) {
		
		int[] temp = one;
		one = two;
		two = temp;
	}
	
	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i]+", "+arr[j]);
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		System.out.println(arr[i]+", "+arr[j]);
	}
	
	public static void swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

}

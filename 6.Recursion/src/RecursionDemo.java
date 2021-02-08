
public class RecursionDemo {

	public static void main(String[] args) {
		
		// printDecreasing(5);
		
		// printIncreasing(5);
		
		// printDecreasingIncreasing(5);
		
		// PDISkip(5);
		
		// System.out.println(Fact(6));
		
		// System.out.println(power(3, 5));
		
		// System.out.println(nthFibonacci(7));
		
		// int arr[] = {1, 2, 5, 6};
		// System.out.println(isSorted(arr, 0));
		
		// int arr[] = {6, 8, 1, 1, 8, 3, 4};
		// System.out.println(firstIdx(arr, 0, 1));
		
		// int arr[] = {6, 8, 1, 1, 8, 3, 4};
		// System.out.println(lastIdx(arr, 0, 1));
		
		// pattern(5, 1, 1);
		
		// int arr[] = {5, 4, 3, 2 ,1};
		// bubbleSort(arr, 0, arr.length-1);
		// display(arr);
		
		int[] arr = {3, 8, 1, 8, 8, 4};
		int[] res = allIndices(arr, 0, 8, 0);
		display(res);
		
	}
	
	public static void printDecreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}
	
	public static void printIncreasing(int n) {
		if(n == 0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}
	
	public static void printDecreasingIncreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasingIncreasing(n-1);
		System.out.println(n);
	}
	
	public static void PDISkip(int n) {
		if(n == 0) {
			return;
		}
		
		if(n % 2 == 1) {
			System.out.println(n);
		}
		PDISkip(n-1);
		if(n % 2 == 0) {
			System.out.println(n);
		}
	}
	
	public static int Fact(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		return n * Fact(n-1);
	}
	
	public static int power(int x, int n) {
		
		if(n == 1) {
			return x;
		}
		
		return x * power(x, n-1);
	}
	
	public static int nthFibonacci(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
	
	public static boolean isSorted(int[] arr, int si) {
		
		if(si == arr.length-1)
			return true;
		if(arr[si] > arr[si+1]) {
			return false;
		}
		else {
			return isSorted(arr, si+1);
		}
	}
	
	public static int firstIdx(int[] arr, int si, int data) {
		
		if(si == arr.length)
			return -1;
		if(arr[si] == data)
			return si;
		else
			return firstIdx(arr, si+1, data);
	}
	
	public static int lastIdx(int[] arr, int si, int data) {
		
		if(si == arr.length)
			return -1;
		
		int idx = lastIdx(arr, si+1, data);
		
		if(idx == -1) {
			if(arr[si] == data)
				return si;
			else
				return -1;
		}
		else {
			return idx;
		}
	}
	
	public static void pattern(int n, int row, int col) {
		
		if(row > n)
			return;
		
		if(col > row) {
			System.out.println();
			pattern(n, row+1, 1);
			return;
		}
		
		System.out.print("* ");
		pattern(n, row, col+1);
	}
	
	public static void bubbleSort(int[] arr, int si, int ei) {
		
		if(ei == 0)
			return;
		if(si == ei) {
			bubbleSort(arr, 0, ei-1);
			return;
		}
		if(arr[si] > arr[si+1]) {
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}
		bubbleSort(arr, si+1, ei);
		return;
	}
	
	public static int[] allIndices(int[] arr, int si, int k, int count) {
		
		int res[];
		
		if(si == arr.length) {
			res = new int[count];
			return res;
		}
		
		if(arr[si] == k) {
			res = allIndices(arr, si+1, k, count+1);
			res[count] = si;
		}
		else {
			res = allIndices(arr, si+1, k, count);
		}
		return res;
	}
	
	public static void display(int[] arr) {
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}

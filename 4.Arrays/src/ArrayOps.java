import java.util.Scanner;

public class ArrayOps {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
//		int[] array = takeInput();
//		
//		display(array);
		
//		int[] array = {10, 20, 5, 30, 25};
//		System.out.println(maxInArray(array));
		
//		System.out.println(linearSearch(array, 120));
		
//		int[] array = {2, 5, 9, 34, 55, 60, 78, 89, 100};
//		System.out.println(binarySearch(array, 89));
		
//		int[] arr = {99, 88, 77, 66, 55, 44};
//		bubbleSort(arr);
//		display(arr);
		
		int[] arr = {99, 88, 77, 66, 55, 44, 22, 100};
		// selectionSort(arr);
		insertionSort(arr);
		display(arr);

	}
	
	public static int[] takeInput() {
		
		System.out.println("Size of array ");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
//			System.out.println("Enter the value for "+ i + " index ");
			arr[i] = s.nextInt();
			
		}
		
		return arr;
		
	}
	
	public static void display(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static int maxInArray(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}

	public static int linearSearch(int[] arr, int item) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == item)
				return i;
		}
		
		return -1;
		
	}
	
	public static int binarySearch(int[] arr, int item) {
		
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo <= hi) {
			
			int mid = (lo+hi)/2;
			
			if(arr[mid] < item) {
				lo = mid + 1;
			}
			else if(arr[mid] > item) {
				hi = mid - 1;
			}
			else {
				return mid;
			}
			
		}
		
		return -1;
		
	}
	
	public static void bubbleSort(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = 0; j < arr.length-1-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			
			int min = i;
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[min] > arr[j]) {
					
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int counter = 1; counter < arr.length; counter++) {
			
			int val = arr[counter];
			
			int j = counter-1;
			while(j >= 0 && val < arr[j]) {
				
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = val;
		}
		
	}
	
	
}

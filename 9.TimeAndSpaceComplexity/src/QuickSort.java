
public class QuickSort {

	public static void main(String[] args) {

		//int[] arr = { 6, 5, 4, 3, 2, 1 };
		
		int[] arr = {40, 20, 90, 30, 70, 10, 80, 70, 50};

		sorting(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void sorting(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		// 1. Partitioning
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		int left = lo, right = hi;

		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}

		sorting(arr, lo, right);
		sorting(arr, left, hi);
	}

}


public class MergeSort {

	public static void main(String[] args) {
		
//		int arr1[] = {10,20,30,40,50};
//		int arr2[] = {5,15,30,45,60,70,80};
//		
//		int marr[] = mergeTwoSortedArrays(arr1, arr2);
//		
//		for(int val: marr) {
//			System.out.print(val+" ");
//		}
		
		int[] arr = {6,5,4,3,2,1};
		
		int[] merged = sorting(arr, 0, arr.length-1);
		
		for(int val : merged) {
			System.out.print(val + " ");
		}

	}
	
	public static int[] sorting(int[] arr, int lo, int hi) {
		
		if(lo == hi) {
			int[] newarr = new int[1];
			newarr[0] = arr[lo];
			return newarr;
		}
		
		int mid = (lo + hi)/2;
		
		int[] fh = sorting(arr, lo, mid);
		int[] sh = sorting(arr, mid+1, hi);
		
		int[] merged = mergeTwoSortedArrays(fh, sh);
		
		return merged;
	}
	
	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		
		int m = arr1.length;
		int n = arr2.length;
		
		int[] mergedArr = new int[m + n];
		
		int i = 0, j = 0, k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			
			if(arr1[i] > arr2[j]) {
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
			else {
				mergedArr[k] = arr1[i];
				i++;
				k++;
			}
		}
		
		while(i < arr1.length) {
			mergedArr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < arr2.length) {
			mergedArr[k] = arr2[j];
			j++;
			k++;
		}
		
		return mergedArr;
	}

}

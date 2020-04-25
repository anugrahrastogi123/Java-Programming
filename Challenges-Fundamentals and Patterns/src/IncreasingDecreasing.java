import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		incDec(arr);

	}
	
	public static void incDec(int[] arr) {
		
		int i = 0;
		
		// for decreasing sequence
		while(i < arr.length-1) {
			
			if(arr[i] > arr[i+1]) {
				i++;
			}
			else {
				i++;
				break;
			}	
		}
		
		// for increasing sequence
		while(i < arr.length-1) {
			
			if(arr[i] < arr[i+1]) {	
				i++;
			}
			else {
				break;
			}
		}
		
		if(i == arr.length-1)
			System.out.println("true");
		else
			System.out.println("false");
	}

}

import java.util.Scanner;

public class PrimeVisit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int max_size = 1000006;
		
		int[] arr = new int[max_size];
		
		// 0 -> non prime & 1 -> prime
		// mark all even odd as prime
		for(int i = 3; i <= max_size; i += 2) {
			
			arr[i] = 1;
		}
		
		// mark multiple of a number as non prime
		for(long i = 3; i <= max_size; i += 2) {
			
			for(long j = i*i; j < max_size; j += i) {
				
				arr[(int) j] = 0;
			}
		}
		
		arr[2] = 1;
		
		for(int i = 0; i < n; i++) {
			
			int a = s.nextInt();
			int b = s.nextInt();
			int count = 0;
			
			for(int j = a; j <= b; j++) {
				
				if(arr[j] == 1) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
	}

}

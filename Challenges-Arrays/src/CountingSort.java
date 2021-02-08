import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[1000001];
		
		for(int i = 0; i < n; i++) {
			int num = s.nextInt();
			arr[num] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				System.out.print(i+" ");
			}
		}
		

	}

}

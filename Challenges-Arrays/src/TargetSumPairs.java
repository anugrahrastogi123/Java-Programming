import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int target = s.nextInt();
		
		int p1 = 0, p2 = 0;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i]+arr[j] == target) {
					if(arr[i] < arr[j])
						System.out.println(arr[i]+" and  "+arr[j]);
					else
						System.out.println(arr[j]+" and  "+arr[i]);
				}
			}
		}

	}

}

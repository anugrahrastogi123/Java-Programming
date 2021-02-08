import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr_n = new int[n];
		
		for(int i = 0; i < n; i++)
			arr_n[i] = s.nextInt();
		
		int m = s.nextInt();
		int[] arr_m = new int[m];
		
		for(int i = 0; i < m; i++)
			arr_m[i] = s.nextInt();
		
		int max_len = Math.max(n, m);
		
		int sum_arr[] = new int[max_len + 1];
		
		int i = n-1, j = m-1, k = sum_arr.length-1;
		int carry = 0, rem = 0, sum = 0;
		
		while(i >= 0 && j >= 0) {
			
			sum = arr_n[i] + arr_m[j] + carry;
			carry = sum/10;
			rem = sum % 10;
			sum_arr[k] = rem;
			
			i--;
			j--;
			k--;
		}
		
		if(i >= 0) {
			while(i >= 0) {
				
				sum = arr_n[i] + carry;
				carry = sum/10;
				rem = sum % 10;
				sum_arr[k] = rem;
				
				i--;
				k--;
			}
		}
		
		if(j >= 0) {
			while(j >= 0) {
				
				sum = arr_m[j] + carry;
				carry = sum/10;
				rem = sum % 10;
				sum_arr[k] = rem;
				
				j--;
				k--;
			}
		}
		
		sum_arr[0] = carry;
		
		for(int y = 0; y < sum_arr.length; y++) {
			if(y == 0 && sum_arr[0] == 0)
				continue;
			else
				System.out.print(sum_arr[y]+", ");
		}
		System.out.println("END");
		

	}

}

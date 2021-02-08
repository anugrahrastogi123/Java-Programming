import java.util.Scanner;

public class FormBiggestNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
			
			int n = s.nextInt();
			String[] arr = new String[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = s.next();
			}
			
			for(int i = 0; i < n-1; i++) {
				for(int j = 0; j < n-i-1; j++) {
					
					String ab = arr[j] + arr[j+1];
					String ba = arr[j+1] + arr[j];
					
					if(Long.parseLong(ab) < Long.parseLong(ba)) {
						String temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			for(int i = 0; i < n; i++)
				System.out.print(arr[i]);
			
			System.out.println();
		}
		
		s.close();

	}

}

import java.util.Scanner;

// 11
public class Fibonacci {
	// Print the Fibonacci Series

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int a = 0; // 0th number
		int b = 1; // 1st number
	
		int counter = 1;
		
		while(counter <= n+1) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
			
			counter += 1;
			
		}

	}

}

import java.util.Scanner;

public class FibonacciPatternPattern4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nst = 1;
		int a = 0, b = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			
			// work
			for(int cst = 1; cst <= nst; cst++) {
				
				System.out.print(a+"\t");
				int c = a + b;
				a = b;
				b = c;
			}
			
			// prep
			System.out.println();
			nst++;
		}

	}

}

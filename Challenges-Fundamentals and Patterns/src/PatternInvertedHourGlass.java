import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = 1;
		int nsp = 2 * n - 1;

		// row
		for (int row = 1; row <= 2 * n + 1; row++) {
			
			int val = n;

			// work stars
			for (int cst = 1; cst <= nst; cst++) {

				System.out.print(val+" ");
				val--;
			}
			// work spaces
			for (int csp = 1; csp <= nsp; csp++) {

				System.out.print("  ");
			}
			// work stars
			int cst = 1;
			val++;
			if(row == (2*n+2)/2) {
				
				cst = 2;
				val = 1;
			}
			for (; cst <= nst; cst++) {

				System.out.print(val+" ");
				val++;
			}
			
			// prep
			System.out.println();
			if(row < (2*n+2)/2) {
				nst++;
				nsp -= 2;
			}
			else {
				nst--;
				nsp += 2;
			}
		}

	}

}

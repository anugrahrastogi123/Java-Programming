import java.util.Scanner;

/*
 			1 
		2 1   1 2 
	3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
	3 2 1       1 2 3 
		2 1   1 2 
			1

 */

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nsp1 = n - 1;
		int nst = 1;
		int nsp2 = -1;

		// row
		for (int row = 1; row <= n; row++) {

			// work spaces
			for (int csp1 = 1; csp1 <= nsp1; csp1++) {

				System.out.print("  ");
			}
			// work stars
			int i = nst;
			for (int cst = 1; cst <= nst; cst++) {

				System.out.print(i+" ");
				i--;
			}
			// work spaces
			for (int csp2 = 1; csp2 <= nsp2; csp2++) {

				System.out.print("  ");
			}
			// work stars
			int cst = 1;
			if(row == 1 || row == n)
				cst = 2;
			for (; cst <= nst; cst++) {

				System.out.print(cst+" ");
			}
			
			//prep
			System.out.println();
			if(row <= n/2) {
				
				nsp1 -= 2;
				nst++;
				nsp2 += 2;
			}
			else {
				
				nsp1 += 2;
				nst--;
				nsp2 -= 2;
			}
		}

	}

}

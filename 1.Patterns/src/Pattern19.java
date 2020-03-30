import java.util.Scanner;

/*
   	Print this pattern-
   	n = 7
   	
    *******
    *** ***
    **   **
    *     *
    **   **
    *** ***
    *******     
   		
 */
public class Pattern19 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n/2;
		int nsp = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				if(csp == 1 || csp == nsp) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			// work stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep
			System.out.println();
			if(row <= n/2) {
				nst--;
				nsp += 2;
			}
			else {
				nst++;
				nsp -= 2;
			}
		}

	}

}

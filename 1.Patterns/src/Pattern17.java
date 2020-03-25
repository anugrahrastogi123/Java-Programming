import java.util.Scanner;

/*
   	Print this pattern-
   	n = 7
   	
   	*** *** 
   	**   **
   	*     *

   	*     *
   	**   **
   	*** ***
   		
 */
public class Pattern17 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n/2;
		int nsp = 1;
		
		// rows
		int row = 1;
		while(row <= n) {
			// stars work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// spaces work
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// stars work
			cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// prep
			System.out.println();
			if(row <= n/2) {
				nsp += 2;
				nst--;
			}
			else {
				nsp -= 2;
				nst++;
			}
			row++;
		}

	}

}

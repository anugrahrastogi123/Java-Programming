import java.util.Scanner;

/*
   	Print this pattern-
   	n = 4
   	
   		  *
   		* *
   	  * * *
   	* * * *
   		
 */
public class Pattern4While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// initialize
		int nsp = n-1; // no. of spaces
		int nst = 1; // no. of stars
		
		// row
		int row = 1;
		while(row <= n) {
			
			// space work
			int csp = 1; // count of spaces
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			// stars work
			int cst = 1; // count of stars
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// preparation
			System.out.println();
			nst++;
			nsp--;
			row++;
		}

	}

}

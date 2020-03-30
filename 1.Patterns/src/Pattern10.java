import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
   	* * * * * * * * *
   	  * * * * * * *
   	    * * * * * 
   	      * * *
            *   		
 */
public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = 0;
		int nst = 2*n - 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// work stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// Prep
			System.out.println();
			nsp++;
			nst -= 2;
		}
		
	}

}

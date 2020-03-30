import java.util.Scanner;

/*
   	Print this pattern-
   	n = 4
   	
          *
   	    * *
   	  * * *
   	* * * *
   	  * * *
   	    * *
   	      * 
   		
 */
public class Pattern14 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		int row = 2*n - 1;
		
		// row
		for(int r = 1; r <= row; r++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			//work stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep
			System.out.println();
			if(r < n) {
				nsp--;
				nst++;
			}
			else {
				nsp++;
				nst--;
			}
		}

	}

}

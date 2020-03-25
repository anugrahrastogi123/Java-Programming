import java.util.Scanner;

/*
   	Print this pattern-
   	n = 4
   	
   	* * * *
   	  * * *
   	    * *
   	      *  
   		
 */
public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// initialize
		int nsp = 0; // no. of spaces
		int nst = n; // no. of stars
		
		// row
		int row = 1;
		while(row <= n) {
			// space work
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// stars work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nsp++;
			nst--;
			row++;
		}

	}

}

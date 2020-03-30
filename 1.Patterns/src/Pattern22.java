import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   
   	*********
   	**** ****
   	***   ***
   	**     **
   	*       * 
   		
 */
public class Pattern22 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n;
		int nsp = 0;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// work stars
			int cst = 1;
			if(row == 1) {
				cst = 2;
			}
			for(; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep
			System.out.println();
			if(row == 1) {
				nst--;
				nsp++;
			}
			else {
				nst--;
				nsp += 2;
			}
		}

	}

}

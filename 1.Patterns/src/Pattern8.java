import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
  *       *
    *   *
      *
    *   *
  *       *    
   		
 */
public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = 0;
		int nst = n;
		
		// row
		for(int row = 1; row <= n; row++) {
//			// work spaces
//			for(int csp = 1; csp <= nsp; csp++) {
//				System.out.print(" ");
//			}
//			// work stars
//			for(int cst = 1; cst <= nst; cst++) {
//				System.out.print("*");
//			}
			
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			// work stars
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == 1 || cst == nst) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			// Prep
			System.out.println();
			if(row >= n/2 + 1) {
				nsp--;
				nst += 2;
			}
			else {
				nsp++;
				nst -= 2;
			}
		}

	}

}

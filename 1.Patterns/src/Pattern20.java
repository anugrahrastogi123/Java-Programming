import java.util.Scanner;

/*
   	Print this pattern-
   	n = 7
   	
       *
      * *
     *   *
    *     *
     *   *
      * *
       *     
   		
 */
public class Pattern20 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n/2;
		int nst = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
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
			// prep
			System.out.println();
			if(row <= n/2) {
				nst += 2;
				nsp--;
			}
			else {
				nst -= 2;
				nsp++;
			}
		}

	}

}

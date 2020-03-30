import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
    	*****
       ****
      ***
     **
    *
     **
      ***
       ****
        ***** 
   		
 */
public class Pattern16 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int nst = n;
		
		// row
		for(int row = 1; row <= 2*n-1; row++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// work stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep
			System.out.println();
			if(row <= (2*n-1)/2) {
				nsp--;
				nst--;
			}
			else {
				nsp++;
				nst++;
			}
		}
		
	}

}

import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
    * * * * *
        * * * *
            * * *
                * *
                	*
   		
 */
public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = 0;
		int nst = n;
		
		//row
		for(int row = 1; row <= n; row++) {
			//spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep
			System.out.println();
			nsp += 2;
			nst--;
		}

	}

}

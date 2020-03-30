import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   
   		1
      1 2 3
	1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
   		
 */
public class Pattern26 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1;
		int nsp = n-1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// work
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print(cst);
			}
			// prep
			System.out.println();
			nst += 2;
			nsp--;
		}

	}

}

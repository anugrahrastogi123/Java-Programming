import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   
   		1
      2 0 2
    3 0 0 0 3
  4 0 0 0 0 0 4
5 0 0 0 0 0 0 0 5
   		
 */
public class Pattern29 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// work numbers
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == 1 || cst == nst)
					System.out.print(row + "\t");
				else
					System.out.print(0 + "\t");
			}
			//prep
			System.out.println();
			nsp--;
			nst += 2;
		}

	}

}

import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   
   		1
	  2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
   		
 */
public class Pattern28 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		int val;
		
		// row
		for(int row = 1; row <= n; row++) {
			val = row;
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// work numbers
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if(cst <= nst/2) {
					val++;
				}
				else {
					val--;
				}
			}
			//prep
			System.out.println();
			nsp--;
			nst += 2;
		}

	}

}

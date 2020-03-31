import java.util.Scanner;

/*
   	Print this pattern-
   	n = 10
   
	   				0
				  9 0 9
				8 9 0 9 8
			  7 8 9 0 9 8 7
			6 7 8 9 0 9 8 7 6
		  5 6 7 8 9 0 9 8 7 6 5
		4 5 6 7 8 9 0 9 8 7 6 5 4
	  3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
	2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
   		
 */
public class Pattern33 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		int val = n;
		int num = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// work numbers
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == num)
					System.out.print(0);
				else if(cst <= nst/2) {
					System.out.print(val);
					val++;
				}
				else {
					val--;
					System.out.print(val);
				}
			}
			// prep
			System.out.println();
			num++;
			val--;
			nsp--;
			nst += 2;
		}

	}

}



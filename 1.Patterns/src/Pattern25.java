import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
   	             1
   	          2  3  4
   	      5   6  7  8  9 
   	   10 11 12 13 14 15 16
   	17 18 19 20 21 22 23 24 25
   		
 */
public class Pattern25 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int no = 1;
		int val = 1;
		
		for(int row = 1; row <= n; row++) {
			// spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// number
			for(int cno = 1; cno <= no; cno++) {
				System.out.print(val + "\t");
				val++;
			}
			// prep
			System.out.println();
			nsp--;
			no += 2;
		}

	}

}

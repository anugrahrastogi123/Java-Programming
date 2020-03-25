import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
   	    1
   	   111
   	  11111
   	 1111111
   	111111111
   		
 */
public class Pattern23 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int no = 1;
		
		for(int row = 1; row <= n; row++) {
			// spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// number
			for(int cno = 1; cno <= no; cno++) {
				System.out.print("1");
			}
			// prep
			System.out.println();
			nsp--;
			no += 2;
		}

	}

}

import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
   	    1
   	   222
   	  33333
   	 4444444
   	555555555
   		
 */
public class Pattern24 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int no = 1;
		int val = 1;
		
		for(int row = 1; row <= n; row++) {
			// spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// number
			for(int cno = 1; cno <= no; cno++) {
				System.out.print(val);
			}
			// prep
			System.out.println();
			nsp--;
			no += 2;
			val++;
		}

	}

}

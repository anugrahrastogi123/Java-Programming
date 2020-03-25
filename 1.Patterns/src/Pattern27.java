import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
   	    1
   	   121
   	  12321
   	 1234321
   	123454321
   		
 */
public class Pattern27 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n-1;
		int no = 1;
		int val;
		
		for(int row = 1; row <= n; row++) {
			val = 1;
			// spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// number
			for(int cno = 1; cno <= no; cno++) {
				System.out.print(val + "\t");
				
				if(cno <= no/2)
					val++;
				else
					val--;
			}
			// prep
			System.out.println();
			nsp--;
			no += 2;
		}

	}

}

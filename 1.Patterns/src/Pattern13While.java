import java.util.Scanner;

/*
   	Print this pattern-
   	n = 4
   	
    *
   	* *
   	* * *
   	* * * *
   	* * *
   	* *
   	* 
   		
 */
public class Pattern13While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nr = 2*n - 1; // no. of rows to be printed
		int nst = 1; // no. of stars
		
		// row
		int row = 1;
		while(row <= nr) {
			// work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// prep
			System.out.println();
			if(row <= nr/2) {
				nst++;
			}
			else {
				nst--;
			}
			row++;
		}

	}

}

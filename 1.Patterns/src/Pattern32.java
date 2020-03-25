import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
    1
   	2 * 2
   	3 * 3 * 3
   	4 * 4 * 4 * 4
   	5 * 5 * 5 * 5 * 5
   	4 * 4 * 4 * 4
   	3 * 3 * 3
   	2 * 2
   	1
   		
 */
public class Pattern32 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nr = 2*n - 1; // no. of rows to be printed
		int nst = 1; // no. of stars
		int val = 1;
		
		// row
		int row = 1;
		while(row <= nr) {
			// work
			int cst = 1;
			while(cst <= nst) {
				if(cst%2 != 0)
					System.out.print(val);
				else
					System.out.print("*");
				cst++;
			}
			
			// prep
			System.out.println();
			if(row <= nr/2) {
				nst += 2;
				val++;
			}
			else {
				nst -= 2;
				val--;
			}
			row++;
		}

	}

}

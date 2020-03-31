import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   
   	5 4 3 2 1
	5 4 3 2 1
	5 4 3 2 1
	5 4 3 2 1
	5 4 3 2 1
   		
 */
public class Pattern30 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int val;
		
		// row
		for(int row = 1; row <= n; row++) {
			val = n;
			// work numbers
			for(int cst = 1; cst <= n; cst++) {
				System.out.print(val);
				val--;
			}
			// prep
			System.out.println();
		}

	}

}

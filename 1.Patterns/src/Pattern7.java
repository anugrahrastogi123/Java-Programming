import java.util.Scanner;

/*
   	Print this pattern-
   	n = 5
   	
    * * * * *
    * 		*
    *		*
    * 		*
    * * * * *
   		
 */
public class Pattern7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// row
		for(int row = 1; row <= n; row++) {
			// 1st and last row
			if(row == 1 || row == n) {
				for(int cst = 1; cst <= n; cst++) {
					System.out.print("*");
				}
				System.out.println();
			}
			// remaining rows
			else {
				for(int i = 1; i <= n; i++) {
					if(i == 1 || i == n) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}

}

import java.util.Scanner;

/*
   	Print this pattern-
   	n = 4
   	
   		  *
   		* *
   	  * * *
   	* * * *
   		
 */
public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// row
		for(int i = 1; i <= n; i++) {
			// spaces
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			// stars
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

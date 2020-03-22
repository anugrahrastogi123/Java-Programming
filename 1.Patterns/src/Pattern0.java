import java.util.Scanner;

public class Pattern0 {
	/**
	 Print this pattern-
		 *
		 *
		 *
		 *
		 *
	 **/

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int row = 1; row <= n; row++) {
			// Work
			System.out.print("*");
			
			// Preparation
			System.out.print("\n");
		}

	}

}

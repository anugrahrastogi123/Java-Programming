import java.util.Scanner;

public class ManmohanLovesPatterns1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;

		// row
		for (int row = 1; row <= n; row++) {
			// work
			for (int cst = 1; cst <= nst; cst++) {
				if (row % 2 != 0) {
					System.out.print(1);
				} 
				else {
					if (cst == 1 || cst == nst)
						System.out.print(1);
					else
						System.out.print(0);
				}
			}
			// prep
			System.out.println();
			nst++;
		}

	}

}

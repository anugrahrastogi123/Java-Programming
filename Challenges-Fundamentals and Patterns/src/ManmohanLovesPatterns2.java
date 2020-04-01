import java.util.Scanner;

public class ManmohanLovesPatterns2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nst = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work numbers
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == 1 || cst == nst) {
					if(row == 1)
						System.out.print(1);
					else
						System.out.print(row-1);
				}
				else
					System.out.print(0);
			}
			// prep
			System.out.println();
			nst++;
		}

	}

}

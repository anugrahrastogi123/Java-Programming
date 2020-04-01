import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nsp = n-1;
		int nst = n;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// work stars
			for(int cst =1; cst <= nst; cst++) {
				if(row == 1 || row == n) {
					System.out.print("*");
				}
				else {
					if(cst == 1 || cst == nst) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			// prep
			System.out.println();
			nsp--;
			
		}

	}

}

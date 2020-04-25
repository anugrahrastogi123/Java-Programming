import java.util.Scanner;

public class GaneshasPattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nsp = (n - 3) / 2;
		int nst = (n + 1) / 2;

		// 1st component
		System.out.print("*");
		for (int csp = 1; csp <= nsp; csp++) {

			System.out.print(" ");
		}
		for (int cst = 1; cst <= nst; cst++) {

			System.out.print("*");
		}
		System.out.println();

		// 2nd component
		for (int i = 1; i <= (n - 3) / 2; i++) {
			
			for(int j = 1; j <= (n-3)/2 + 2; j++) {
				
				if (j == 1 || j == (n - 3) / 2 + 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		// 3rd component
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();

		// 4th component
		for(int i = 1; i <= (n-3)/2; i++) {
			
			for(int j = 1; j <= n; j++) {
				
				if(j == (n+1)/2 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// 5th component
		for (int cst = 1; cst <= nst; cst++) {

			System.out.print("*");
		}
		for (int csp = 1; csp <= nsp; csp++) {

			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		

	}

}

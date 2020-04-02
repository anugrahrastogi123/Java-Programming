import java.util.Scanner;

public class PatternwithZeros {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nst = 1;
		
		// row
		for(int row = 1; row <= n; row++) {
			// work numbers
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == 1 || cst == nst) {
					System.out.print(row + "\t");
				}
				else {
					System.out.print(0 + "\t");
				}
			}
			// prep
			System.out.println();
			nst++;
		}

	}

}

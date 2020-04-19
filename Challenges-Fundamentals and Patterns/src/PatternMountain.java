import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nst = 1;
		int nsp = 2*n-3;
		
		for(int row = 1; row <= n; row++) {
			
			// work number
			for(int cst = 1; cst <= nst; cst++) {
				
				System.out.print(cst+"\t");
			}
			// work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				
				System.out.print("\t");
			}
			// work number
			int cst = nst;
			if(row == n)
				cst = nst-1;
			for(; cst > 0; cst--) {
				
				System.out.print(cst+"\t");
			}
			
			// prep
			System.out.println();
			nst++;
			nsp -= 2;
		}

	}

}

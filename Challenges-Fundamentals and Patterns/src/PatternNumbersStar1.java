import java.util.Scanner;

public class PatternNumbersStar1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nos = n;
		int nst = 0;
		
		// row
		for(int row = 1; row <= n; row++) {
			
			// numbers
			for(int cno = 1; cno <= nos; cno++) {
				
				System.out.print(cno+" ");
			}
			// stars
			for(int cst = 1; cst <= nst-1; cst++) {
				
				System.out.print("*" + " ");
			}
			
			//prep
			System.out.println();
			nos--;
			nst += 2;
		}
		
	}

}

import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nsp = 0;
		int nst = 2*n + 1;
		int val = n;
		
		// row
		for(int row = 1; row <= 2*n+1; row++) {
			
			int num = val;
			
			//work spaces
			for(int csp = 1; csp <= nsp; csp++) {
				
				System.out.print(" ");
			}
			//work stars
			for(int cst = 1; cst <= nst; cst++) {
				
				System.out.print(num+" ");
				
				if(cst < ((nst)/2)+1) {
					
					num--;
				}
				else {
					
					num++;
				}
			}
			
			// prep
			System.out.println();
			if(row < ((2*n+1)/2)+1) {
				
				nsp += 2;
				nst -= 2;
				val--;
			}
			else {
				
				nsp -= 2;
				nst += 2;
				val++;
			}
		}

	}

}

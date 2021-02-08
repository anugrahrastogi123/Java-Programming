import java.util.Scanner;

public class KthROOT {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
			
			long n = s.nextLong();
			long k = s.nextLong();
			
			System.out.println( (int) Math.floor(Math.pow(n, (float)1.0/k)));
		}
		

	}

}

import java.util.Scanner;

public class PrateekLovesCandy {

	public static void main(String[] args) {
		
		// Naive Approach - got TLE - complexity is O(N*sqrt(N))
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(); // no. of test cases
		
		for(int i = 1; i <= t; i++) {
			
			int n = s.nextInt(); // no. of primes required
			int count = 0;
			int num = 1;
			
			while(count != n) {
				num++;
				boolean flag = true;
				if(num == 2) {
					flag = true;
				}
				else {
					for(int j = 2; j*j <= num; j++) {
						if(num % j == 0) {
							flag = false; // num is not prime
							break;
						}
					}
				}
				if(flag == true) { // num is prime
					System.out.println(num);
					count++;
				}
			}
			System.out.println(num);
			
		}

	}

}

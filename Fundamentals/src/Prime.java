import java.util.Scanner;

// 10
public class Prime {
	// Check whether a number is Prime or not

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		boolean flag = true;
		int div = 2;
		
		while(div <= n-1) {
			if(n % div == 0) {
				flag = false;
			}
			div += 1;
		}
		
		if(flag == true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Non Prime");
		}

	}

}

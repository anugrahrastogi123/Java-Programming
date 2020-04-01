import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = n;
		
		while(sum >= 0) {
			System.out.println(n);
			n = s.nextInt();
			sum += n;
		}

	}

}

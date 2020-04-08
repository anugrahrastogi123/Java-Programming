import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int digit = s.nextInt();
		
		int count = 0;
		
		while(number != 0) {
			int d = number % 10;
			number /= 10;
			if(d == digit)
				count++;
		}
		System.out.println(count);

	}

}

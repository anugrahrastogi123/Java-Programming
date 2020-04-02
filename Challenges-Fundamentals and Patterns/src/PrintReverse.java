import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int reverse_num = 0;
		
		while(n != 0) {
			int digit = n % 10;
			n = n / 10;
			reverse_num = reverse_num*10 + digit;
		}
		System.out.println(reverse_num);

	}

}

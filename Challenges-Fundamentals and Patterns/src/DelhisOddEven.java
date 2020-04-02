import java.util.Scanner;

public class DelhisOddEven {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			int car_num = s.nextInt();
			
			int even_sum = 0;
			int odd_sum = 0;
			
			while(car_num != 0) {
				int digit = car_num % 10;
				car_num /= 10;
				if(digit % 2 == 0)
					even_sum += digit;
				else
					odd_sum += digit;
			}
			if(even_sum % 4 == 0 || odd_sum % 3 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}

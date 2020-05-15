import java.util.Scanner;

public class ChewbaccaAndNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		
		long pow_ten = 1;
		long new_num = 0;
		
		while(num > 0) {
			
			long digit = num % 10;
			
			if(9-digit < digit && num != 9) {
				new_num += (9-digit) * pow_ten; 
			}
			else {
				new_num += digit * pow_ten;
			}
			
			num = num / 10;
			pow_ten *= 10;
		}
		
		System.out.println(new_num);

	}

}

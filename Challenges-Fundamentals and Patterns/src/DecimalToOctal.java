import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int decimal = s.nextInt();
		
		int octal = 0, power = 1;
		
		while(decimal != 0) {
			
			int rem = decimal % 8;
			decimal = decimal / 8;
			
			octal = octal + rem*power;
			power *= 10;
		}
		
		System.out.println(octal);

	}

}

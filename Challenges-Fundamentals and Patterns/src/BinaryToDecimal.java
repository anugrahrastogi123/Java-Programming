import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		
		int decimal = 0, power = 1;
		
		while(binary != 0) {
			
			int rem = binary % 10;
			binary = binary / 10;
			
			decimal = decimal + rem*power;
			power *= 2;
		}
		
		System.out.println(decimal);

	}

}

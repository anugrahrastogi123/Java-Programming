import java.util.Scanner;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int row = 1; row <= n; row++) {
			
			int binary = s.nextInt();
			int decimal = 0;
			int power_2 = 1;
			
			while(binary != 0) {
				int bit = binary % 10;
				binary = binary / 10;
				decimal = decimal + bit*power_2;
				power_2 = power_2 * 2;
			}
			System.out.println(decimal);
		}

	}

}

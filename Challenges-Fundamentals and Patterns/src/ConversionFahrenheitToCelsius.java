import java.util.Scanner;

public class ConversionFahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		int step = s.nextInt();
		
		// celsius
		int c;

		for (int f = min; f <= max; f += step) {
			c = (int) ((5.0 / 9) * (f - 32));
			System.out.println(f + "\t" + c);
		}

	}

}

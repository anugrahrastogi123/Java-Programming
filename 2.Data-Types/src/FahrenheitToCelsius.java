// 2
public class FahrenheitToCelsius {
	/*
	 * Convert Fahrenheit (from 0 to 300) to Celsius using the formula C = (5/9)(F-32)
	 */

	public static void main(String[] args) {

		// celsius
		int c;

		for (int f = 0; f <= 300; f += 20) {
			c = (int) ((5.0 / 9) * (f - 32));
			System.out.println(f + "\t" + c);
		}

	}

}

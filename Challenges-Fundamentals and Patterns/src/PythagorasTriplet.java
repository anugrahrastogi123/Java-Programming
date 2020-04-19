import java.util.Scanner;

public class PythagorasTriplet {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int m, n, base, height, hypotenuse;

		if (N % 2 == 0) { // N is even

			m = N / 2;
			n = 1;
			base = m * m - n * n;
			height = 2 * m * n;
			hypotenuse = m * m + n * n;

			if (base * base + height * height == hypotenuse * hypotenuse && base != 0) {

				System.out.println(base + " " + hypotenuse);
			} else {
				System.out.println(-1);
			}
		} else { // N is odd

			m = (N + 1) / 2;
			n = (N - 1) / 2;
			base = m * m - n * n;
			height = 2 * m * n;
			hypotenuse = m * m + n * n;

			if (base * base + height * height == hypotenuse * hypotenuse && height != 0) {

				System.out.println(height + " " + hypotenuse);
			} else {
				System.out.println(-1);
			}
		}

	}

}

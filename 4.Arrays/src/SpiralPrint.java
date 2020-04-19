import java.util.Scanner;

public class SpiralPrint {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = takeInput();

		displaySpiral(arr);

	}

	public static int[][] takeInput() {

		int rows = s.nextInt();
		int cols = s.nextInt();

		int[][] arr = new int[rows][cols];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++)

				arr[i][j] = s.nextInt();
		}

		return arr;
	}

	public static void displaySpiral(int[][] arr) {

		int top = 0, left = 0, right = arr[top].length - 1, bottom = arr.length - 1;
		int total_ele = (bottom + 1) * (right + 1);
		int count = 0;

		while (count != total_ele) {

			for (int i = left; i <= right; i++) {

				System.out.print(arr[top][i] + " ");
				count++;
			}
			top++;
			
			for (int i = top; i <= bottom; i++) {

				System.out.print(arr[i][right] + " ");
				count++;
			}
			right--;

			for (int i = right; i >= left; i--) {

				System.out.print(arr[bottom][i] + " ");
				count++;
			}
			bottom--;

			for (int i = bottom; i >= top; i--) {

				System.out.print(arr[i][left] + " ");
				count++;
			}
			left++;

		}
	}

}

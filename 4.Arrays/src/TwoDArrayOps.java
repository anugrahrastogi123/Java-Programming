import java.util.Scanner;

public class TwoDArrayOps {

	public static void main(String[] args) {

		int[][] arr = takeInput();
		display(arr);
		
		System.out.println("******");
		
		int[][] a = {{1, 2, 3}, {4, 5}, {6}};
		display(a);

	}

	private static int[][] takeInput() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows ");
		int row = s.nextInt();
		int[][] arr = new int[row][];
		for (int i = 0; i < row; i++) {

			System.out.println("Enter no. of cols for row " + i);
			int cols = s.nextInt();
			arr[i] = new int[cols];
			for (int col = 0; col < cols; col++) {

				System.out.println("Enter the value for row " + i + " and col " + col);
				arr[i][col] = s.nextInt();
			}
		}

		return arr;
	}

	private static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

}

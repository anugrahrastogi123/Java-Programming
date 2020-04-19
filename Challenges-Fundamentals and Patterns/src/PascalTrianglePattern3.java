import java.util.Scanner;

public class PascalTrianglePattern3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[][] arr = new int[n][n];
		
		// row
		for(int row = 0; row < n; row++) {
			
			for(int i = 0; i <= row; i++) {
				
				if(i == 0 || row == i)
					arr[row][i] = 1;
				else
					arr[row][i] = arr[row-1][i] + arr[row-1][i-1];
				System.out.print(arr[row][i] + "\t");
			}
			
			System.out.println();
		}

	}

}

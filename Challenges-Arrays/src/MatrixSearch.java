import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // row
		int m = s.nextInt(); // column
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		int x = s.nextInt();

		int ans = searchMatrix(arr, n, m, x);
		
		System.out.println(ans);

	}
	
	public static int searchMatrix(int[][] arr, int n, int m, int x) {
		
		// top-right corner 
		int i = 0; 
		int j = m-1;
		
		while(i < n && j >= 0) {
			
			if(arr[i][j] == x) {
				return 1;
			}
			else if(x > arr[i][j]) {
				i++;
			}
			else {
				j--;
			}
		}
		
		return 0;
	}

}

























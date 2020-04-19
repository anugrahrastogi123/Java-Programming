import java.util.Scanner;

public class WavePrint {
	
	 static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] arr = takeInput();
		
		displayWave(arr);

	}
	
	public static int[][] takeInput(){
		
		int rows = s.nextInt();
		int cols = s.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < cols; j++)
				
				arr[i][j] = s.nextInt();
		}
		
		return arr;
	}
	
	public static void displayWave(int[][] arr) {
		
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i = 0; i < row; i++) {
			
			if(i % 2 == 0) {
				for(int j = 0; j < col; j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j = col-1; j >= 0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	
}

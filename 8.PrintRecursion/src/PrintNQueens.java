
public class PrintNQueens {

	public static void main(String[] args) {
		
		boolean board[][] = new boolean[4][4];
		
		printNQueens(board, 0);

	}

	public static void printNQueens(boolean[][] board, int row) {

		if (row == board.length) {
			
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j]) {
						System.out.print("Q" + " ");
					}
					else {
						System.out.print(0 + " ");
					}
				}
				System.out.println();
			}
			
			System.out.println();
			
			return;
		}

		for (int col = 0; col < board[row].length; col++) {

			if (isItSafe(board, row, col)) {

				board[row][col] = true;
				printNQueens(board, row + 1);
				board[row][col] = false;
			}
		}

		return;
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;
	}

}

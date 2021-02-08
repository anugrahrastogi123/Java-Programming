
public class QueenCombination2DKill {

	public static void main(String[] args) {
		
		queenCombinationKill(new boolean[3][4], 0, 0, 0, 3, "");
	}
	
	public static void queenCombinationKill(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		
		// positive base case
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		// manually change the variable
		if(col == board[0].length) {
			row++;
			col = 0;
		}
		
		// negative base case
		if(row == board.length) {
			return;
		}
		
		// is it safe to place the queen
		if(isItSafeToPlaceTheQueen(board, row, col)) {
			board[row][col] = true;
			queenCombinationKill(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
			board[row][col] = false;
		}
		
		// not place
		queenCombinationKill(board, row, col+1, qpsf, tq, ans);
	}

	private static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
		
		// vertically upward
		int r = row - 1;
		int c = col;
		while(r >= 0) {
			if(board[r][c]) {
				return false;
			}
			r--;
		}
		
		// horizontally left
		r = row;
		c = col - 1;
		while(c >= 0) {
			if(board[r][c]) {
				return false;
			}
			c--;
		}
		
		// upper left diagonal
		r = row - 1;
		c = col - 1;
		while(r >= 0 && c >= 0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		
		// upper right diagonal
		r = row - 1;
		c = col + 1;
		while(r >= 0 && c < board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}

}
